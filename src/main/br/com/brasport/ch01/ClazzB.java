package br.com.brasport.ch01;
/*
*
*	Um erro de compilação é gerado se tentarmos criar uma instância de uma classe abstract
*	usando a expressão de criação de uma instância da classe com palavra reservada new. A
*	combinação do modificador abstract com qualquer uma das palavras reservadas private, static
*	final, strictfp ou sincronized gera erro de compilação.
*
*	Não é necessário que uma classe abstract tenha os métodos declarados abstract. Caso uma classe
*	possua métodos abstract, então obrigatoriamente deve ter o modificador de acesso abstract na
*	sua declaração da classe. Uma subclasse de uma classe abstract não precisa implementar os métodos
*	abstract da superclasse se esta for abstract.
* 	
*
**/
class ClazzB extends ClazzA {
	
	Object agir() {
		return new String("método agir() sobrescrito em ClazzB");
	}
	
	public static void main(String[] args) {
		ClazzB b = new ClazzB();
		b.implementar();
		
		String str = (String) b.agir();
		System.out.println(str);
	}
	
}
