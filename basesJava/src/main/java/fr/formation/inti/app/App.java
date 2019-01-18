package fr.formation.inti.app;

import fr.formation.inti.interfaces.Mitose;
import fr.formation.inti.interfaces.Pondre;
import fr.formation.inti.interfaces.Reproduction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Reproduction.description();
        Pondre.description();
        Mitose.description();
        
        String str1 = "String 1";
        String str2 = new String("String 1");
 
        // L'opérateur 'new' crée la zone de mémoire (1)
        // contient la chaîne (String) "This is text"
        // Et 's1' est une référence qui pointe vers la zone (1).
        String s1 = new String("This is text");
 
        // L'opérateur 'new' crée la zone de mémoire (2)
        // Contient la chaîne (String) "This is text"
        // Et 's2' est une référence qui pointe vers la zone (2)
        String s2 = new String("This is text");
        // Utilisez l'opérateur == pour comparer 's1' et 's2'.
        // Les résultats sont faux (false).
        // Il est évidemment différent de ce que vous pensez.
        // La raison en est le type de référence
        // L'opérateur == compare les positions auxquelles ils indiquent.
        boolean e1 = (str1 == str2); // false
 
        System.out.println("s1 == s2 ? " + e1);
        
        
    }
}
