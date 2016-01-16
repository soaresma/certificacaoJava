package br.com.brasport.ch01;
/*
*
*	Um erro de compilação é gerado se tentarmos criar uma instância de uma classe abstract
*	usando a expressão de criação de uma instância da classe com palavra reservada new. A
*	combinação do modificador abstract com qualquer uma das palavras reservadas private, static
*	final, strictfp ou sincronized gera erro de compilação.
* 	
*
**/
abstract class ClazzA extends Filho {
	
	void implementar() {
		System.out.println("Metodo implementar() sobrescrito da classe Filho na ClazzA");
	}
	
}
