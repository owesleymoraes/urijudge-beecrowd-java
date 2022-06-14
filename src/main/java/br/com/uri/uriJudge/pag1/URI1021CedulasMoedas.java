package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1021CedulasMoedas {
	public static void main(String[] args) {

		try (Scanner amountNotes = new Scanner(System.in)) {
			amountNotes.useLocale(Locale.ENGLISH);

			double notes = amountNotes.nextDouble();

			int notesOneHundred = (int) notes / 100;
			double restNotesOneHundred = notes % 100;

			int notesFifty = (int) restNotesOneHundred / 50;
			double restNotesFifty = restNotesOneHundred % 50;

			int notesTwenty = (int) restNotesFifty / 20;
			double restNotesTwenty = restNotesFifty % 20;

			int notesTeen = (int) restNotesTwenty / 10;
			double restNotesTeen = restNotesTwenty % 10;

			int notesFive = (int) restNotesTeen / 5;
			double restNotesFive = restNotesTeen % 5;

			int notesTwo = (int) restNotesFive / 2;
			double restNotesTwo = restNotesFive % 2;

			int coinOne = (int) restNotesTwo;
			int restCoinOne = (int) ((restNotesTwo - coinOne) * 100);

			int coinFifty = (int) restCoinOne / 50;
			double restCoinFifty = restCoinOne % 50;

			int coinTwentyFive = (int) restCoinFifty / 25;
			double restCoinTwentyFive = restCoinFifty % 25;

			int coinTeen = (int) restCoinTwentyFive / 10;
			double restCoinTeen = restCoinTwentyFive % 10;

			int coinFive = (int) restCoinTeen / 5;
			double restCoinfive = restCoinTeen % 5;

			int coinOneCent = (int) restCoinfive;

			System.out.println("NOTAS:");
	        System.out.println(notesOneHundred + " nota(s) de R$ 100.00");
	        System.out.println(notesFifty + " nota(s) de R$ 50.00");
	        System.out.println(notesTwenty + " nota(s) de R$ 20.00");
	        System.out.println(notesTeen + " nota(s) de R$ 10.00");
	        System.out.println(notesFive + " nota(s) de R$ 5.00");
	        System.out.println(notesTwo + " nota(s) de R$ 2.00");
	        System.out.println("MOEDAS:");
	        System.out.println(coinOne + " moeda(s) de R$ 1.00");
	        System.out.println(coinFifty + " moeda(s) de R$ 0.50");
	        System.out.println(coinTwentyFive + " moeda(s) de R$ 0.25");
	        System.out.println(coinTeen + " moeda(s) de R$ 0.10");
	        System.out.println(coinFive + " moeda(s) de R$ 0.05");
	        System.out.println(coinOneCent + " moeda(s) de R$ 0.01");

		}
	}

}
