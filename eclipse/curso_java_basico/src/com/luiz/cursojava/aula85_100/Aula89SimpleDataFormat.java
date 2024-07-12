package com.luiz.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aula89SimpleDataFormat {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("y/M/d - H:m:s");

        Calendar data = Calendar.getInstance();
        
        System.out.println(sdf.format(data.getTime()));
    }
}