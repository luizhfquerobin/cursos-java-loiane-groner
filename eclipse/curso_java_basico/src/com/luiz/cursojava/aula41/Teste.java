package com.luiz.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		aluno.setEndereco("Rua Perso, 432");
		professor.setEndereco("Rua Tiron, 541");
		
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}

}
