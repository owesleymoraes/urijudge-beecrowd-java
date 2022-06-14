package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1067Impares {
	public static void main(String[] args) {

		try (Scanner numbers = new Scanner(System.in)) {
			numbers.useLocale(Locale.ENGLISH);

			int number = numbers.nextInt();

			for (int i = 1; i <= number; i++) {

				if (!(i % 2 == 0)) {
					System.out.println(i);

				}

			}

		}
	}

}
