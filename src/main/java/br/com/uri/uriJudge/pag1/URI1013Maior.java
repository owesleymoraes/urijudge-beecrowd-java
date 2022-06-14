package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1013Maior {
	public static void main(String[] args) {
		try (Scanner numbers = new Scanner(System.in)) {
			numbers.useLocale(Locale.ENGLISH);

			String numberText[] = numbers.nextLine().split(" ");

			int A = Integer.parseInt(numberText[0]);
			int B = Integer.parseInt(numberText[1]);
			int C = Integer.parseInt(numberText[2]);

			int maiorAB = ((A + B) + Math.abs(A - B)) / 2;

			if (maiorAB == A) {
				if (A - C < 0) {

					System.out.println(C + " eh o maior");
				} else {
					System.out.println(A + " eh o maior");
				}
			} else {

				if (B - C < 0) {

					System.out.println(C + " eh o maior");
				} else {
					System.out.println(B + " eh o maior");
				}

			}

		}
	}

}
