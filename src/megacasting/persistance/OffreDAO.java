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
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import megacasting.entity.Annonceur;
import megacasting.entity.Contrat;
import megacasting.entity.Diffuseur;
import megacasting.entity.Domaine;
import megacasting.entity.Metier;
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
							+ "STR_TO_DATE('DATEDEBPUBLICATION', '%d/%m/%Y'), "
							+ "STR_TO_DATE('DATEDEBCONTRAT', '%d/%m/%Y'), "
							+ "STR_TO_DATE('DATEFINCONTRAT', '%d/%m/%Y'), "
							+ "DESCPOSTE, "
							+ "DESCPROFIL,"
							+ "IdentifiantAnnonceur,"
							+ "IdentifiantContrat,"
							+ "IdentifiantMetier,"
							+ "IdentifiantDomaine) "

	                + "VALUES (?, ?, ?, ?, ?, ?, ?)");
			
	        pstmt.setString(1, offre.getLibelle());
	        pstmt.setString(2, offre.getReference());
	        pstmt.setString(3, offre.getDateDebPublication());
	        pstmt.setString(4, offre.getDateDebContrat());
	        pstmt.setString(4, offre.getDateFinContrat());
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
	
	/**
	 * update offre
	 * @param cnx
	 * @param offre
	 */
	public void update (Connection cnx, Offre offre) {
		
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = cnx.prepareStatement(
					"UPDATE Offre SET ("
							+ "LIBELLE, "
							+ "REFERENCE, "
							+ "STR_TO_DATE('DATEDEBPUBLICATION', '%d/%m/%Y'), "
							+ "STR_TO_DATE('DATEDEBCONTRAT', '%d/%m/%Y'), "
							+ "STR_TO_DATE('DATEFINCONTRAT', '%d/%m/%Y'), "
							+ "DESCPOSTE, "
							+ "DESCPROFIL,"
							+ "IdentifiantAnnonceur,"
							+ "IdentifiantContrat,"
							+ "IdentifiantMetier,"
							+ "IdentifiantDomaine) "

	                + "VALUES (?, ?, ?, ?, ?, ?, ?)");
			
		        pstmt.setString(1, offre.getLibelle());
		        pstmt.setString(2, offre.getReference());
		        pstmt.setString(3, offre.getDateDebPublication());
		        pstmt.setString(4, offre.getDateDebContrat());
		        pstmt.setString(4, offre.getDateFinContrat());
		        pstmt.setString(5, offre.getDescPoste());
		        pstmt.setString(6, offre.getDescProfil());
		        pstmt.setLong(7, offre.getAnnonceur().getIdentifiant());
		        pstmt.setLong(8, offre.getContrat().getIdentifiant());
		        pstmt.setLong(9, offre.getMetier().getIdentifiant());
		        pstmt.setLong(10, offre.getDomaine().getIdentifiant());
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
	 * delete offre
	 * @param cnx
	 * @param offre
	 */
	public void delete(Connection cnx, Offre offre) {
        
        PreparedStatement pstmt = null;

        try {
            pstmt = cnx.prepareStatement("DELETE FROM Offre "
                    + "WHERE IDENTIFIANT = ?");
            pstmt.setLong(1, offre.getIdentifiant());
            
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
     * colection offre
     * @param cnx
     * @return
     */
    public Collection<Offre> list(Connection cnx) {

    Set<Offre> set = new HashSet<Offre>();

    Statement stmt = null;

    try {
        stmt = cnx.createStatement();
        ResultSet rs = stmt.executeQuery(	"SELECT Identifiant, "
                                            + "LIBELLE, "
                                            + "REFERENCE, "
                                            + "DATEDEBPUBLICATION, "
                                            + "DATEDEBCONTRAT,"
                                            + "DATEFINCONTRAT,"
                                            + "DESCPOSTE, "
                                            + "DESCPROFIL,"
                                            + "IdentifiantAnnonceur,"
                                            + "IdentifiantContrat,"
                                            + "IdentifiantMetier,"
                                            + "IdentifiantDomaine "
                                            + "FROM Offre"
                                            );
        
        while (rs.next()) {                
            AnnonceurDAO a = new AnnonceurDAO();
            Annonceur annonceur = a.find(cnx, rs.getInt("IdentifiantAnnonceur"));

            ContratDAO c = new ContratDAO();
            Contrat contrat = c.find(cnx, rs.getInt("IdentifiantContrat"));

            MetierDAO m = new MetierDAO();
            Metier metier = m.find(cnx, rs.getInt("IdentifiantMetier"));

            DomaineDAO d = new DomaineDAO();
            Domaine domaine = d.find(cnx, rs.getInt("IdentifiantDomaine"));

            Offre offre = new Offre(
                            rs.getLong("Identifiant"),
                            rs.getString("Libelle"),
                            rs.getString("Reference"),
                            rs.getDate("dateDebPublication").toString(),
                            rs.getDate("dateDebContrat").toString(),
                            rs.getDate("dateFinContrat").toString(),
                            rs.getString("DescPoste"),
                            rs.getString("DescProfil"),
                            annonceur,
                            contrat,
                            metier,
                            domaine
                    );
            set.add(offre);
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

    /**
     * Find Offre
     * @param cnx
     * @param id
     * @return
     */
    public Offre find(Connection cnx, long id) {

        Offre offre = null;

        PreparedStatement pstmt = null;

        try {

            pstmt = cnx.prepareStatement("SELECT Identifiant, "
                                        +   "LIBELLE, "
                                        +   "REFERENCE, "
                                        +   "DATE_FORMAT(DATEDEBPUBLICATION, '%d/%m/%Y'), "
                                        +   "DATE_FORMAT(DATEDEBCONTRAT, '%d/%m/%Y'), "
                                        +   "DATE_FORMAT(DATEFINCONTRAT, '%d/%m/%Y'), "
                                        +   "DESCPOSTE, "
                                        +   "DESCPROFIL,"
                                        +   "IdentifiantAnnonceur,"
                                        +   "IdentifiantContrat,"
                                        +   "IdentifiantMetier,"
                                        +   "IdentifiantDomaine "
                                        + "FROM Offre "
                                        + "WHERE Identifiant = ?");
            pstmt.setLong(1, id);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {

                AnnonceurDAO a = new AnnonceurDAO();
                Annonceur annonceur = a.find(cnx, rs.getInt("IdentifiantAnnonceur"));

                ContratDAO c = new ContratDAO();
                Contrat contrat = c.find(cnx, rs.getInt("IdentifiantContrat"));

                MetierDAO m = new MetierDAO();
                Metier metier = m.find(cnx, rs.getInt("IdentifiantMetier"));

                DomaineDAO d = new DomaineDAO();
                Domaine domaine = d.find(cnx, rs.getInt("IdentifiantDomaine"));

                offre = new Offre(
                    rs.getLong("Identifiant"),
                    rs.getString("Libelle"),
                    rs.getString("Reference"),
                    rs.getDate("dateDebPublication").toString(),
                    rs.getDate("dateDebContrat").toString(),
                    rs.getDate("dateFinContrat").toString(),
                    rs.getString("DescPoste"),
                    rs.getString("DescProfil"),
                    annonceur,
                    contrat,
                    metier,
                    domaine
                );
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

        return offre;
    }
}
