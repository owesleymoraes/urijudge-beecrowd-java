package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1018Cedulas {
	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			int banknotes = number.nextInt();

			int notesOneHundred = (int) (banknotes / 100); // quantidade de notas de 100
			int restOneHundred = banknotes - (notesOneHundred * 100); // resto das notas de 100

			int noteFifteen = (int) restOneHundred / 50; // quantidade de notas de 50
			int restFiffteen = restOneHundred - (noteFifteen * 50); // resto das notas de 50

			int noteTwenty = (int) restFiffteen / 20; // quantidade de notas de 20
			int restTwenty = restFiffteen - (noteTwenty * 20); // resto das notas de 20

			int noteTeen = (int) restTwenty / 10; // quantidade de notas de 10
			int restTeen = restTwenty - (noteTeen * 10); // resto das notas de 10

			int noteFive = (int) restTeen / 5; // quantidade de notas de 5
			int restFive = restTeen - (noteFive * 5); // resto das notas de 5

			int noteTwo = (int) restFive / 2; // quantidade de notas de 2
			int restTwo = restFive - (noteTwo * 2); // resto das notas de 2

			int noteOne = restTwo; // quantidade de notas de 2

			System.out.println(banknotes);

			System.out.println(notesOneHundred + " nota(s) de R$ 100,00");
			System.out.println(noteFifteen + " nota(s) de R$ 50,00");
			System.out.println(noteTwenty + " nota(s) de R$ 20,00");
			System.out.println(noteTeen + " nota(s) de R$ 10,00");
			System.out.println(noteFive + " nota(s) de R$ 5,00");
			System.out.println(noteTwo + " nota(s) de R$ 2,00");
			System.out.println(noteOne + " nota(s) de R$ 1,00");

		}

	}
}
