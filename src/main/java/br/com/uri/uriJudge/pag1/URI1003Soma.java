package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1003Soma {

	public static void main(String[] args) {

		try(Scanner number = new Scanner(System.in)){
			number.useLocale(Locale.ENGLISH);
			
			int numberOne = number.nextInt();
			int numberTwo = number.nextInt();
			
			int sum = numberOne + numberTwo;
			
			System.out.println("SOMA = " + sum );
		}

	}

}
