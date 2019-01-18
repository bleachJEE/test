package fr.formation.inti.interfaces;

public interface Mitose extends Reproduction {

    public static void description() {

        Reproduction.description();

        System.out.println("Redéfinie dans Mitose.java");

    }
    /**
     * Mais depuis Java 8, il est possible d'ajouter un comportement par défaut à des méthodes dans une interface 
     * grâce au mot clé default.
     */
    default void reproduire() {

        System.out.println("Je me divise !");

    }
}
