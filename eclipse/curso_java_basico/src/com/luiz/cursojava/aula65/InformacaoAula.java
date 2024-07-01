package com.luiz.cursojava.aula65;

@interface InformacaoAula {
	String autor();
	
	int aulaNumero();
	
	String blog() default "https://luizquerobin.com";
	
	String site() default "https://luizquerobin.com"; 
}
