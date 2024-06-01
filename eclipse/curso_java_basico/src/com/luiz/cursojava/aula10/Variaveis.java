package com.luiz.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {

		// Convernção Java
		int idade = 19;
		String nome = "Luiz";
		String nomeDoMeuCachorro = "Lulu";
		String ano2014 = "2014";
		
		// Aceito, mas não utilizada
		int _idade;
		int $idade;

		// Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 20;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// Má prática
		int a = 10;
		String b = "Luiz";
	}

}
