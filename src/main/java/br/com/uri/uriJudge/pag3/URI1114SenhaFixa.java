package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1114SenhaFixa {

	public static void main(String[] args) {

		try (Scanner setence = new Scanner(System.in)) {

			setence.useLocale(Locale.ENGLISH);

			while ((setence.nextInt()) != 2002) {

				System.out.println("Senha Invalida");

			}

			System.out.println("Acesso Permitido");

		}
	}
}
