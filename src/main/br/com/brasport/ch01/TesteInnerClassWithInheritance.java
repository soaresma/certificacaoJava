package br.com.brasport.ch01;
/*
*
*	Classes aninhadas-estáticas não podem acessar variáveis não-estáticas da classe externa
*	que as envolve. Classe interna private nao pode ser acessada diretamente fora da classe
*	que as envolve, por exemplo, por "new MyOuter().new MyInner();". No entanto,podermos ter
*	uma referência da classe interna private usando o método da classe externa que retorne tal
*	referência.
*
*	4) Classe interna anônima envolvendo herança -> primeira versão. 	
*
**/
class TesteInnerClassWithInheritance {
	
	public static void main(String[] args) {
		EmpregadoII e = new EmpregadoII();
		e.identificar();
		
		GerenteII g  = new GerenteII();
		g.e.identificar();
		
		new GerenteII().e.identificar();
	}
		
}
