package Exercice04;

import java.util.Arrays;
import java.util.Comparator;

class Repertoire {
    private int MaxAbonne;
    private Abonne[] abonnes ;

    public Repertoire(int MaxAbonne) {
        this.MaxAbonne = MaxAbonne;
        this.abonnes = new Abonne[MaxAbonne];


    }

    public boolean addAbonne(Abonne abonne) {
        int index=0;
        if (abonnes.length < MaxAbonne) {
            abonnes[index]=abonne;
            index++;
            return true;
        }
        return false;

    }

    public String getNumero(String nom) {
        for (Abonne abonne : abonnes) {
            if (abonne != null && abonne.getNom().equalsIgnoreCase(nom)) {
                return abonne.getNumeroTelephone();
            }
        }
        return null;
    }

    public int getNbAbonnes() {
        return abonnes.length;
    }

    public Abonne getAbonne(int rang) {
        if (rang >= 0 && rang < abonnes.length) {
            return abonnes[rang];
        }
        return null;
    }
/*
    public Abonne getAbonnesTries() {
        Abonne abonnesTries ;
        abonnesTries= Arrays.stream(abonnes).sorted(abonnes.getNom());
        return abonnesTries;
    }*/
}
