package fr.formation.inti;

import fr.formation.inti.interfaces.Mitose;
import fr.formation.inti.interfaces.Pondre;

public class Alien implements Pondre, Mitose {

	public void reproduire() {

		System.out.println("Je suis un alien et :");

		Pondre.super.reproduire();

		Mitose.super.reproduire();

	}

}
