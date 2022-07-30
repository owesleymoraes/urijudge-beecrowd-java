package br.com.uri.uriJudge.pag3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI1117ValidandoNota {

	public static void main(String[] args) {
		try (Scanner notes = new Scanner(System.in)) {

			List<Double> listNotes = new ArrayList<Double>();

			int amountNotes = 1;

			while (amountNotes <= 2) {

				double note = notes.nextDouble();

				if (note >= 0 && note <= 10) {

					listNotes.add(note);
					amountNotes++;

				} else {

					System.out.println("nota invalida");
				}

			}

			double avarge = (listNotes.get(0) + listNotes.get(1)) / 2;
			System.out.printf("media = %.2f%n", avarge);

		}
	}

}
