/**
 * 
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
import megacasting.entity.Employe;

/**
 * @author julien
 * 01-12-2014
 */
public class EmployeDAO {

	/**
	 * Insert employe
	 * @param cnx
	 * @param employe
	 */
	public void insert(Connection cnx, Employe employe) {
		
		Statement stmt = null;
        PreparedStatement pstmt = null;
        try {
			pstmt = cnx.prepareStatement("INSERT INTO Employe (NOM, PRENOM, POSTE, HABILITATION) "
	                + "VALUES (?, ?, ?, ?)");
			
	        pstmt.setString(1, employe.getNom());
	        pstmt.setString(2, employe.getPrenom());
	        pstmt.setString(3, employe.getPoste());
	        pstmt.setInt(4, employe.getHabilitation());
	        
	        int nb = pstmt.executeUpdate();
	
	        if (nb == 1) {
	            stmt = cnx.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) FROM Employe");
	            if (rs.next()) {
	                long id = rs.getLong(1);
	                employe.setIdentifiant(id);
	            }
	        }
		} catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException ex) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                	
                }
            }
        }
	}

	/**
	 * Update Employe
	 * @param cnx
	 * @param employe
	 */
	public void update (Connection cnx, Employe employe) {
		
		 PreparedStatement pstmt = null;
		 
		 try {
            pstmt = cnx.prepareStatement("UPDATE Employe SET "
                    + "Libelle = ? "
                    + "WHERE Identifiant = ?");
            pstmt.setString(1, employe.getNom());
            pstmt.setString(2, employe.getPrenom());
	        pstmt.setString(3, employe.getPoste());
	        pstmt.setInt(4, employe.getHabilitation());
            pstmt.setLong(5, employe.getIdentifiant());

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
	
	/**
	 * Delete Employe
	 * @param cnx
	 * @param employe
	 */
	public void delete(Connection cnx, Employe employe) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("DELETE FROM Employe "
                    + "WHERE Identifiant = ?");
            pstmt.setLong(1, employe.getIdentifiant());
            
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
        
        public Collection<Employe> list(Connection cnx) {
        Set<Employe> set = new HashSet<Employe>();
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Identifiant, Poste, Habilitation, Nom, Prenom "
                    + "FROM Employe");
            
            while (rs.next()) {      
                Employe employe = new Employe(rs.getLong("Identifiant"), rs.getString("Poste"), rs.getInt("Habilitation"), rs.getString("Nom"), rs.getString("Prenom"));
                set.add(employe);
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
    
    public Employe find(Connection cnx, long id) {
        Employe employe = null;
        
        PreparedStatement pstmt = null;
        
        try {
            pstmt = cnx.prepareStatement("SELECT Identifiant, Poste, Habilitation, Nom, Prenom "
                    + " FROM Employe "
                    + " WHERE Identifiant = ?");
            pstmt.setLong(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                employe = new Employe(rs.getLong("Identifiant"), rs.getString("Poste"), rs.getInt("Habilitation"), rs.getString("Nom"), rs.getString("Prenom"));
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
        
        return employe;
    }
	
}
