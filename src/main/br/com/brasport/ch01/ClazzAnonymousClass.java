package br.com.brasport.ch01;
/*
*
*	Classes aninhadas-estáticas não podem acessar variáveis não-estáticas da classe externa
*	que as envolve. Classe interna private nao pode ser acessada diretamente fora da classe
*	que as envolve, por exemplo, por "new MyOuter().new MyInner();". No entanto,podermos ter
*	uma referência da classe interna private usando o método da classe externa que retorne tal
*	referência.
*
*	3) Exemplo da classe interna anônima -> local de método. 	
*
**/
class ClazzAnonymousClass {
	
	private int x = 10;
	
	void testar() {
		final String s = "OCA";
		
		//Anonymouns Class declarada dentro do método testar() de ClazzAnonymousClass
		class AnonymousClassMethod {
			
			void exibir() {
				//Uma classe interna pode acessar um membro da classe externa. Sempre!!!!!
				System.out.println(x);
				System.out.println(s);
			}
		}
		
		AnonymousClassMethod anonymous = new AnonymousClassMethod();	
		anonymous.exibir();
	}
	
}
