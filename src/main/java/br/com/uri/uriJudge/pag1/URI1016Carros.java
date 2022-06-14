package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1016Carros {
	public static void main(String[] args) {

		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			int distance = number.nextInt();
			int time = distance * 2;
			System.out.println(time + " minutos");
		}

	}

}
