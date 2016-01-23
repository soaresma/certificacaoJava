package br.com.oraclepress.ch2;

public class TestCallConstructor {

	public static void main(String[] args) {
		Employed emp = new Employed();	
		
		emp = new Employed("0002/01", 1000.0);
		
		//Error - Don't can be create a instance variable as from private constructor
		//Remember, a private access just is access within itself class declaration.
		//emp = new Employed(500.0);
	}

}