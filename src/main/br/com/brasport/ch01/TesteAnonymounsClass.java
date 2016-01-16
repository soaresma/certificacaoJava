package br.com.brasport.ch01;
/*
*
*	Classes aninhadas-estáticas não podem acessar variáveis não-estáticas da classe externa
*	que as envolve. Classe interna private nao pode ser acessada diretamente fora da classe
*	que as envolve, por exemplo, por "new MyOuter().new MyInner();". No entanto,podermos ter
*	uma referência da classe interna private usando o método da classe externa que retorne tal
*	referência.
*
*	2) Exemplo da classe interna nomeada usando a referência this. 	
*
**/
class TesteAnonymounsClass {
	
	public static void main(String... args) {
		
		ClazzAnonymousClass clazz = new ClazzAnonymousClass();
		clazz.testar();
		
	}
	
	
}
