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
public class Contrat {
    
    private long identifiant;
    private String libelle;

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

    public Contrat(long identifiant, String libelle) {
        this.identifiant = identifiant;
        this.libelle = libelle;
    }

    public Contrat(String libelle) {
        this.libelle = libelle;
    }
    
}
