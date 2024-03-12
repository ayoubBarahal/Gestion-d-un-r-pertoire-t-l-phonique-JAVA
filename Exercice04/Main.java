package Exercice04;

public class Main {
    public static void main(String[] args) {
        Repertoire repertoire = new Repertoire(5);

        Abonne abonne1 = new Abonne("ayoub", "0659521353");
        Abonne abonne2 = new Abonne("adam", "0652457820");
        Abonne abonne3 = new Abonne("oumaima", "0759854632");

        repertoire.addAbonne(abonne1);
        repertoire.addAbonne(abonne2);
        repertoire.addAbonne(abonne3);

        System.out.println(repertoire.getNumero("ayoub"));
        System.out.println(repertoire.getNbAbonnes());
        if(repertoire.getAbonne(1)!=null){
        System.out.println(repertoire.getAbonne(1).getNom());}


        for (int i=0;i<repertoire.getNbAbonnes();i++) {
            System.out.println(repertoire.getAbonne(i).getNom() + ": " + repertoire.getAbonne(i).getNumeroTelephone());
        }
    }
}