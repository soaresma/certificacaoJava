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
class TesteClazzOuterClassI {
	
	public static void main(String... args) {
		//Erro de compilação
		//ClazzOuterClassI.ClazzInnerY interna = new ClazzOuterClassI().new ClazzInnerY();
		
		ClazzOuterClassI.ClazzInnerY interna = new ClazzOuterClassI().new ClazzInnerY();
		// 1.a Erro de compilação, a referencia da innerClass não declarou este método mostrar()
		//como membro
		/*
			\..\..\certificacaoJava\src\main>javac br\com\brasport\ch01\*.java
			br\com\brasport\ch01\TesteClazzOuterClassI.java:21: error: cannot find symbol
                
			interna.mostrar();
                       ^
			symbol:   method mostrar()
			location: variable interna of type ClazzOuterClassI.ClazzInnerY
			1 error
		*/
		interna.mostrar();
		
		//Compila e exibe o retorno do método exibir da innerClass ClazzInnerY
		//System.out.println(interna.exibir());
		
		//ClazzOuterClassI externa = new ClazzOuterClassI();
		
		//System.out.println(externa.exibir());
		//externa.mostrar();	
		
	}
	
	
}
