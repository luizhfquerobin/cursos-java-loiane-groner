package com.luiz.cursojava.aula57;

public class TesteWrapper {

	public static void main(String[] args) {

		short num1 = 1;
		byte num2 = 20;
		int num3 = 100;
		long num4 = 10000l;

		float num5 = 3.5f;
		double num6 = 3.55555;

		boolean flag = true;

		char a = 'a';

		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 100;
		Long num10 = (long) 100;

		Float num11 = 3.5f;
		Double num12 = 3.55555;

		Boolean flag2 = true;

		Character b = 'b';

		System.out.println(num9.intValue());
		System.out.println(num9.longValue());
		
		String num15 = "10000";
		int num16 = Integer.parseInt(num15);
		System.out.println(num16);
		
		
		double num17 = Double.parseDouble("3.555");
		System.out.println(num17);
		
		Integer num18 = Integer.valueOf(1343);
		System.out.println(num18);
		
		System.out.println(num9 == 100);
	}

}
