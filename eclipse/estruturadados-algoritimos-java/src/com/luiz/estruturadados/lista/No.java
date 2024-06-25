package com.luiz.estruturadados.lista;

public class No<T> {
	
	// Atributos
	private T elemento;
	private No<T> proximo;
	
	// Construtores
	public No(T elemento) {
		super();
		this.elemento = elemento;
		this.proximo = null;
	}
	public No(T elemento, No<T> proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	// Getters & Setters
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public No<T> getProximo() {
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}
	
	// toString
	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
	}
	
}
