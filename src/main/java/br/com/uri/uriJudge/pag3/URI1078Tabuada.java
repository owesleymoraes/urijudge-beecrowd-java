package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1078Tabuada {
	public static void main(String[] args) {
		try (Scanner variable = new Scanner(System.in)) {
			variable.useLocale(Locale.ENGLISH);

			int number = variable.nextInt();
			int index = 1;
		
			for (int i = 1; i <= 10; i++) {

				System.out.println(index + " x " + number + " = " + (index * number));
				index ++;

			}
		}
	}

}
