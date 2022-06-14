package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1037Intervalo {

	public static void main(String[] args) {

		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			double numberInteval =  number.nextDouble();

			if (numberInteval >= 0 && numberInteval <= 25.0000) {
				System.out.println("Intervalo [0,25]\n");
				return;
			}

			if (numberInteval >= 25.00001 && numberInteval <= 50.0000000) {
				System.out.println("Intervalo (25,50]");
				return;
			}

			if (numberInteval >= 50.00001 && numberInteval <= 75.0000000) {
				System.out.println("Intervalo (50,75]");
				return;
			}

			if (numberInteval > 75.00001 && numberInteval <= 100.0000000) {
				System.out.println("Intervalo (75,100]");
				return;
			} else {
				System.out.println("Fora de intervalo");
			}
		}
	}

}
