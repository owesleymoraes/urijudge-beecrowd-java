package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1101SequenciaInteirosSoma {
	public static void main(String[] args) {

		try (Scanner setence = new Scanner(System.in)) {
			setence.useLocale(Locale.ENGLISH);
			int amountSum = 0;
			int numberOne;
			int numberTwo;

			do {

				numberOne = setence.nextInt();
				numberTwo = setence.nextInt();

				if (numberOne <= 0 || numberTwo <= 0) {
					return;
				}

				if (numberOne - numberTwo < 0) {

					for (int i = numberOne; i <= numberTwo; i++) {

						System.out.printf("%d ", i);
						amountSum += i;
					}

				} else {

					for (int i = numberTwo; i <= numberOne; i++) {

						System.out.printf("%d ", i);
						amountSum += i;

					}

				}

				System.out.println("Sum=" + amountSum);
				amountSum =0;

			} while (numberOne != 0 && numberTwo != 0 || numberOne > 0 && numberTwo > 0);

		}
	}

}
