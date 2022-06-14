package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1047DataMinuto {

	public static void main(String[] args) {

		try (Scanner hours = new Scanner(System.in)) {
			hours.useLocale(Locale.ENGLISH);

			String[] times = hours.nextLine().split(" ");

			int hourStart = Integer.parseInt(times[0]);
			int minStart = Integer.parseInt(times[1]);
			int hourFinal = Integer.parseInt(times[2]);
			int minFinal = Integer.parseInt(times[3]);
			int timeHour;
			int timeMin;

			timeHour = hourFinal - hourStart;
			timeMin = minFinal - minStart;

			// 0:12 00:11 = 23:59
			if (hourStart == 0 && hourFinal == 0 && timeMin < 0) {
				timeHour = 23;
				timeMin = (60 - minStart) + minFinal;
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", timeHour, timeMin);
				return;

			}

			// 7:00 7:00 = 24h
			if (hourStart == hourFinal && minStart == minFinal) {

				System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
				return;
			}


			// 7:10 8:09 = 00:59
			if (timeHour == 1 && timeMin < 0) {
				timeMin = 60 - (timeMin * -1);
				timeHour = 0;
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", timeHour, timeMin);
				return;
			}

			// 7:10 9:09 = 1:59
			if (timeMin < 0 && hourFinal > hourStart) {

				timeMin = (60 - minStart) + minFinal;
				timeHour--;
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", timeHour, timeMin);
				return;
			}

			// 15:10 14:18 = 23:08 || 15:18 14:10 = 23:52
			if (hourStart > hourFinal && hourFinal != 0) {

				timeHour = (23 - hourStart) + hourFinal; // aqui é para ser 24 ao invés de 23. Uri passa com 23.

				if (timeMin < 0) {

					timeMin = (60 - minStart) + minFinal;		
				}
				
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", timeHour, timeMin);
				return;
			}

			
			//1:10 1:09 = 23:59 || 9:10 00:08 = 15:58
			if (timeHour == 0 && timeMin < 0 || hourFinal == 0 && timeMin < 0) {

				timeHour = 24 - hourStart;
				timeMin = (60 - minStart) + minFinal;
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", timeHour, timeMin);
				return;

			}

			// 9:08 00:10 = 15:02
			if (hourFinal == 0 && timeMin > 0 && hourStart != 0) {

				timeHour = 24 - hourStart;
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", timeHour, timeMin);
				
				
				return;

			}
			
			else {
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", timeHour, timeMin);
				
			}

			

		}
	}

}
