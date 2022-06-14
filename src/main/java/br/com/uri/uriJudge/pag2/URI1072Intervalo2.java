package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1072Intervalo2 {
	public static void main(String[] args) {
		try (Scanner variable = new Scanner(System.in)) {
			variable.useLocale(Locale.ENGLISH);

			int number = variable.nextInt();
			long testNumber;
			int countIn = 0;
			int countOut = 0;

			for (int i = 1; i <= number; i++) {

				testNumber = variable.nextLong();

				if (testNumber >= 10 && testNumber <= 20) {
					countIn += 1;

				} else {
					countOut += 1;

				}

			}

			System.out.println(countIn + " in");
			System.out.println(countOut + " out");

		}
	}

}
