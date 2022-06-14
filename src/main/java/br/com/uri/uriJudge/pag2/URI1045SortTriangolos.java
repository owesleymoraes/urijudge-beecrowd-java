package br.com.uri.uriJudge.pag2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class URI1045SortTriangolos {

	public static void main(String[] args) {
		try (Scanner sidesText = new Scanner(System.in)) {

			sidesText.useLocale(Locale.ENGLISH);

			String[] sides = sidesText.nextLine().split(" ");

			double sideA = Double.parseDouble(sides[0]);
			double sideB = Double.parseDouble(sides[1]);
			double sideC = Double.parseDouble(sides[2]);

			Double[] sidesTriangle = { sideA, sideB, sideC };

			Arrays.sort(sidesTriangle, Collections.reverseOrder());

			double A = sidesTriangle[0];
			double B = sidesTriangle[1];
			double C = sidesTriangle[2];

			if (A >= (B + C)) {

				System.out.println("NAO FORMA TRIANGULO");
				return;
			}

			if ((Math.pow(A, 2)) == ((Math.pow(B, 2)) + (Math.pow(C, 2)))) {

				System.out.println("TRIANGULO RETANGULO");

			}

			if ((Math.pow(A, 2)) > ((Math.pow(B, 2)) + (Math.pow(C, 2)))) {

				System.out.println("TRIANGULO OBTUSANGULO");

			}

			if ((Math.pow(A, 2)) < ((Math.pow(B, 2)) + (Math.pow(C, 2)))) {

				System.out.println("TRIANGULO ACUTANGULO");

			}

			if (A == B && B == C) {

				System.out.println("TRIANGULO EQUILATERO");
				return;
			}

			if (A == B || B == C || A == C) {

				System.out.println("TRIANGULO ISOSCELES");

			}

		}

	}
}
