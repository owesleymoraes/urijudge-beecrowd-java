package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1066ParImparPositivoNegativo {
	public static void main(String[] args) {

		try (Scanner numbers = new Scanner(System.in)) {
			numbers.useLocale(Locale.ENGLISH);

			int countEven = 0;
			int countOdd = 0;
			int countPositive = 0;
			int countNegative = 0;

			for (int i = 1; i <= 5; i++) {

				int number = numbers.nextInt();

				if (number % 2 == 0) {
					countEven++;

					if (number > 0) {
						countPositive++;
					}
					if (number < 0) {
						countNegative++;
					}

				} else {
					countOdd++;

					if (number > 0) {
						countPositive++;
					}
					if (number < 0) {
						countNegative++;
					}
				}

			}

			System.out.println(countEven + " valor(es) par(es)");
			System.out.println(countOdd + " valor(es) impar(es)");
			System.out.println(countPositive + " valor(es) positivo(s)");
			System.out.println(countNegative + " valor(es) negativo(s)");

		}
	}
}
