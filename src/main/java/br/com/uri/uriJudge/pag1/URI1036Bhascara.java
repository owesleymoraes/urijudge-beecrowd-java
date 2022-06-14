package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1036Bhascara {

	public static void main(String[] args) {
		try (Scanner coefficientsText = new Scanner(System.in)) {
			coefficientsText.useLocale(Locale.ENGLISH);

			String coefficients[] = coefficientsText.nextLine().split(" ");

			double coefficientsA = Double.parseDouble(coefficients[0]);
			double coefficientsB = Double.parseDouble(coefficients[1]);
			double coefficientsC = Double.parseDouble(coefficients[2]);

			if (coefficientsA == 0) {
				System.out.println("Impossivel calcular");
				return;
			}

			double delta = (Math.pow(coefficientsB, 2)) - (4 * coefficientsA * coefficientsC);

			if (delta <= 0) {
				System.out.println("Impossivel calcular");
			} else {
				
				double r1 = ((-coefficientsB) + (Math.sqrt(delta))) / (2 * coefficientsA);
				double r2 = ((-coefficientsB) - (Math.sqrt(delta))) / (2 * coefficientsA);

				System.out.println("R1 = " + String.format("%.5f", r1) + "\n" + "R2 = " + String.format("%.5f", r2));
			}

		}
	}

}
