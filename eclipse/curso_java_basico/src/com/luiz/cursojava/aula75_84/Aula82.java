package com.luiz.cursojava.aula75_84;

public class Aula82 {

	public static void main(String[] args) {

		String alfabeto = String.join(", ", "A", "B", "C", "D");
		System.out.println(alfabeto);

		String[] letras = alfabeto.split(", ");
		for (String letra : letras) {
			System.out.println(letra);
		}

	}

}
