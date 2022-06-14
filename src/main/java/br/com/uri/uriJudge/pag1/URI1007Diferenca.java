package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1007Diferenca {
	
	public static void main (String[] args) {
		try (Scanner number = new Scanner(System.in)){
			number.useLocale(Locale.ENGLISH);
			
			int numberOne = number.nextInt();
			int numberTwo = number.nextInt();
			int numberThree = number.nextInt();
			int numberFour = number.nextInt();
			
			int diferenca = (numberOne * numberTwo) - (numberThree * numberFour);
			
			System.out.println("DIFERENCA = " + diferenca);
			
		}
	}
	

}
