package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1080MaiorPosição {

	public static void main(String[] args) {

		try (Scanner variable = new Scanner(System.in)) {

			variable.useLocale(Locale.ENGLISH);

			int inputNumber = 0;
			int larger = 1;
			int numberPosition = 0;

			for (int position = 1; position <= 100; position++) {

				inputNumber = variable.nextInt();

				if (inputNumber >= larger) {

					larger = inputNumber;
					numberPosition = position;

				}

			}

			System.out.println(larger);
			System.out.println(numberPosition);

		}

	}

}
