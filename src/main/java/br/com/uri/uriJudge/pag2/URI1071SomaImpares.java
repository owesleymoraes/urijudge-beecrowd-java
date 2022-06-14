package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1071SomaImpares {

	public static void main(String[] args) {
		try (Scanner numberInto = new Scanner(System.in)) {

			numberInto.useLocale(Locale.ENGLISH);
			int result = 0;
			int numberOne = numberInto.nextInt();
			int numberTwo = numberInto.nextInt();

			if (numberOne > numberTwo) {
				for (int i = numberTwo + 1; i < numberOne; i++) {

					if (i % 2 != 0) {
						result += i;
					}
				}

			} else {
				
				for (int i = numberOne + 1; i < numberTwo; i++) {
					
					if (i % 2 != 0) {
						result += i;
					}
				}

			}
			
			System.out.println(result);

		}

	}
}
