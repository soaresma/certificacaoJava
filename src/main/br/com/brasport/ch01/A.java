package br.com.brasport.ch01;

/* 
*	1) A declaração de package esta correta, deve ser a primeira linha de um arquivo fonte
*
*	2) Linha de comentários podem ocorrer em qualquer ponto do arquivo fonte 
*
*	3) A classe tem visibilidade de pacote - default
*
*	4) A classe tem três membros declarados com static. Estes métodos pertencem a classe
*	e existem antes mesmo de se criar uma instância da classe
*
*	5) A classe tem o metodo verificar() sobrecarregado, ou seja, manteve a mesma assinatura
*	porém, alterou a lista de parâmetros.
*
*	6) Métodos sobrecarregados não sofrem muitas restrições como as da sobrescrita. Metodos deste tipo podem:
*
*		* Utilizar os quatro modificadores de acessso
*       * Podem lançar qualquer checked exception e runtime exception
*		* podem alterar o tipo de retorno e a lista de parametros
*		* pode ter lista de argumentos variaveis - var-args
*
*
**/

class A {

	static void verificar(int a, int b) {
		System.out.println("verificar int int ==> pai");		
	}
	
	static void verificar(int a, double b) {
		System.out.println("verificar int double ===> pai");
	}
	
	static void verificar(double b, int a) {
		System.out.println("verificar double int ===> pai");
	}
	static void verificar(int a, int b, int c) {
		System.out.println("verificar int int int ===> pai");
	}
}