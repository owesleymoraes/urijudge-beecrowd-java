package br.com.uri.uriJudge.pag3;

public class URI1096SequenciaIj2 {

	public static void main(String[] args) {

		int countIndexOne = 1;
		int countIndexTwo = 7;

		for (int i = 1; i <= 5; i++) {

			for (int index = 1; index <= 3; index++) {

				System.out.println("I=" + countIndexOne + " J=" + countIndexTwo);
				countIndexTwo -= 1;
			}

			countIndexOne += 2;
			countIndexTwo = 7;

		}

	}
}
