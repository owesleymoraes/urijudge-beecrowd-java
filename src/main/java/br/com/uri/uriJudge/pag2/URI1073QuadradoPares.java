package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1073QuadradoPares {
	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			int par = number.nextInt();
			int pow;

			for (int i = 1; i <= par; i++) {

				if (i % 2 == 0) {
					pow = (int) Math.pow(i, 2);
					System.out.printf("%d^2 = %d\n",i,pow);
					
				}
			}

		}
	}

}
