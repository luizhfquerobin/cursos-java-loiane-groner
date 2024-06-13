package com.luiz.cursojava.aula52;

public class DivisaoNaoExata extends Exception {
	private int num;
	private int dem;
	
	public DivisaoNaoExata(int nun, int denominador) {
		super();
		this.num = nun;
		this.dem = denominador;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + " / " + dem + " não é um inteiro!";
	}
	
	
	
	
}
