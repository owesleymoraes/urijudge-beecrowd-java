package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1020Tempo {
	public static void main(String[] args) {
		try (Scanner days = new Scanner(System.in)) {

			days.useLocale(Locale.ENGLISH);

			double time = days.nextDouble();
			int year = (int) time / 365;
			int restYear = (int) time % 365;

			int month = (int) restYear / 30;
			int restMonth = restYear % 30;

			System.out.println(year + " ano(s)" + "\n" + month + " mes(es)" + "\n" + restMonth + " dia(s)");

		}
	}

}
