package br.com.brasport.ch01;

class Empregado {

	int id;
	String nome;
	
	Empregado() {
		this.id = 10;
		this.nome = "OCA E OCP Java Program 7"
	}
	
	//Como toda classe Java extend de Object, aqui o método toString()
	//está sendo sobreposto em Empregado para que retorne um String
	//contendo o nome e o id de um empregado
	public String toString() {
		return this.nome + " " + id;
	}
}