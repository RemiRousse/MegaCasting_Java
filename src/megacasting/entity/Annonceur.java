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
    private String nom;
    private String responsable;
    private String siret;
    
 
    public Annonceur(String nom, String responsable) {
		super(nom, responsable);
		// TODO Auto-generated constructor stub
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the responsable
	 */
	public String getResponsable() {
		return responsable;
	}
	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(String responsable) {
		this.responsable = responsable;
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

}