package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1051ImpostoRenda {
	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {

			number.useLocale(Locale.ENGLISH);

			double salary = number.nextDouble();

			if (salary > 0 && salary <= 2000.00) {

				System.out.println("Isento");
				return;
			}

			if (salary > 2000.01 && salary <= 3000.00) {
				double incomeTax = (salary-2000) * 0.08;
				System.out.println("R$ " + String.format("%.2f", incomeTax));
				return;
			}

			if (salary > 3000.01 && salary <= 4500.00) {
				double incomeTax = (1000 * 0.08) + ((salary - 3000) * 0.18);
				System.out.println("R$ " + String.format("%.2f", incomeTax));
				return;
			}

			if (salary > 4500.00) {
				double incomeTax =  (1000 * 0.08) + (1500 * 0.18) + ((salary - 4500) * 0.28);
				System.out.println("R$ " + String.format("%.2f", incomeTax));
				return;
			}

		}
	}

}
