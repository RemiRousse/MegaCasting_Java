/**
 * 
 */
package megacasting.entity;

/**
 * @author julien
 *
 */
public class Employe {

	private long identifiant;
    private String nom;
    private String prenom;
    private String poste;
    private int habilitation;
    
    
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
