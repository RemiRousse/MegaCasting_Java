/**
 * 
 */
package megacasting.entity;

/**
 * @author julien
 * 01-12-2014
 */
public class Annonceur extends Entreprise {
	
    private long identifiant;
    private String siret;
    private Entreprise entreprise;
    
 
    public Annonceur(String nom, String responsable) {
		super(nom, responsable);
		// TODO Auto-generated constructor stub
	}

    public Annonceur(long identifiant, String nom, String responsable, String siret) {
        super(nom, responsable);
        this.identifiant = identifiant;
        this.siret = siret;
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
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}
	/**
	 * @param siret the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}
	/**
	 * @return the entreprise
	 */
	public Entreprise getEntreprise() {
		return entreprise;
	}
	/**
	 * @param entreprise the entreprise to set
	 */
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

}
