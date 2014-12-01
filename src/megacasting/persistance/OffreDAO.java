/**
 * 
 */
package megacasting.persistance;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import megacasting.entity.Offre;

/**
 * @author julien
 *
 */
public class OffreDAO {

	/**
	 * Insert offre
	 * @param cnx
	 * @param offre
	 */
	public void insert(Connection cnx, Offre offre) {
		
		Statement stmt = null;
        PreparedStatement pstmt = null;
        try {
			pstmt = cnx.prepareStatement(
					"INSERT INTO Offre ("
							+ "LIBELLE, "
							+ "REFERENCE, "
							+ "DATEDEBPUBLICATION, "
							+ "DATEDEBCONTRAT, "
							+ "DATEFINCONTRAT, "
							+ "DESCPOSTE, "
							+ "DESCPROFIL) "
//							+ "AAAAAAAAAA) "
	                + "VALUES (?, ?, ?, ?)");
			
	        pstmt.setString(1, offre.getLibelle());
	        pstmt.setString(2, offre.getReference());
	        pstmt.setDate(3, (Date) offre.getDateDebPublication());
	        pstmt.setDate(4, (Date) offre.getDateDebContrat());
	        pstmt.setDate(4, (Date) offre.getDateFinContrat());
	        pstmt.setString(5, offre.getDescPoste());
	        pstmt.setString(6, offre.getDescProfil());
	        
	
	        int nb = pstmt.executeUpdate();
	
	        if (nb == 1) {
	           
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

}
