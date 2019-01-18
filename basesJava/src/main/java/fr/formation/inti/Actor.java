package fr.formation.inti;
 
// Pour comparer les uns avec les autres,
// la classe d'Actor doit implémenter une interface comparable.
public class Actor implements Comparable<Actor> {
 
    private String firstName;
    private String lastName;
 
    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    // Comparez cet Actor avec un autre actor.
    // Selon le principe de comparaison du dernier nom d'abord,
    // puis comparez FirstName.
    @Override
    public int compareTo(Actor other) {
 
        // Comparez deux chaines.
        int value = this.lastName.compareTo(other.lastName);
 
        // Si lastName de deux objets ne sont pas égaux
        if (value != 0) {
            return value;
        }
        // Si lastName de deux objets sont le même.
        // Ensuite, comparez fistName.
        value = this.firstName.compareTo(other.firstName);
        return value;
    }
 
}