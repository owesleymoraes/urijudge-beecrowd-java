package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1064PositivoMedia {
	public static void main(String[] args) {
		try (Scanner numbers = new Scanner(System.in)) {
			numbers.useLocale(Locale.ENGLISH);
			int count = 0;
			double amount = 0;
			double avarege;

			for (int i = 0; i <= 5; i++) {

				double number = numbers.nextDouble();

				if (number > 0) {

					amount += number;
					count++;
				}
			}

			avarege = amount / count;

			System.out.println(count + " valores positivos");
			System.out.println(String.format("%.1f", avarege));

		}
	}

}
