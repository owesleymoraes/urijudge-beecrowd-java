package br.com.uri.uriJudge.pag2;

import java.util.Locale;
import java.util.Scanner;

public class URI1049Animal {
	public static void main(String[] args) {
		try (Scanner types = new Scanner(System.in)) {
			types.useLocale(Locale.ENGLISH);

			String bones = types.nextLine();
			String animalType = types.nextLine();
			String animal = types.nextLine();
			String nameAnimal;

			if (bones.equals("vertebrado")) {

				if (animalType.equals("ave")) {

					nameAnimal = animal.equals("carnivoro") ? "aguia" : "pomba";
				}

				else {
					nameAnimal = animal.equals("onivoro") ? "homem" : "vaca";
				}
				System.out.println(nameAnimal);
				return;
			}

			else {

				if (animalType.equals("inseto")) {

					nameAnimal = animal.equals("hematofago") ? "pulga" : "lagarta";
				}

				else {
					nameAnimal = animal.equals("hematofago") ? "sanguessuga" : "minhoca";
				}

				System.out.println(nameAnimal);

			}

		}
	}

}
