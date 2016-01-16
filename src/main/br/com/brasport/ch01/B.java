package br.com.brasport.ch01;

/*
*	A classe B declarada agora é uma subclasse de A. As duas estão visíveis uma para outra
*	devido a pertencerem ao mesmo pacote. Portanto B tem os membros static declarados na
*	superclass A.
*
*	A classe B além de herdar os métodos sobrecarregados de A, também resolveu ela mesma 
*	sobrecarregar o método verificar com apenas um tipo int em sua lista de parametros.
*	
*	Como o método main() é static, podemos invocar os métodos declarados da subclasse
*	e superclasse diretamente, pois membros static não aceitam que métodos e variáveis
*	de instância sejam acessados diretamente.
**/
public class B extends A {

	//Como herdou os membros da superclasse, a subclasse continou a sobrecarga do método verificar
	//por ela mesma.
	static void verificar(int a) {
		System.out.println("verificar int ==> filho");
	}
	
	//Método main
	 static public void main(String... args) {
		//Invoca a versão do método sobrecarregado da classe pai que recebe 
		//dois inteiros em sua lista de parâmetros
		verificar(10,20);
		
		//Invoca a versão do método sobrecarregado da classe pai que recebe 
		//um tipo int e um tipo double 
		verificar(10,20.95);
		
		//Invoca a versão do método sobrecarregado da classe pai que recebe 
		//um tipo double e um tipo int 
		verificar(10.90,30);
		
		//Invoca a versão do método sobrecarregado da classe pai que recebe 
		//tres tipo int em sua lista de parâmetros 
		verificar(10,20, 30);
		
		//Invoca a versão do método sobrecarregado da classe filha que recebe 
		//um tipo int e um tipo double 
		verificar(10);
	}

}