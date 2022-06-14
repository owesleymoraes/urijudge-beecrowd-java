package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1011AreaCirculo {

	public static void main(String[] args) {

		try (Scanner variable = new Scanner(System.in)) {
			variable.useLocale(Locale.ENGLISH);
			
			double radius = variable.nextDouble();
			
			double volume = (4.0/3.0) * 3.14159 * Math.pow(radius, 3);
			
			System.out.println("VOLUME = " + String.format("%.3f",volume));
		}

	}

}
