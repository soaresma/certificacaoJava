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
class ClazzOuterClassI {
	
	String exibir() {
		return "externa";
	}
	
	class ClazzInnerY {
		String exibir() {
			return "interna";
		}		
		void mostrar() {
			//Chama para sua instância de ClazzInnerY o método exibir() 
			System.out.println(this.exibir());
			//Invoca o método exibir() da outerClass
			System.out.println(ClazzOuterClassI.this.exibir());
			
		}
	}
	
	/* 1.a Se o método mostrar() tivesse sido declarado na outerClass, ao ser invocado em uma instância da innerClass
	   daria erro de compilação.
	void mostrar() {
			//Chama para sua instância de ClazzInnerY o método exibir() 
			System.out.println(this.exibir());
			//Invoca o método exibir() da outerClass
			System.out.println(ClazzOuterClassI.this.exibir());
			
	}*/
	
	
}
