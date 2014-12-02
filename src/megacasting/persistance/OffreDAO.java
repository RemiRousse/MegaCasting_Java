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

import megacasting.entity.Annonceur;
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
		
		AnnonceurDAO annonceur = new AnnonceurDAO();
		annonceur.insert(cnx, offre.getAnnonceur());
        
		ContratDAO contrat = new ContratDAO();
		contrat.insert(cnx, offre.getContrat());
		
		MetierDAO metier = new MetierDAO();
		metier.insert(cnx, offre.getMetier());
		
		DomaineDAO domaine = new DomaineDAO();
		domaine.insert(cnx, offre.getDomaine());
		
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
							+ "DESCPROFIL,"
							+ "IdentifiantAnnonceur,"
							+ "IdentifiantContrat,"
							+ "IdentifiantMetier,"
							+ "IdentifiantDomaine) "

	                + "VALUES (?, ?, ?, ?, ?, ?, ?)");
			
	        pstmt.setString(1, offre.getLibelle());
	        pstmt.setString(2, offre.getReference());
	        pstmt.setDate(3, (Date) offre.getDateDebPublication());
	        pstmt.setDate(4, (Date) offre.getDateDebContrat());
	        pstmt.setDate(4, (Date) offre.getDateFinContrat());
	        pstmt.setString(5, offre.getDescPoste());
	        pstmt.setString(6, offre.getDescProfil());
	        pstmt.setLong(7, offre.getAnnonceur().getIdentifiant());
	        pstmt.setLong(8, offre.getContrat().getIdentifiant());
	        pstmt.setLong(9, offre.getMetier().getIdentifiant());
	        pstmt.setLong(10, offre.getDomaine().getIdentifiant());
	
	        int nb = pstmt.executeUpdate();
	
	        if (nb == 1) {
	        	stmt = cnx.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(Identifiant) FROM Offre");
                if (rs.next()) {
                    int id = rs.getInt(1);
                    offre.setIdentifiant(id);
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

}
