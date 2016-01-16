package br.com.brasport.ch01;

/*
*
*	Se um metodo definido em uma subclasse, de modo que o nome, o tipo de retorno e a 
*	lista de parâmetros coicidam com exatamente com o nome, o tipo de retorno e a lista
*	de argumentos de um método da superclasse, diz-que o novo método foi sobrepôs/sobrescreveu
*	o antigo. O tipo de retorno pode ser covariante.
*
*
**/
class X {
	
	public Object validar(int a, int y){
		System.out.println("validar() da classe Pai");
		return new Object();
	}
}