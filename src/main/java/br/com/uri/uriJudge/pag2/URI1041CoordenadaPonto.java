package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1041CoordenadaPonto {

	public static void main(String[] args) {
		try (Scanner point = new Scanner(System.in)) {
			point.useLocale(Locale.ENGLISH);

			String pointText[] = point.nextLine().split(" ");

			double x = Double.parseDouble(pointText[0]);
			double y = Double.parseDouble(pointText[1]);

			if (x > 0 && y > 0) {
				System.out.println("Q1");
				return;
			}

			if (x < 0 && y > 0) {
				System.out.println("Q2");
				return;
			}

			if (x < 0 && y < 0) {
				System.out.println("Q3");
				return;
			}

			if (x > 0 && y < 0) {
				System.out.println("Q4");
				return;
			}
			
			if (x == 0 && y == 0) {
				System.out.println("Origem");
				return;
			}
			
			if (x == 0 && y > 0 || y < 0) {
				System.out.println("Eixo Y");
				return;
			}
			
			if (x > 0 || x < 0 && y == 0) {
				System.out.println("Eixo X");
				return;
			}

		}
	}

}
