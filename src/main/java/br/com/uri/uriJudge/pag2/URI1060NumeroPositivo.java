package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1060NumeroPositivo {
	public static void main(String[] args) {

		try (Scanner variable = new Scanner(System.in)) {
			variable.useLocale(Locale.ENGLISH);

			int cont = 0;
			double number;

			for (int i = 1; i <= 6; i++) {

				number = variable.nextDouble();

				if (number > 0) {

					cont++;
				}

			}

			System.out.printf("%d valores positivos", cont);

		}
	}

}
