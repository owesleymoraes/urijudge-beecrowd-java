package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1014Consumo {

	public static void main(String[] args) {

		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			int distance = number.nextInt();
			double fuel = number.nextDouble();
			
			double consumption = distance / fuel ;
			
			System.out.println(String.format("%.3f", consumption) + " km/l");

		}

	}

}
