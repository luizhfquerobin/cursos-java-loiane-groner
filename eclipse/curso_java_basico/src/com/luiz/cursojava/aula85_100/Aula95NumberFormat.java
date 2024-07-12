package com.luiz.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Aula95NumberFormat {
    public static void main(String[] args){
        Locale en = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getInstance(en);
        
        String num = nf.format(100.99);
        System.out.println(num);
        
        Locale br = new Locale("pt", "BR");
        NumberFormat nf2 = NumberFormat.getInstance(br);
        
        String num2 = nf2.format(100.99);
        System.out.println(num2);
        
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        
        String valor = moeda.format(100.99);
        System.out.println(valor);

        Currency currency = moeda.getCurrency();
        System.out.println(currency);
              
    }
}