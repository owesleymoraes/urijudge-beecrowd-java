package br.com.uri.uriJudge.pag2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class URI1050MapDDD {

	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {
			number.useLocale(Locale.ENGLISH);

			int ddd = number.nextInt();

			Map<Integer, String> codeDDD = new HashMap<>();

			codeDDD.put(61, "Brasilia");
			codeDDD.put(71, "Salvador");
			codeDDD.put(11, "Sao Paulo");
			codeDDD.put(21, "Rio de Janeiro");
			codeDDD.put(32, "Juiz de Fora");
			codeDDD.put(19, "Campinas");
			codeDDD.put(27, "Vitoria");
			codeDDD.put(31, "Belo Horizonte");

			if (codeDDD.containsKey(ddd)) {
				System.out.println(codeDDD.get(ddd));
				
			} else {
				System.out.println("DDD nao cadastrado");
			}

		}
	}

}
