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
abstract class Pai {
	//Este método tem a mesma assinatura que o da superclasse, parece uma sobrescrita mais não é.
	private void fazer() {
		System.out.println("método fazer() da superclasse");
	}
	
	int testar() {
		return 10;
	}
	
	Object fantasiar() {
		return new String("OCA E OCP JAVA PROGRAM 7");
	}
	
	
}
