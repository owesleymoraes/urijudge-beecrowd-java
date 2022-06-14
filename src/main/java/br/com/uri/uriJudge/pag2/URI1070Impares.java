package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1070Impares {
	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			int odd = number.nextInt();

			if (odd % 2 == 0) {
				odd++;
			}

			for (int i = 1; i <= 6; i++) {

				if (!(odd % 2 == 0)) {
					System.out.println(odd);
					odd++;

				}

				odd++;
			}

		}
	}

}
