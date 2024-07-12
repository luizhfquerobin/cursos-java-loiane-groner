package com.luiz.cursojava.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97DecimalFormat {
	public static void main(String[] args) {
		String padrao = "###,###.##";
		
		DecimalFormat df = new DecimalFormat(padrao);
		
		// df.applyPattern(padrao);
		System.out.println(df.format(123456780.2342));
		
		@SuppressWarnings("deprecation")
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("en", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(123456780.2342));
	}
	
	
}
