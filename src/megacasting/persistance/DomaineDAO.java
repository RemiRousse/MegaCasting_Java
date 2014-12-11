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

/**
 *
 * @author Mousse
 */
public class DomaineDAO {
    
    public void insert(Connection cnx, Domaine domaine) {

        Statement stmt = null;
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("INSERT INTO Domaine (Libelle) "
                    + "VALUES (?)");
            pstmt.setString(1, domaine.getLibelle());

            int nb = pstmt.executeUpdate();

            if (nb == 1) {
                stmt = cnx.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) FROM Domaine");
                if (rs.next()) {
                    long id = rs.getLong(1);
                    domaine.setIdentifiant(id);
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

    public void update(Connection cnx, Domaine domaine) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("UPDATE Domaine SET "
                    + "Libelle = ? "
                    + "WHERE Identifiant = ?");
            pstmt.setString(1, domaine.getLibelle());
            pstmt.setLong(2, domaine.getIdentifiant());

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

    public void delete(Connection cnx, Domaine domaine) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("DELETE FROM Domaine "
                    + "WHERE Identifiant = ?");
            pstmt.setLong(1, domaine.getIdentifiant());
            
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

    public Collection<Domaine> list(Connection cnx) {
        Set<Domaine> set = new HashSet<Domaine>();
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant, Libelle "
                    + "FROM Domaine");
            
            while (rs.next()) {                
                Domaine domaine = new Domaine(rs.getLong("Identifiant"), rs.getString("Libelle"));
                set.add(domaine);
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
    
    public Domaine find(Connection cnx, long id) {
        Domaine domaine = null;
        
        PreparedStatement pstmt = null;
        
        try {
            pstmt = cnx.prepareStatement("SELECT Identifiant, Libelle "
                    + " FROM Domaine "
                    + " WHERE Identifiant = ?");
            pstmt.setLong(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                domaine = new Domaine(rs.getLong("Identifiant"), rs.getString("Libelle"));
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
        
        return domaine;
    }
    
    public Domaine findFromLibelle(Connection cnx, String libelle) {
        Domaine domaine = null;
        
        PreparedStatement pstmt = null;
        
        try {
            pstmt = cnx.prepareStatement("SELECT Identifiant, Libelle "
                    + " FROM Domaine "
                    + " WHERE Libelle = ?");
            pstmt.setString(1, libelle);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                domaine = new Domaine(rs.getLong("Identifiant"), rs.getString("Libelle"));
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
        
        return domaine;
    }
}
