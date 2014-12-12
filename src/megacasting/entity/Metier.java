/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package megacasting.entity;

/**
 *
 * @author Mousse
 */
public class Metier {
    
    private long identifiant;
    private String libelle;
    private Domaine domaine;

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

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public Metier(long identifiant, String libelle, Domaine domaine) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.domaine = domaine;
    }

    public Metier(String libelle, Domaine domaine) {
        this.libelle = libelle;
        this.domaine = domaine;
    }
     
}
