package br.com.uri.uriJudge.pag3;

import java.util.Scanner;

public class URI1074ParImpa {
	public static void main(String[] args) {

		try (Scanner inputNumber = new Scanner(System.in)) {

			int amountSetence = inputNumber.nextInt();
			int setence;

			for (int i = 1; i <= amountSetence; i++) {
				setence = inputNumber.nextInt();

				if (setence == 0) {
					System.out.println("NULL");
					
				}

				if (setence % 2 == 0 && setence != 0) {
					if (setence > 0) {
						System.out.println("EVEN POSITIVE");
						
					} else {
						System.out.println("EVEN NEGATIVE");
						
					}
				} else {
					if (setence > 0) {
						System.out.println("ODD POSITIVE");
						
					} if(setence < 0) {
						System.out.println("ODD NEGATIVE");
						
					}

				}

			}

		}
	}

}
