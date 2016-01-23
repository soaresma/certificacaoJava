package br.com.brasport.ch01;
/*
*
*	Classes aninhadas-estáticas não podem acessar variáveis não-estáticas da classe externa
*	que as envolve. Classe interna private nao pode ser acessada diretamente fora da classe
*	que as envolve, por exemplo, por "new MyOuter().new MyInner();". No entanto,podermos ter
*	uma referência da classe interna private usando o método da classe externa que retorne tal
*	referência.
*
*	4) Classe aninhada estática. 	
*
**/
class ClazzOneA {
	
	public static void main(String[] args) {
		//declarando uma referência a innerClass static de ClazzOne.InneClassClazzOne
		//e inicializando. Como a innerClass de ClazzOne é um membro estático, na inici-
		//alização não precisamos criar uma instância da outerClas. Basta para isso apenas 
		//invocar através do operador ponto, uma instância da innerClass static
		ClazzOne.InnerClassClazzOne one = new ClazzOne.InnerClassClazzOne();
		//invocando o método exibir da inner class static
		one.exibir();
			
		
		
		
		
	}
	
		
}