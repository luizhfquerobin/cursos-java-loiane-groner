package com.luiz.estruturadados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {
		
		Queue<String> filaComPrioridade = new PriorityQueue<String>();

		filaComPrioridade.add("B");
		filaComPrioridade.add("A");
		
		System.out.println(filaComPrioridade);
	}

}
