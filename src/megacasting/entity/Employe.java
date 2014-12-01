/**
 * 
 */
package megacasting.entity;

/**
 * @author julien
 *
 */
public class Employe extends Personne {

	private long identifiant;
    private String poste;
    private int habilitation;
    
    public Employe(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}
    
    
	/**
	 * @return the identifiant
	 */
	public long getIdentifiant() {
		return identifiant;
	}
	/**
	 * @return the poste
	 */
	public String getPoste() {
		return poste;
	}
	/**
	 * @param poste the poste to set
	 */
	public void setPoste(String poste) {
		this.poste = poste;
	}
	/**
	 * @return the habilitation
	 */
	public int getHabilitation() {
		return habilitation;
	}
	/**
	 * @param habilitation the habilitation to set
	 */
	public void setHabilitation(int habilitation) {
		this.habilitation = habilitation;
	}

}
