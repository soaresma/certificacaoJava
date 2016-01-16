package br.com.brasport.ch01;
/*
*
*	Métodos private não podem ser herdados pela subclasse, logo não podem ser sobrespostos
*
*
*
*
**/
class M {
	
	private void fazer() {
		System.out.println("método fazer() da superclasse");
	}
}