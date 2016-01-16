package br.com.brasport.ch01;

class Gerente extends Empregado {

	int departamento;
	
	public String toString() {
		return super.toString() + " " + departamento;
	}
	
	public static void main(String[] args) {
		Empregado e = new Gerente();
		
		String msg = e.toString();
		System.out.println(msg);
	}
}