package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1075Resto2 {

	public static void main(String[] args) {
		try (Scanner inputNumber = new Scanner(System.in)) {
			inputNumber.useLocale(Locale.ENGLISH);

			int quotient = inputNumber.nextInt();

			for (int i = 1; i <= 10000; i++) {
				
				if(i % quotient == 2) {
					
					System.out.println(i);
					
				}

			}

		}
	}

}
