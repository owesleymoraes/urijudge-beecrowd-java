package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1019Tempo {
	public static void main(String[] args) {
		try (Scanner secondsTotal = new Scanner(System.in)) {

			secondsTotal.useLocale(Locale.ENGLISH);
			int hour;
			double minutes;

			double minutesComplete = secondsTotal.nextDouble() / 60;
			minutes = (int) minutesComplete;
			double secundes = Math.round((minutesComplete - minutes) * 60);

			if (minutes >= 60) {

				hour = (int) minutes / 60;
				double hourDecimal = minutes / 60;
				minutes = Math.round((hourDecimal - hour) * 60);

			} else {
				hour = 0;
			}

			System.out.println(hour + ":" + String.format("%.0f", minutes) + ":" + String.format("%.0f", secundes));

		}
	}

}
