package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1038Lanche {
	public static void main(String[] args) {
		try (Scanner variable = new Scanner(System.in)) {
			variable.useLocale(Locale.ENGLISH);

			String number[] = variable.nextLine().split(" ");

			int item = Integer.parseInt(number[0]);
			int amount = Integer.parseInt(number[1]);

			switch (item) {
			case 1:
				double valueItemOne = amount * 4.00;
				System.out.println("Total: R$ " + String.format("%.2f", valueItemOne));
				break;

			case 2:
				double valueItemTwo = amount * 4.50;
				System.out.println("Total: R$ " + String.format("%.2f", valueItemTwo));
				break;

			case 3:
				double valueItemThree = amount * 5.00;
				System.out.println("Total: R$ " + String.format("%.2f", valueItemThree));
				break;

			case 4:
				double valueItemFour = amount * 2.00;
				System.out.println("Total: R$ " + String.format("%.2f", valueItemFour));
				break;

			case 5:
				double valueItemFive = amount * 1.50;
				System.out.println("Total: R$ " + String.format("%.2f", valueItemFive));
				break;

			}

		}
	}

}
