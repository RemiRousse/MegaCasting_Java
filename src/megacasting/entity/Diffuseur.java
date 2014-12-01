/**
 * 
 */
package megacasting.entity;

/**
 * @author julien
 *
 */
public class Diffuseur extends Entreprise {

	private long identifiant;
    private String nom;
    private String responsable;
    
    
    public Diffuseur(String nom, String responsable) {
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
	
}
