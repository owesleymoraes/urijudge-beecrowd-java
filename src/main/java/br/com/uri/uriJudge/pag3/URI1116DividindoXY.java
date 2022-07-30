package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1116DividindoXY {

	public static void main(String[] args) {

		try (Scanner numbers = new Scanner(System.in)) {
		
			numbers.useLocale(Locale.ENGLISH);
			int inputNumber = (int) numbers.nextDouble();

			for (int i = 1; i <= inputNumber; i++) {

				double numberOne = numbers.nextDouble();
				double numberTwo = numbers.nextDouble();
				double division;

				if ( numberOne != 0 && numberTwo == 0) {
					System.out.println("divisao impossivel");

				} else if (numberOne == 0 && numberTwo != 0) {
					
					if(numberTwo < 0) {
						numberTwo = numberTwo * -1;
					}

					division = (numberOne / numberTwo);
					System.out.printf("%.1f%n", division);

				} else if (numberOne == 0 && numberTwo == 0) {

					System.out.printf("0.0");
				}

				else {

					division = (numberOne / numberTwo);
					System.out.printf("%.1f%n", division);

				}

			}

		}
	}

}
