package com.luiz.estruturadados.lista;

public class ListaEncadeada<T> {
	
	// Atributos
	private No<T> inicio;
	private No<T> ultimo;
	private int tamanho = 0;
	
	// adiciona
	public void adiciona(T elemento) {
		No<T> celula = new No<T>(elemento);
		if (this.tamanho == 0) {
			this.inicio = celula;
		} else {
			this.ultimo.setProximo(celula);
		}
		this.ultimo = celula;
		this.tamanho++;
	}
	
	// getTamanho - interno
	public int getTamanho() {
		return this.tamanho;
	}

	// toString
	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + "]";
	}
	
}
