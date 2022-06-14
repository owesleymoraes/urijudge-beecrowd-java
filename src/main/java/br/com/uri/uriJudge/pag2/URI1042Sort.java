package br.com.uri.uriJudge.pag2;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class URI1042Sort {
	public static void main(String[] args) {
		try (Scanner numbers = new Scanner(System.in)) {

			numbers.useLocale(Locale.ENGLISH);

			String number[] = numbers.nextLine().split(" ");

			int numberOne = Integer.parseInt(number[0]);
			int numberTwo = Integer.parseInt(number[1]);
			int numberThree = Integer.parseInt(number[2]);

			int[] listOrder = { numberOne, numberTwo, numberThree };

			Arrays.sort(listOrder);

			for (int list : listOrder) {
				System.out.println(list);

			}

			System.out.println("");
			System.out.println( numberOne);
			System.out.println(numberTwo);
			System.out.println(numberThree);

		}
	}

}
