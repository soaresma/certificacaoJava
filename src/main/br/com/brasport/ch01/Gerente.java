package br.com.brasport.ch01;

/*
*
*	A palavra chave super refere-se à superclasse da classe, na qual a palavra reservada
*	é usada. Ela é usada para se referir às variáveis de instâncias e métodos da superclasse.
*
*
*
*
**/
class Gerente extends Empregado {

	int departamento;
	
	public String toString() {
		departamento = 5;
		return super.toString() + " " + departamento;
	}
	
	public static void main(String[] args) {
		Empregado e = new Gerente();
		
		//Atráves da referencia e de Empregado, invocamoso método 
		//toString() da versão declarada na subclasse Gerente em 
		//tempo de execução porque o compilador verificou que este
		//método foi sobrescrito da classe Empregado na classe Gerente
		//Em tempo de compilação o compilador olha a referência, mas
		//em tempo de execução, e a versão atual do método que será 
		//executada não importa o que tenha atribuido na declaraçao.
		String msg = e.toString();
		System.out.println(msg);
	}
}