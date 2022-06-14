package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1008Salario {
	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {
			
			number.useLocale(Locale.ENGLISH); 
			
			int registration =  number.nextInt();
			int hourWorked = number.nextInt();
			double hourCust = number.nextDouble();
			
			double wage = (hourWorked * hourCust);
			
			System.out.println("NUMBER = " + registration);
			System.out.println("SALARY = U$ " + String.format("%.2f", wage));

		}
	}

}
