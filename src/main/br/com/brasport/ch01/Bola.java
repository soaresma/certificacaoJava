package br.com.brasport.ch01;
/*
*
*	Classes aninhadas-estáticas não podem acessar variáveis não-estáticas da classe externa
*	que as envolve. Classe interna private nao pode ser acessada diretamente fora da classe
*	que as envolve, por exemplo, por "new MyOuter().new MyInner();". No entanto,podermos ter
*	uma referência da classe interna private usando o método da classe externa que retorne tal
*	referência.
*
*	5) Classe interna anônima envolvendo interface. 	
*
**/
class Bola {
	
	//Implementando o método da interface Alteravel em uma instancia
	//da interface utilizando inner class.
	Alteravel a = new Alteravel() {
		//implementou o método da interface Alteravel através de uma instância 
		//de anonymouns class
		public void alterar() {
			System.out.println("alterar() anonymouns class");
		}
	};
	
	//ERRO DE COMPILACAO - Uma interface é implicitamente abstract e não pode ser criada uma instancia
	//de class abstract
	//Alteravel a = new Alteravel();
	//a.alterar();
	
	
}
