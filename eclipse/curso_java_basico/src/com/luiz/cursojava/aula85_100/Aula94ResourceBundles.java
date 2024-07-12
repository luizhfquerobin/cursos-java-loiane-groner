package com.luiz.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula94ResourceBundles {
    public static void main(String[] args) {
        
        System.out.println("Locale atual" + Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
        
        System.out.println("Olá: " + rb.getString("hello"));
        System.out.println("Olá: " + rb.getString("world"));
    }
}