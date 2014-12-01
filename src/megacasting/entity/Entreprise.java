/**
 * 
 */
package megacasting.entity;

/**
 * @author julien
 *
 */
public class Entreprise {
	
    private String nom;
    private String responsable;
    
    
	/**
	 * @param nom
	 * @param responsable
	 */
	public Entreprise(String nom, String responsable) {
		this.nom = nom;
		this.responsable = responsable;
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
