package com.luiz.cursojava.aula85_100;

import java.util.Random;

public class Aula99Random {

	public static void main(String[] args) {
		
		System.out.println(Math.floor(Math.random()*100000));
		
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt(101));

	}

}
