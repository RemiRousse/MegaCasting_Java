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
import megacasting.entity.Diffuseur;

/**
 *
 * @author Mousse
 */
public class DiffuseurDAO {
	
    public void insert(Connection cnx, Diffuseur diffuseur) {

        Statement stmt = null;
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("INSERT INTO Diffuseur (Nom, Responsable) "
                    + "VALUES (?, ?, ?)");
            pstmt.setString(1, diffuseur.getNom());
            pstmt.setString(2, diffuseur.getResponsable());

            int nb = pstmt.executeUpdate();

            if (nb == 1) {
                stmt = cnx.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) FROM Diffuseur");
                if (rs.next()) {
                    int id = rs.getInt(1);
                    diffuseur.setIdentifiant(id);
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

    public void update(Connection cnx, Diffuseur diffuseur) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("UPDATE Diffuseur SET "
                    + "Nom = ? , Responsable = ? "
                    + "WHERE Identifiant = ?");
            pstmt.setString(1, diffuseur.getNom());
            pstmt.setString(2, diffuseur.getResponsable());
            pstmt.setLong(3, diffuseur.getIdentifiant());

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

    public void delete(Connection cnx, Diffuseur diffuseur) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("DELETE FROM Diffuseur "
                    + "WHERE Identifiant = ?");
            pstmt.setLong(1, diffuseur.getIdentifiant());
            
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

    public Collection<Diffuseur> list(Connection cnx) {
        Set<Diffuseur> set = new HashSet<Diffuseur>();
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant, Nom, Responsable, Siret "
                    + "FROM Diffuseur");
            
            while (rs.next()) {                
                Diffuseur diffuseur = new Diffuseur(rs.getLong("Identifiant"), rs.getString("Nom"), rs.getString("Reponsable"));
                set.add(diffuseur);
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
    
    public Diffuseur find(Connection cnx, long id) {
        Diffuseur diffuseur = null;
        
        PreparedStatement pstmt = null;
        
        try {
            pstmt = cnx.prepareStatement("SELECT Identifiant, Nom, Reponsable, Siret "
                    + " FROM Diffuseur "
                    + " WHERE Identifiant = ?");
            pstmt.setLong(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                diffuseur = new Diffuseur(rs.getLong("Identifiant"), rs.getString("Nom"), rs.getString("Responsable"));
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
        
        return diffuseur;
    }
}
