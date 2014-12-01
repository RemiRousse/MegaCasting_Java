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
    private Personne personne;
    
    public Employe(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}
    
	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(long identifiant) {
		this.identifiant = identifiant;
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


	/**
	 * @return the personne
	 */
	public Personne getPersonne() {
		return personne;
	}


	/**
	 * @param personne the personne to set
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
