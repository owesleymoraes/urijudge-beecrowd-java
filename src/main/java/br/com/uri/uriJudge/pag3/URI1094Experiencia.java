package br.com.uri.uriJudge.pag3;

import java.util.Locale;
import java.util.Scanner;

public class URI1094Experiencia {

	public static void main(String[] args) {

		try (Scanner setenceText = new Scanner(System.in)) {

			setenceText.useLocale(Locale.ENGLISH);

			int amountTest = Integer.parseInt(setenceText.nextLine());

			double amountTotal = 0.0;
			int amountMouse = 0;
			int amountBunny = 0;
			int amountFrog = 0;
			int amountAnimal = 0;

			for (int index = 1; index <= amountTest; index++) {

				String[] amountTypeTest = setenceText.nextLine().split(" ");

				amountAnimal = Integer.parseInt(amountTypeTest[0]);
				String amountTypeAnimal = amountTypeTest[1];

				if (amountTypeAnimal.equals("C")) {

					amountBunny += amountAnimal;

				}

				if (amountTypeAnimal.equals("R")) {

					amountMouse += amountAnimal;

				}

				if (amountTypeAnimal.equals("S")) {

					amountFrog += amountAnimal;

				}

			}

			amountTotal = amountBunny + amountMouse + amountFrog;

			double percentegeBunny = ((amountBunny / amountTotal) * 100);
			double percentegeMouse = (amountMouse / amountTotal) * 100;
			double percentegeFrog = (amountFrog / amountTotal) * 100;

			System.out.println(String.format("Total: %.0f cobaias", amountTotal));
			System.out.println("Total de coelhos: " + amountBunny);
			System.out.println("Total de ratos: " + amountMouse);
			System.out.println("Total de sapos: " + amountFrog);

			System.out.println(String.format("Percentual de coelhos: %.2f", percentegeBunny) + " %");
			System.out.println(String.format("Percentual de ratos: %.2f", percentegeMouse) + " %");
			System.out.println(String.format("Percentual de sapos: %.2f", percentegeFrog) + " %");
		}

	}

}
