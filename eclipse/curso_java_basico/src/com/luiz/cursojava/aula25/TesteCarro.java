package com.luiz.cursojava.aula25;

import com.luiz.cursojava.aula25.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);

		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());
		double qtdCombustivel10 = van.calculaCombustivel(10);
		double qtdCombustivel15 = van.calculaCombustivel(15);
		
		System.out.println("qtdC|ombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdC|ombustivel15 = " + qtdCombustivel15);
	}

}
