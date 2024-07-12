package com.luiz.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalender {

    public static void main(String[] args) {
        Calendar hoje1 = Calendar.getInstance();

        GregorianCalendar hoje = new GregorianCalendar();

        imprimirData(hoje);
        
        System.out.println();
        System.out.println(hoje.isLeapYear(2024));
        
        GregorianCalendar hoje2 = new GregorianCalendar(2017, 0, 1, 14, 39);
        imprimirData(hoje2);
    }

    private static void imprimirData(Calendar hoje) {
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("Hoje é dia %d do mês %02d do ano de %d as %d horas %d minutos e %d segundos", dia, (mes + 1), ano, hora, minutos, segundos);
    }

}
