package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1048AumentoSalario {
	public static void main(String[] args) {

		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			double salary = number.nextDouble();
			double newSalary = 0;
			double readjust = 0;
			String percent = "";

			if (salary >= 0 && salary <= 400.00) {

				newSalary = salary * 1.15;
				readjust = salary * 0.15;
				percent = "15";

			}

			if (salary >= 400.01 && salary <= 800.00) {

				newSalary = salary * 1.12;
				readjust = salary * 0.12;
				percent = "12";

			}

			if (salary >= 800.01 && salary <= 1200.00) {

				newSalary = salary * 1.10;
				readjust = salary * 0.10;
				percent = "10";

			}

			if (salary >= 1200.01 && salary <= 2000.00) {

				newSalary = salary * 1.07;
				readjust = salary * 0.07;
				percent = "7";
			}

			if (salary > 2000) {

				newSalary = salary * 1.04;
				readjust = salary * 0.04;
				percent = "4";

			}

			System.out.println("Novo salario: " + String.format("%.2f",newSalary));
			System.out.println("Reajuste ganho: " + String.format("%.2f",readjust));
			System.out.println("Em percentual: " + percent + " %");

//			System.out.printf("Novo salario: %.2f \nReajuste ganho: %.2f \nEm percentual: %s %%", newSalary, readjust,
//					percent);

		}
	}

}
