package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1009BonusPercentual {

	public static void main(String[] args) {

		try (Scanner variable = new Scanner(System.in)) {
			variable.useLocale(Locale.ENGLISH);

			String nameUser = variable.nextLine();
			double salary = variable.nextDouble();
			double salesAmaunt = variable.nextDouble();
			
			double wageFinal = salary + (salesAmaunt* 0.15);
			
			System.out.println("TOTAL = R$ " + String.format("%.2f", wageFinal));

		}
	}

}
