package br.com.uri.uriJudge.pag3;

import java.text.DecimalFormat;

public class URI1098SequenciaIj4 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0");
		double countIndexOne = 0.0;
		double countIndexTwo = 1.0;

		while (countIndexOne <= 2) {

			for (int indexAux = 1; indexAux <= 3; indexAux++) {

				if (df.format(countIndexOne).endsWith("0")) {
					System.out.println("I=" + df.format(countIndexOne).substring(0, 1) + " J="
							+ df.format(countIndexTwo).substring(0, 1));

				} else {
					System.out.println("I=" + df.format((countIndexOne)) + " J=" + df.format((countIndexTwo)));
				}

				countIndexTwo += 1;

			}
			
			//zerando coluna J;
			countIndexTwo -= 3;
			countIndexOne += 0.2;
			countIndexTwo += 0.2;

		}

	}
}
