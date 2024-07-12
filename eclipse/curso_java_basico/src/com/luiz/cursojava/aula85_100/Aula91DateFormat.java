package com.luiz.cursojava.aula85_100;

import java.text.DateFormat;
import java.util.Date;

public class Aula91DateFormat {
    public static void main(String[] args){
      Date hoje = new Date();
      
      System.out.println(hoje);
      
      String hojeFormatado = DateFormat.getInstance().format(hoje);
      
      System.out.println(hojeFormatado);
    }
}