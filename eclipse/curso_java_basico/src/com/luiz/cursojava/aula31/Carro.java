package com.luiz.cursojava.aula31;

public class Carro {	
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia() {		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calculaCombustivel(double km) {
		return this.divideKMPorConsumoCombustivel(km);
	}
	
}
