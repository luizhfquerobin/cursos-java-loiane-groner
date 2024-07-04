package com.luiz.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {

		String curso = "Curso ";
		String java = "Java";
		String cursoJava = curso + java;
		System.out.println(cursoJava);

		String resultado2Com2 = "Resultado de 2 + 2 = " + (2 + 2);
		System.out.println(resultado2Com2);

		String resultado2Com2_ = "Resultado de 2 + 2 = " + 2 + 2;
		System.out.println(resultado2Com2_);

		String um = String.valueOf(1);
		System.out.println(um);

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ultrices suscipit odio, "
				+ "eu egestas metus eleifend quis. Maecenas nec neque ipsum. Etiam iaculis eleifend ante in accumsan.";
		System.out.println(concatenacao);

		String concatencao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ultrices suscipit odio, ";
		concatencao2 += "eu egestas metus eleifend quis. Maecenas nec neque ipsum. Etiam iaculis eleifend ante in accumsan.";
		System.out.println(concatencao2);

	}

}
