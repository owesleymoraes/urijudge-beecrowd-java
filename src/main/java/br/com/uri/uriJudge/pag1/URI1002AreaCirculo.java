package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1002AreaCirculo {

	public static void main(String[] args) {

	
		

		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.US);

			double radius = number.nextDouble();

			

			double area = 3.14159 * Math.pow(radius, 2);
			
			
			

			System.out.println("A=" + String.format("%.4f", area));
		}

	}

}
