package br.com.uri.uriJudge.pag2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class URI1061LocalDateTime {
	public static void main(String[] args) {
		try (Scanner variables = new Scanner(System.in)) {
			variables.useLocale(Locale.ENGLISH);

			String[] dayEvent = variables.nextLine().split(" ");
			String[] hourEvent = variables.nextLine().split(" : ");

			int dayStart = Integer.parseInt(dayEvent[1]);
			int hourStart = Integer.parseInt(hourEvent[0]);
			int minStart = Integer.parseInt(hourEvent[1]);
			int secondStart = Integer.parseInt(hourEvent[2]);

			String[] dayEventFinal = variables.nextLine().split(" ");
			String[] hourEventFinal = variables.nextLine().split(" : ");

			int dayFinal = Integer.parseInt(dayEventFinal[1]);
			int hourFinal = Integer.parseInt(hourEventFinal[0]);
			int minFinal = Integer.parseInt(hourEventFinal[1]);
			int secondFinal = Integer.parseInt(hourEventFinal[2]);


			LocalDateTime dateStart = LocalDateTime.of(2022, 4, dayStart, hourStart, minStart, secondStart);
			LocalDateTime dateFinal = LocalDateTime.of(2022, 4, dayFinal, hourFinal, minFinal, secondFinal);

			long day = ChronoUnit.DAYS.between(dateStart, dateFinal);
			long hour = (ChronoUnit.HOURS.between(dateStart, dateFinal)) - (24 * day); // dias em horas.
			long minutes = (ChronoUnit.MINUTES.between(dateStart, dateFinal)) - (day * 24 * 60) - (hour * 60); // dias-min | hour-min
			long second = (ChronoUnit.SECONDS.between(dateStart, dateFinal)) - (day * 24 * 60 * 60) - (hour * 60 * 60 ) - (minutes * 60); //tudo para segundo.

			System.out.println(day + " dia(s)");
			System.out.println(hour + " hora(s)");
			System.out.println(minutes + " minuto(s)");
			System.out.println(second + " segundo(s)");

		}
	}

}
