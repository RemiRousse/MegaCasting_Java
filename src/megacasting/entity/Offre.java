/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting.entity;

import java.util.Date;

/**
 *
 * @author Mousse
 * @author Julien Bureau <julien.bureau02@gmail.com>
 */
public class Offre {
    
    private long identifiant;
    private String libelle;
    private String reference;
    private Date dateDebPublication;
    private Date dateDebContrat;
    private Date dateFinContrat;
    private String descPoste;
    private String descProfil;
    private Annonceur annonceur;
    private Contrat contrat;
    private Metier metier;
    private Domaine domaine;

    public String toString(Date date) {
        return "" + date + "";
    }

    public long getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(long identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateDebPublication() {
        return dateDebPublication;
    }

    public void setDateDebPublication(Date dateDebPublication) {
        this.dateDebPublication = dateDebPublication;
    }

    public Date getDateDebContrat() {
        return dateDebContrat;
    }

    public void setDateDebContrat(Date dateDebContrat) {
        this.dateDebContrat = dateDebContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public String getDescPoste() {
        return descPoste;
    }

    public void setDescPoste(String descPoste) {
        this.descPoste = descPoste;
    }

    public String getDescProfil() {
        return descProfil;
    }

    public void setDescProfil(String descProfil) {
        this.descProfil = descProfil;
    }

    public Annonceur getAnnonceur() {
        return annonceur;
    }

    public void setAnnonceur(Annonceur annonceur) {
        this.annonceur = annonceur;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public Metier getMetier() {
        return metier;
    }

    public void setMetier(Metier metier) {
        this.metier = metier;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }
	/**
	 * @modified by Julien Bureau <julien.bureau02@gmail.com>
	 * @param identifiant
	 * @param libelle
	 * @param reference
	 * @param string
	 * @param dateDebContrat
	 * @param dateFinContrat
	 * @param descPoste
	 * @param descProfil
	 * @param annonceur
	 * @param contrat
	 * @param metier
	 * @param domaine
	 */
    public Offre(long identifiant, String libelle, String reference, Date datePublication, Date dateDebContrat, Date dateFinContrat, String descPoste, String descProfil, Annonceur annonceur, Contrat contrat, Metier metier, Domaine domaine) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.reference = reference;
        this.dateDebPublication = datePublication;
        this.dateDebContrat = dateDebContrat;
        this.dateFinContrat = dateFinContrat;
        this.descPoste = descPoste;
        this.descProfil = descProfil;
        this.annonceur = annonceur;
        this.contrat = contrat;
        this.metier = metier;
        this.domaine = domaine;
    }

    /**
     * @author Julien BUREAU <julien.bureau02@gmail.com>
     * @param libelle
     * @param reference
     * @param datePublication
     * @param contrat
     * @param metier
     * @param domaine
     */
	public Offre(String libelle, String reference, Date datePublication, Contrat contrat, Metier metier, Domaine domaine) {
		this.libelle = libelle;
        this.reference = reference;
        this.dateDebPublication = datePublication;
        this.contrat = contrat;
        this.metier = metier;
        this.domaine = domaine;
	}
    

}
