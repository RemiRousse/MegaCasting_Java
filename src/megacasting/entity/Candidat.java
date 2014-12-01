/**
 * 
 */
package megacasting.entity;

import java.util.Date;



/**
 * @author julien
 * 01-12-2014
 */
public class Candidat extends Personne {

	
    private long identifiant;
    private Date dateNaissance;
    private String pays;
    
    public Candidat(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

    public Candidat(long identifiant, Date dateNaissance, String pays, String nom, String prenom) {
        super(nom, prenom);
        this.identifiant = identifiant;
        this.dateNaissance = dateNaissance;
        this.pays = pays;
    }
    
    
    
	/**
	 * @return the identifiant
	 */
	public long getIdentifiant() {
		return identifiant;
	}
	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(long identifiant) {
		this.identifiant = identifiant;
	}
	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}
	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}
    
}
