package br.com.brasport.ch01;
/*
*
*	Porém, pode parecer que aqui a class N está substituindo o método da superclass M 
*	Só parece. Como dito anteriormente, métodos marcados com private não podem ser herdados
*	e a classe N está declarando um membro com a mesma assinatura do membro da classe M.
*	Mas a classe N está na verdade declarando um novo membro e invocando este membro atraves
*	de sua referencia dentro dela mesmo. 
* 	
*
**/
class N extends M {
	//Este método tem a mesma assinatura que o da superclasse, parece uma sobrescrita mais não é.
	private void fazer() {
		System.out.println("método fazer() da subclasse");
	}
	
	public static void main(String[] args) {
		//Aqui funciona sem problemas.
		N n = new N();
		n.fazer();
		
		//Aqui já ocorre erro de compilação, porque estamos tentando invocar um membro
		//X marcado com private, o que faz com que o método fazer() fique fora do radar 
		//das API JAVA.
		/*	M m = new M();
			m.fazer();
			
			C:\Users\MarceloSoares\Documents\GitHub\certificacaoJava\src\main>javac br\com\brasport\ch01\*.java
			br\com\brasport\ch01\N.java:23: error: fazer() has private access in M
            m.fazer();
                 ^
			1 error
			
		*/
	}
}