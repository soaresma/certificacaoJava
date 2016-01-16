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
class TesteInnerClazzC {
	
	public static void main(String... args) {
		
		ClazzC.Y interna = new ClazzC().new Y();
		//Chamando o método da innerClass Y através de uma referência do tipo declarada
		//na outerClass ClazzC
		interna.exibir();
		
		//Caso ocorra de uma referência de uma innerClass 
		//invocando um membro da OuterClass, mesmo ele tendo
		//visibilidade default, ocorrerá um erro de compilação
		//porque para o compilador a inner class não declarou 
		//tal membro.
		//interna.testar();
		
		ClazzC c = new ClazzC();
		//Ao invocar o método testar na referencia c, o compilador vai chamar o método
		//da innerClass exibir através da variável de referência declarada na outerClass
		//ClazzC e exibir o seu resultado. (Vide Código de ClazzC)
		//c.testar();
		
		//Ocorre um erro de compilacao. Um membro de uma outerClass não reconhece um membro 
		//declarado na innerClass. Um membro da OuterClass só consegue acesso ao um membro 
		//da inner class conforme declarado na linha 17 deste fonte.
		//c.exibir();
	}
	
	
}
