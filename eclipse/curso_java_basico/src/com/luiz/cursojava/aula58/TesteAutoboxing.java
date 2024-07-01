package com.luiz.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = 1000l;
		Float num11 = 3.5f;
		Double num12 = 3.55555;
		Boolean flag2 = true;
		Character b_ = 'b';
		
		int num13 = num9; //num9.intValue()
		num9++;
		
		System.out.println(num9);
		
		Integer num14 = num13 / num9;
		
		// mau uso
		Double a, b, c;
		a = 10.0;
		b = 12.2;
		c = 4.7;
		
		Double media = (a+b+c) / 3;
		System.out.println(media);
		

	}

}
