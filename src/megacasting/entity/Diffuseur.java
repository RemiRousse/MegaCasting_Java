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
    private Entreprise entreprise;
    
    
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
