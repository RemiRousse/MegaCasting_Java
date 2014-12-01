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
import megacasting.entity.Contrat;

/**
 *
 * @author Mousse
 */
public class ContratDAO {
    public void insert(Connection cnx, Contrat contrat) {

        Statement stmt = null;
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("INSERT INTO Contrat (Libelle) "
                    + "VALUES (?)");
            pstmt.setString(1, contrat.getLibelle());

            int nb = pstmt.executeUpdate();

            if (nb == 1) {
                stmt = cnx.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) FROM Contrat");
                if (rs.next()) {
                    long id = rs.getLong(1);
                    contrat.setIdentifiant(id);
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

    public void update(Connection cnx, Contrat contrat) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("UPDATE Contrat SET "
                    + "Libelle = ? "
                    + "WHERE Identifiant = ?");
            pstmt.setString(1, contrat.getLibelle());
            pstmt.setLong(2, contrat.getIdentifiant());

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

    public void delete(Connection cnx, Contrat contrat) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("DELETE FROM Contrat "
                    + "WHERE Identifiant = ?");
            pstmt.setLong(1, contrat.getIdentifiant());
            
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

    public Collection<Contrat> list(Connection cnx) {
        Set<Contrat> set = new HashSet<Contrat>();
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant, Libelle "
                    + "FROM Contrat");
            
            while (rs.next()) {                
                Contrat contrat = new Contrat(rs.getLong("Identifiant"), rs.getString("Libelle"));
                set.add(contrat);
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
    
    public Contrat find(Connection cnx, long id) {
        Contrat contrat = null;
        
        PreparedStatement pstmt = null;
        
        try {
            pstmt = cnx.prepareStatement("SELECT Identifiant, Libelle "
                    + " FROM Contrat "
                    + " WHERE Identifiant = ?");
            pstmt.setLong(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                contrat = new Contrat(rs.getLong("Identifiant"), rs.getString("Libelle"));
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
        
        return contrat;
    }
}
