package edu.es.eoi;

import edu.es.eoi.domain.Card;

public class Main {

	public static void main(String[] args) {

		Card card1 = new Card();
		card1.name = "Pedro";
		card1.mail = "pedrito@gmail.com";

		Card card2 = new Card();
		card2.name = "Paco";
		card2.mail = "paco@gmail.com";

		System.out.println(card1);

		System.out.println(card2);

	}

}
