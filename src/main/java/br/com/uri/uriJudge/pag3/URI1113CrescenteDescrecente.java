package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1113CrescenteDescrecente {
	public static void main(String[] args) {

		try (Scanner variable = new Scanner(System.in)) {
			variable.useLocale(Locale.ENGLISH);
			int numberOne;
			int numberTwo;
			String valida ;

			while (((numberOne = variable.nextInt()) != (numberTwo = variable.nextInt()))) {

				valida = numberOne > numberTwo ? "Decrescente" : "Crescente";
				System.out.println(valida);

			}

		}
	}

}
