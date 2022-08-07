package br.com.uri.uriJudge.pag3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class URI1118VariasNotasValidacao {

	public static void main(String[] args) {

		try (Scanner numbers = new Scanner(System.in)) {
			numbers.useLocale(Locale.ENGLISH);

			int count = 0;
			double avarge = 0.0;
			double note;
			int inputNumbers = 0;

			List<Double> notes = new ArrayList<Double>();

			while (inputNumbers != 2) {

				note = numbers.nextDouble();

				if (note > 0 && note <= 10) {

					notes.add(note);
					count++;

					if (count == 2) {

						avarge = ((notes.get(0)) + (notes.get(1))) / 2.00;
						System.out.printf("media = %.2f%n", avarge);
						notes.clear();
						count = 0;

						System.out.println("novo calculo (1-sim 2-nao)");
						inputNumbers = (int) numbers.nextDouble();

							if(inputNumbers != 1) {
								
								while (inputNumbers < 1 || inputNumbers > 2) {

									System.out.println("novo calculo (1-sim 2-nao)");

									inputNumbers = (int) numbers.nextDouble();
									
								} 
							}

					}

				} else {

					System.out.println("nota invalida");
				}

			}

		}

	}

}
