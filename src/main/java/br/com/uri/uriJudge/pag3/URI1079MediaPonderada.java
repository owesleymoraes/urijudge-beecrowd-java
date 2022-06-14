package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1079MediaPonderada {
	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			input.useLocale(Locale.ENGLISH);

			int setence = input.nextInt();
			double avarege;

			for (int i = 1; i <= setence; i++) {

				double noteA = input.nextDouble();
				double noteB = input.nextDouble();
				double noteC = input.nextDouble();

				avarege = ((noteA * 2) + (noteB * 3) + (noteC * 5)) / 10.0;
				System.out.println(String.format("%.1f", avarege));

			}
		}
	}
}
