/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import megacasting.entity.Domaine;
import megacasting.entity.Metier;

/**
 *
 * @author Mousse
 */
public class MetierDAO {
    
    public void insert(Connection cnx, Metier metier) {
        
        Statement stmt = null;
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("INSERT INTO Metier (Libelle, IdentifiantDomaine) "
                    + "VALUES (?, ?)");
            pstmt.setString(1, metier.getLibelle());
            pstmt.setLong(2, metier.getDomaine().getIdentifiant());

            int nb = pstmt.executeUpdate();

            if (nb == 1) {
                stmt = cnx.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) FROM Metier");
                if (rs.next()) {
                    int id = rs.getInt(1);
                    metier.setIdentifiant(id);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    
    public void update(Connection cnx, Metier metier) {
        
        PreparedStatement pstmt = null;
        
        try {
            pstmt = cnx.prepareStatement("UPDATE Metier SET "
                    + "Libelle = ?, IdentifiantDomaine = ? "
                    + "WHERE Identifiant = ?");
            pstmt.setString(1, metier.getLibelle());
            pstmt.setLong(2, metier.getDomaine().getIdentifiant());
            pstmt.setLong(3, metier.getIdentifiant());

            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    
    public void delete(Connection cnx, Metier metier) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("DELETE FROM Metier "
                    + "WHERE IDENTIFIANT = ?");
            pstmt.setLong(1, metier.getIdentifiant());
            
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    
    public Collection<Metier> list(Connection cnx) {
        
        Set<Metier> set = new HashSet<Metier>();
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant, Libelle, IdentifiantDomaine "
                    + "FROM Metier");
            
            while (rs.next()) {                
                DomaineDAO d = new DomaineDAO();
                Domaine domaine = d.find(cnx, rs.getInt("IdentifiantDomaine"));
                
                Metier metier = new Metier(rs.getLong("Identifiant"), rs.getString("Libelle"), domaine);
                set.add(metier);
            }
            
        } catch (Exception e) {
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            }
        }
        
        return set;
    }
    
    public Collection<Metier> listOfDomain(Connection cnx, String libelleDomaine) {
        
        Set<Metier> set = new HashSet<Metier>();
        
        PreparedStatement pstmt = null;
        
        DomaineDAO domaineDAO = new DomaineDAO();
        Domaine domaine = domaineDAO.findFromLibelle(cnx, libelleDomaine);
        
        try {
            pstmt = cnx.prepareStatement("SELECT Identifiant, Libelle, IdentifiantDomaine "
                    + "FROM Metier "
                    + "WHERE IdentifiantDomaine = ?");
            
            pstmt.setLong(1, domaine.getIdentifiant());
            
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {                
                DomaineDAO d = new DomaineDAO();
                domaine = d.find(cnx, rs.getInt("IdentifiantDomaine"));
                
                Metier metier = new Metier(rs.getLong("Identifiant"), rs.getString("Libelle"), domaine);
                set.add(metier);
            }
            
        } catch (Exception e) {
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (Exception e) {
                }
            }
        }
        
        return set;
    }
    
    public Metier find(Connection cnx, long id) {
        Metier metier = null;
        
        PreparedStatement pstmt = null;
        
        try {
            
            pstmt = cnx.prepareStatement("SELECT Identifiant, Libelle, IdentifiantDomaine "
                    + "FROM Metier "
                    + "WHERE Identifiant = ?");
            pstmt.setLong(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                
                DomaineDAO d = new DomaineDAO();
                Domaine domaine = d.find(cnx, rs.getLong("IdentifiantDomaine"));
                metier = new Metier(rs.getLong("Identifiant"), rs.getString("Libelle"), domaine);
                
            }
            
        } catch (Exception e) {
        }
        
        return metier;
    }
    
    public Metier findFromLibelle(Connection cnx, String libelle) {
        Metier metier = null;
        
        PreparedStatement pstmt = null;
        
        try {
        	pstmt = cnx.prepareStatement("SELECT Identifiant, Libelle, IdentifiantDomaine "
                    + "FROM Metier "
                    + " WHERE Libelle = ?");
            pstmt.setString(1, libelle);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
            	DomaineDAO d = new DomaineDAO();
                Domaine domaine = d.find(cnx, rs.getLong("IdentifiantDomaine"));
                metier = new Metier(rs.getLong("Identifiant"), rs.getString("Libelle"), domaine);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (Exception e) {
            }

        }
        
        return metier;
    }
}
