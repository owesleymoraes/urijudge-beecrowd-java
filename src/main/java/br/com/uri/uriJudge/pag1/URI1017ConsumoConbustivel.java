package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1017ConsumoConbustivel {
	public static void main(String[] args) {
		try (Scanner numbers = new Scanner(System.in)) {

			numbers.useLocale(Locale.ENGLISH);

			int hour = numbers.nextInt();
			int speed = numbers.nextInt();
			int distance = speed * hour;

			double fuel = distance / 12.00;
			
			
				System.out.println(String.format("%.3f", fuel));
		}
	}

}
