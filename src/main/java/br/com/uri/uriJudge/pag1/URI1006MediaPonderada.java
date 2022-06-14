package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1006MediaPonderada {

	public static void main(String[] args) {

		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			double noteOne = number.nextDouble();
			double noteTwo = number.nextDouble();
			double noteThree = number.nextDouble();

			double media = ((noteOne * 2) + (noteTwo * 3) + (noteThree * 5)) / 10.00;

			System.out.println("MEDIA = " + String.format("%.1f", media));
		}

	}
}
