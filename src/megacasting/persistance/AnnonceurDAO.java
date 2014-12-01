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
import megacasting.entity.Annonceur;

/**
 *
 * @author Mousse
 */
public class AnnonceurDAO {
    
    public void insert(Connection cnx, Annonceur annonceur) {

        Statement stmt = null;
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("INSERT INTO Annonceur (Nom, Responsable, Siret) "
                    + "VALUES (?, ?, ?)");
            pstmt.setString(1, annonceur.getNom());
            pstmt.setString(2, annonceur.getResponsable());
            pstmt.setString(3, annonceur.getSiret());

            int nb = pstmt.executeUpdate();

            if (nb == 1) {
                stmt = cnx.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) FROM Domaine");
                if (rs.next()) {
                    int id = rs.getInt(1);
                    annonceur.setIdentifiant(id);
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

    public void update(Connection cnx, Annonceur annonceur) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("UPDATE Annonceur SET "
                    + "Nom = ? , Responsable = ? , Siret = ?"
                    + "WHERE Identifiant = ?");
            pstmt.setString(1, annonceur.getNom());
            pstmt.setString(2, annonceur.getResponsable());
            pstmt.setString(3, annonceur.getSiret());
            pstmt.setLong(4, annonceur.getIdentifiant());

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

    public void delete(Connection cnx, Annonceur annonceur) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("DELETE FROM Annonceur "
                    + "WHERE Identifiant = ?");
            pstmt.setLong(1, annonceur.getIdentifiant());
            
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

    public Collection<Annonceur> list(Connection cnx) {
        Set<Annonceur> set = new HashSet<Annonceur>();
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant, Nom, Responsable, Siret "
                    + "FROM Annonceur");
            
            while (rs.next()) {                
                Annonceur annonceur = new Annonceur(rs.getLong("Identifiant"), rs.getString("Nom"), rs.getString("Reponsable"), rs.getString("Siret"));
                set.add(annonceur);
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
    
    public Annonceur find(Connection cnx, long id) {
        Annonceur annonceur = null;
        
        PreparedStatement pstmt = null;
        
        try {
            pstmt = cnx.prepareStatement("SELECT Identifiant, Nom, Reponsable, Siret "
                    + " FROM Annonceur "
                    + " WHERE Identifiant = ?");
            pstmt.setLong(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                annonceur = new Annonceur(rs.getLong("Identifiant"), rs.getString("Nom"), rs.getString("Responsable"), rs.getString("Siret"));
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
        
        return annonceur;
    }
}
