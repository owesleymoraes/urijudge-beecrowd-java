package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1046TempoJogo {
	public static void main(String[] args) {

		try (Scanner hourPlay = new Scanner(System.in)) {

			hourPlay.useLocale(Locale.ENGLISH);

			String[] hourPlayText = hourPlay.nextLine().split(" ");

			int hourStart = Integer.parseInt(hourPlayText[0]);
			int hourEnd = Integer.parseInt(hourPlayText[1]);
			int timePlay;

			if (hourStart == hourEnd) {
				System.out.println("O JOGO DUROU 24 HORA(S)");
				return;
			}

			if (hourStart < hourEnd ) {
				timePlay = hourEnd - hourStart;

				System.out.printf("O JOGO DUROU %d HORA(S)\n", timePlay);
				return;
			}

			if (hourStart >= 12 && hourEnd <= 11) {
				timePlay = (24 - hourStart) + hourEnd;
				System.out.printf("O JOGO DUROU %d HORA(S)\n", timePlay);
				return;
			}
			
			

		}
	}

}
