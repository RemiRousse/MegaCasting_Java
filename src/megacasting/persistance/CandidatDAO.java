/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting.persistance;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import megacasting.entity.Candidat;
import megacasting.entity.Personne;

/**
 *
 * @author Mousse
 * @author Julien Bureau <julien.bureau02@gmail.com>
 */
public class CandidatDAO {
    
    public void insert(Connection cnx, Candidat candidat) {

        Statement stmt = null;
        PreparedStatement pstmt = null;

        //convert Date into sqlDate
        java.sql.Date sqlDateNaissance = new java.sql.Date(candidat.getDateNaissance().getTime());
        
        try {
            pstmt = cnx.prepareStatement("INSERT INTO Candidat (DateNaissance, Pays, Nom, Prenom) "
                    + "VALUES (?, ?, ?, ?)");
            
            pstmt.setDate(1, sqlDateNaissance);
            pstmt.setString(2, candidat.getPays());
            pstmt.setString(3, candidat.getNom());
            pstmt.setString(4, candidat.getPrenom());

            int nb = pstmt.executeUpdate();

            if (nb == 1) {
                stmt = cnx.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) FROM Candidat");
                if (rs.next()) {
                    long id = rs.getLong(1);
                    candidat.setIdentifiant(id);
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

    public void update(Connection cnx, Candidat candidat) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("UPDATE Candidat SET "
                    + "DateNaissance = ?, Pays = ?, Nom = ?, Prenom = ? "
                    + "WHERE Identifiant = ?");
            pstmt.setDate(1, (Date) candidat.getDateNaissance());
            pstmt.setString(2, candidat.getPays());
            pstmt.setString(3, candidat.getNom());
            pstmt.setString(4, candidat.getPrenom());
            pstmt.setLong(5, candidat.getIdentifiant());

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

    public void delete(Connection cnx, Candidat candidat) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("DELETE FROM Candidat "
                    + "WHERE Identifiant = ?");
            pstmt.setLong(1, candidat.getIdentifiant());
            
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

    public Collection<Candidat> list(Connection cnx) {
        Set<Candidat> set = new HashSet<Candidat>();
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant, DateNaissance, Pays, Nom, Prenom "
                    + " FROM Candidat");
            
            
            while (rs.next()) {
                Candidat candidat = new Candidat(
                		rs.getLong("Identifiant"), 
                		rs.getDate("DateNaissance"), 
                		rs.getString("Pays"), 
                		rs.getString("Nom"), 
                		rs.getString("Prenom"));
                set.add(candidat);
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
    
    public Candidat find(Connection cnx, long id) {
        Candidat candidat = null;
        
        PreparedStatement pstmt = null;
        
        try {
            pstmt = cnx.prepareStatement("SELECT Identifiant, DateNaissance, Pays, Nom, Prenom "
                    + " FROM Candidat "
                    + " WHERE Identifiant = ?");
            pstmt.setLong(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                candidat = new Candidat(rs.getLong("Identifiant"), rs.getDate("DateNaissance"), rs.getString("Pays"), rs.getString("Nom"), rs.getString("Prenom"));
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
        
        return candidat;
    }
}
