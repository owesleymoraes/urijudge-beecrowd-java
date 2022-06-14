package br.com.uri.uriJudge.pag2;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class URI1040Media {
	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			String notes[] = number.nextLine().split(" ", 4);

			double noteA = Double.parseDouble(notes[0]);
			double noteB = Double.parseDouble(notes[1]);
			double noteC = Double.parseDouble(notes[2]);
			double noteD = Double.parseDouble(notes[3]);

			double mean = ((noteA * 2) + (noteB * 3) + (noteC * 4) + (noteD * 1)) / 10.00;
			DecimalFormat df = new DecimalFormat("#.0");

			if (mean >= 7.0) {
				System.out.println("Media: " + df.format(mean));
				System.out.println("Aluno aprovado.");
				return;
			}

			if (mean < 5.0) {
				System.out.println("Media: " + df.format(mean));
				System.out.println("Aluno reprovado.");
				return;
			}

			if (mean >= 5.0 && mean <= 6.9) {

				System.out.println("Media: " + df.format(mean));
				System.out.println("Aluno em exame.");

				double noteExam = number.nextDouble();

				System.out.println("Nota do exame: " + noteExam);

				double finalMean = (noteExam + mean) / 2.00;

				if (finalMean >= 5.0) {
					System.out.println("Aluno aprovado.");
					System.out.println("Media final: " + df.format(finalMean));
					
				} else {
					System.out.println("Aluno reprovado.");
					System.out.println("Media final: " + df.format(finalMean));
				}

				return;
			}

		}
	}

}
