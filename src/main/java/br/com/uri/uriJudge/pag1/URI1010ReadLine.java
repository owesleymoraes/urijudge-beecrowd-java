package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1010ReadLine {

	public static void main(String[] args) {

		try (Scanner variables = new Scanner(System.in)) {

			variables.useLocale(Locale.ENGLISH);

			String partMechanicOne[] = variables.nextLine().split(" ");
			String partMechanicTwo[] = variables.nextLine().split(" ");

			int numberPartOne = Integer.parseInt(partMechanicOne[0]);
			int amountPartOne = Integer.parseInt(partMechanicOne[1]);
			double custPartOne = Double.parseDouble(partMechanicOne[2]);

			int numberPartTwo = Integer.parseInt(partMechanicTwo[0]);
			int amountPartTwo = Integer.parseInt(partMechanicTwo[1]);
			double custPartTwo = Double.parseDouble(partMechanicTwo[2]);

			double total = (amountPartOne * custPartOne) + (amountPartTwo * custPartTwo);

			System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

		}

	}

}
