package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1012Areas {

	public static void main(String[] args) {

		try (Scanner number = new Scanner(System.in)) {

			number.useLocale(Locale.ENGLISH);

			String sideFigure[] = number.nextLine().split(" ");

			double sideA = Double.parseDouble(sideFigure[0]);
			double sideB = Double.parseDouble(sideFigure[1]);
			double sideC = Double.parseDouble(sideFigure[2]);

			double triangle = ((sideA * sideC) / 2.0);
			double circle = 3.14159 * Math.pow(sideC, 2);
			double trapeze = ((sideA + sideB) * sideC) / 2.00;
			double square = Math.pow(sideB, 2);
			double rectangle = sideA * sideB;

			System.out.println("TRIANGULO: " + String.format("%.3f", triangle));
			System.out.println("CIRCULO: " + String.format("%.3f", circle));
			System.out.println("TRAPEZIO: " + String.format("%.3f", trapeze));
			System.out.println("QUADRADO: " + String.format("%.3f", square));
			System.out.println("RETANGULO: " + String.format("%.3f", rectangle));

		}

	}

}
