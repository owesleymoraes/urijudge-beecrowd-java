package br.com.uri.uriJudge.pag1;

import java.util.Locale;
import java.util.Scanner;

public class URI1015DistanciaPonto {
	public static void main(String[] args) {

		try (Scanner lines = new Scanner(System.in)) {
			lines.useLocale(Locale.ENGLISH);

			String pontOne[] = lines.nextLine().split(" ");
			String pontTwo[] = lines.nextLine().split(" ");

			double abscisionPontOne = Double.parseDouble(pontOne[0]);
			double orderedPontOne = Double.parseDouble(pontOne[1]);

			double abscisionPontTwo = Double.parseDouble(pontTwo[0]);
			double orderedPontTwo = Double.parseDouble(pontTwo[1]);

			double p1 = (abscisionPontTwo - abscisionPontOne);
			double p2 = (orderedPontTwo - orderedPontOne);

			double distance = Math.sqrt((Math.pow(p1, 2)) + (Math.pow(p2, 2)));
			
			System.out.println(String.format("%.4f", distance));

		}
	}

}
