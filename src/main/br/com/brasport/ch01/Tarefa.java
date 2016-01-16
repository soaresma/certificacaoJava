package br.com.brasport.ch01;

/*
*
*	"Métodos declarados em interfaces são implicitamente public e abstract. É por isso que
*	levam ponto-e-virgula, sem chaves em sua declaração. Classes que implementam esses métodos
*	necessariamente devem declarar explicitamente suas implementações public. Caso contrário
*	haverá a violação de regra da sobreposição, que estabeleceque que o método que sobrescreve
*	não pode ter privilégios de acesso mais restritivos que o método sobresposto."
*
*	
**/
class Tarefa implements Realizavel {
	
	public void realizar(){
		System.out.println("Implementacao obrigatorio do metodo realizar() da interface Realizavel");
	}
	
	public static void main(String[] args) {
		System.out.println("----- INICIANDO OS TRABALHOS -------- ");
		//Como a interface Realizavel é implicitamente abstract,
		//caso queira criar uma referencia a uma interface, o compilador
		//irá gerar o seguinte erro:
		/*
			C:\Users\MarceloSoares\Documents\GitHub\certificacaoJava\src\main>javac br\com\brasport\ch01\*.java
			br\com\brasport\ch01\Tarefa.java:12: error: Realizavel is abstract; cannot be instantiated
			Realizavel real = new Realizavel();
			real.realizar();
		*/
		
		Realizavel real = new Tarefa();
		real.realizar();
		
	}
}