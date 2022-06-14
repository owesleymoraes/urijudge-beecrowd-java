package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1044Multiplos {
	public static void main(String[] args) {
		try (Scanner numbers = new Scanner(System.in)) {
			numbers.useLocale(Locale.ENGLISH);

			String[] number = numbers.nextLine().split(" ");
			String mult;
			int numberOne = Integer.parseInt(number[0]);
			int numberTwo = Integer.parseInt(number[1]);

			if (numberOne > numberTwo) {

				mult = numberOne % numberTwo == 0 ? "Sao Multiplos" : "Nao sao Multiplos";

				System.out.println(mult);
				
			} else {
				mult = numberTwo % numberOne == 0 ? "Sao Multiplos" : "Nao sao Multiplos";

				System.out.println(mult);
			}
		}
	}

}
