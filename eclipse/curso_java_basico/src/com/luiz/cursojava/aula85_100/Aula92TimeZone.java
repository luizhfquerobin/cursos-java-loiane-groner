package com.luiz.cursojava.aula85_100;

import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();

        TimeZone tz = calendar.getTimeZone();
        
        System.out.println(tz);
    }   
}