package br.com.brasport.ch01;
/*
*
*	Classes aninhadas-estáticas não podem acessar variáveis não-estáticas da classe externa
*	que as envolve. Classe interna private nao pode ser acessada diretamente fora da classe
*	que as envolve, por exemplo, por "new MyOuter().new MyInner();". No entanto,podermos ter
*	uma referência da classe interna private usando o método da classe externa que retorne tal
*	referência.
*
*	1) Exemplo da classe interna nomeada. 	
*
**/
class ClazzC {
	
	private String s = "str atribuida a variavel de instancia s";
	//Variavel de instância do tipo Y (inner class)
	Y y = new Y();
	
	//método de instância de ClazzC
	void testar() {
		y.exibir();
	}
	
	//InnerClass Y
	class Y {
		void exibir() {
			//Não é possivel acessar diretamente por declaração uma membro de fora da classe interna
			//quando este for marcado com private
			//this.s = "str atribuida dentro do método da InnerClass Y";
			
			//Invocando um membro da outer class através de uma instância da innerClass - ERRO
			//o membro private da outer class ainda está invisível para o membro inner class
			//new Y().s = "str atribuida dentro do método da InnerClass Y";
			
			//Mesmo problema citado acima
			//Y.s = "str atribuida dentro do método da InnerClass Y";
			
			//Compila Fácil através de uma instância da outer class reatribuindo um novo valor
			//a variável de instância s de ClazzC, porém a variavél de instância da outer class
			//ClazzC s não irá alterar o valor dela devido a variável de instancia s da outerClass ter mais peso.
			//new ClazzC().s = "str atribuida dentro do método da InnerClass Y";
			//System.out.println(s);
			
			//Alterando o valor de s da outerClass ClazzC e reatribuindo em uma variavel de referencia
			//do tipo String. Compila e executa sem problemas exibindo os valores de str1 e str2
			
			/*String str1 = new ClazzC().s = "Alterado o valor de s dentro da innerClass (sem parenteses)"; 
			String str2 = (new ClazzC().s = "Alterado o valor de s dentro da innerClass (com parenteses)"); 
			System.out.println(str1);
			System.out.println(str2);*/
			
			//Mas isso compila e altera o valor s da outer class.
			//System.out.println(new ClazzC().s = "str atribuida dentro do método da InnerClass Y");
			
			//Chamando s para ser exibido após a execução do método na console. Irá mostrar o valor 
			//a qual foi inicializada a variável de instância s de ClazzC.
			System.out.println(s);
		}
	}
	
	
}
