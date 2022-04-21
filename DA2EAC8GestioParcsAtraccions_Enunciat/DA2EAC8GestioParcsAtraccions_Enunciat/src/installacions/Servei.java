/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package installacions;

import java.util.Scanner;

/**
 *
 * @author Albert
 */
public abstract class Servei implements Installacio {

    private final static Scanner DADES = new Scanner(System.in);

    String codi;
    String nom;
    String tipus;

    public Servei(String codi, String nom, String tipus) {
        this.codi = codi;
        this.nom = nom;
        this.tipus = tipus;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public abstract void showInstallacio();

    @Override
    public abstract void updateInstallacio();

}
