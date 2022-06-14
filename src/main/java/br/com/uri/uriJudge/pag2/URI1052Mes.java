package br.com.uri.uriJudge.pag2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class URI1052Mes {
	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			int monthNumber = number.nextInt();

			Map<Integer, String> month = new HashMap<Integer, String>();

			month.put(1, "January");
			month.put(2, "February");
			month.put(3, "March");
			month.put(4, "April");
			month.put(5, "May");
			month.put(6, "June");
			month.put(7, "July");
			month.put(8, "August");
			month.put(9, "September");
			month.put(10, "October");
			month.put(11, "November");
			month.put(12, "December");

			System.out.println(month.get(monthNumber));

		}
	}

}
