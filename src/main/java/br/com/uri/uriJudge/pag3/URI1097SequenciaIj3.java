package br.com.uri.uriJudge.pag3;

public class URI1097SequenciaIj3 {

	public static void main(String[] args) {

		int countIndexOne = 1;
		int countIndexTwo = 7;
		int countAuxiliary = 2;

		for (int i = 1; i <= 5; i++) {

			for (int index = 1; index <= 3; index++) {

				System.out.println("I=" + countIndexOne + " J=" + countIndexTwo);
				countIndexTwo -= 1;
			}

			countIndexOne += 2;
			countIndexTwo = 7 + countAuxiliary;
			countAuxiliary += 2;

		}

	}
}
