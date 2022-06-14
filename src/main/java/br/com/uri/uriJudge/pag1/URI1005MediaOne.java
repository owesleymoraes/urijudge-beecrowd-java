package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1005MediaOne {

	public static void main(String[] args) {

		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			double numberOne = number.nextDouble();
			double numberTwo = number.nextDouble();

			double media = ((numberOne * 3.5) + (numberTwo * 7.5)) / 11.00;

			System.out.println("MEDIA = " + String.format("%.5f", media));
		}

	}

}
