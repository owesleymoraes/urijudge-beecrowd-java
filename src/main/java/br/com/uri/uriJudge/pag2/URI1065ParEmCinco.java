package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1065ParEmCinco {
	public static void main(String[] args) {
		try (Scanner numbers = new Scanner(System.in)) {

			numbers.useLocale(Locale.ENGLISH);
			int number;
			int count = 0;

			for (int i = 1; i <= 5; i++) {

				number = numbers.nextInt();

				if (number % 2 == 0) {

					count++;
				}
			}

			System.out.printf("%d valores pares\n", count);

		}
	}

}
