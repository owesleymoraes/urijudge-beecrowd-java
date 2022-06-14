package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1035TesteSelecao1 {
	public static void main(String[] args) {
		try (Scanner numbers = new Scanner(System.in)) {
			numbers.useLocale(Locale.ENGLISH);

			String letter[] = numbers.nextLine().split(" ");

			int A = Integer.parseInt(letter[0]);
			int B = Integer.parseInt(letter[1]);
			int C = Integer.parseInt(letter[2]);
			int D = Integer.parseInt(letter[3]);

			if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {

				System.out.println("Valores aceitos");

			} else {
				System.out.println("Valores nao aceitos");
			}

		}
	}

}
