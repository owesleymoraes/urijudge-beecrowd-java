package br.com.uri.uriJudge.pag3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class URI1115Quadrante {
	
	public static void main(String[] args) {

		try (Scanner setence = new Scanner(System.in)) {

			setence.useLocale(Locale.ENGLISH);
			int coordinates;
			int count = 0;
			int countAux = 1;

			ArrayList<Integer> numbers = new ArrayList<>();

			while ((coordinates = (setence.nextInt())) != 0) {

				numbers.add(coordinates);

				if (countAux >= 2) {

					if (numbers.get(count) > 0 && numbers.get(count + 1) > 0) {
						System.out.println("primeiro");
					}

					if (numbers.get(count) > 0 && numbers.get(count + 1) < 0) {
						System.out.println("quarto");
					}

					if (numbers.get(count) < 0 && numbers.get(count + 1) > 0) {
						System.out.println("segundo");
					}

					if (numbers.get(count) < 0 && numbers.get(count + 1) < 0) {
						System.out.println("terceiro");
					}

					countAux = 0;
					count += 2;

				}

				countAux++;

			}


		}
	}

}
