package com.luiz.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {
    public static void main(String[] args){
        Locale locale = Locale.getDefault();
        
        System.out.println(locale);
        
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale loc : locales) {
            System.out.println("Nome: " + loc.getDisplayName());
            System.out.println("Código da língua: " + loc.getLanguage());
            System.out.println(("Língua: " + loc.getDisplayLanguage()));
            System.out.println("*******************");
        }
        
        Locale eua = new Locale("en", "EUA");
        System.out.println(eua);
        
        Locale.setDefault(eua);
        System.out.println(Locale.getDefault());

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(500000000000d));
        
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(nf.format(500000000000d));
    }
}