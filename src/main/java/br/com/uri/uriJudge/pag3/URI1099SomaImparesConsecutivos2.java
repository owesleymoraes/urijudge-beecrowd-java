package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1099SomaImparesConsecutivos2 {
	public static void main(String[] args) {

		try (Scanner setence = new Scanner(System.in)) {
			setence.useLocale(Locale.ENGLISH);
			int amountSum = 0;
			int numberOne;
			int numberTwo;

			int amountTest = setence.nextInt();

			for (int index = 1; index <= amountTest; index++) {

				amountSum = 0;
				numberOne = setence.nextInt();
				numberTwo = setence.nextInt();

				if (numberOne - numberTwo < 0) {

					for (int i = numberOne; i < numberTwo; i++) {

						if (i % 2 != 0 && i != numberOne) {
							amountSum += i;

						}
					}

				} else {

					for (int i = numberTwo; i < numberOne; i++) {
						if (i % 2 != 0 && i != numberTwo) {
							amountSum += i;

						}

					}

				}

				System.out.println(amountSum);
				

			}
		}
	}

}
