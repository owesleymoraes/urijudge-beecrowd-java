package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1043Triangulo {

	public static void main(String[] args) {
		try (Scanner sides = new Scanner(System.in)) {
			sides.useLocale(Locale.ENGLISH);

			String[] sideTriangle = sides.nextLine().split(" ");

			double sideA = Double.parseDouble(sideTriangle[0]);
			double sideB = Double.parseDouble(sideTriangle[1]);
			double sideC = Double.parseDouble(sideTriangle[2]);

			boolean validsideA = (Math.abs(sideB - sideC) < sideA) && sideA < (sideB + sideC);
			boolean validsideB = (Math.abs(sideA - sideC) < sideB) && (sideB < (sideA + sideC));
			boolean validsideC = (Math.abs(sideA - sideB) < sideC) && (sideC < (sideA + sideB));

			if (validsideA && validsideB && validsideC) {

				double perimeterTriangle = sideA + sideB + sideC;
				System.out.printf("Perimetro = %.1f\n", perimeterTriangle);

			} else {

				double areaTrapeze = ((sideA + sideB) * sideC) / 2.0;

				System.out.printf("Area = %.1f\n", areaTrapeze);

			}

		}
	}

}
