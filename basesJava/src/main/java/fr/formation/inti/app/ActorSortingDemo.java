package fr.formation.inti.app;

import java.util.Arrays;

import fr.formation.inti.Actor;

public class ActorSortingDemo {
 
    public static void main(String[] args) {
 
        Actor actor1 = new Actor("Christian", "Barton");
        Actor actor2 = new Actor("Christian", "Bale");
        Actor actor3 = new Actor("Joan", "Collins");
        Actor actor4 = new Actor("Gemma", "Arterton");
        Actor actor5 = new Actor("Daniel", "Craig");
 
        Actor[] actors = new Actor[] { actor1, actor2, actor3, actor4, actor5 };
 
        // Utilisez un algorithme pour trier de nouveau tableau ci-dessus.
        // Triez les objets Actor en augmentant progressivement l'ordre.
        for (int i = 0; i < actors.length; i++) {
 
            for (int j = i + 1; j < actors.length; j++) {
                // Si actors[j] < actors[i]
                // Ensuite, échangez les positions les uns avec les autres.
                if (actors[j].compareTo(actors[i]) < 0) {
                    // Utilisez une variable temporaire.
                    Actor temp = actors[j];
                    actors[j] = actors[i];
                    actors[i] = temp;
                }
            }
        }
        // Imprimez les éléments du tableau.
        for (int i = 0; i < actors.length; i++) {
            System.out.println(actors[i].getFirstName() + "  " + actors[i].getLastName());
        }
        
        System.out.println("-------------------------------------");
        Actor[] actors2 = new Actor[] { actor1, actor2, actor3, actor4, actor5 };
        
        // Utilisez Arrays.sort(Object[]) pour trier.
        Arrays.sort(actors2);
 
        // Imprimez les éléments.
        for (int i = 0; i < actors.length; i++) {
            System.out.println(actors[i].getFirstName() + "  " + actors[i].getLastName());
        }
 
    }
 
}