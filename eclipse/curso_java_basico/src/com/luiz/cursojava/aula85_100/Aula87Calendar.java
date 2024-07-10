package com.luiz.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {
	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance(); // singleton
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);

		System.out.println(ano);
		System.out.println(mes);
		System.out.println(dia);
		System.out.println(hora);
		System.out.println(minutos);
		System.out.println(segundos);
		
		System.out.printf("Hoje é dia %d do mês %02d do ano de %d as %d horas %d minutos e %d segundos", dia, (mes+1), ano, hora, minutos, segundos);
		
		hoje.add(Calendar.YEAR, -1);
		
		System.out.println();
		System.out.println(hoje.get(Calendar.YEAR));
	}
}
