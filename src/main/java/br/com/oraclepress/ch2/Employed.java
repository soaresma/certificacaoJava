package br.com.oraclepress.ch2;

public class Employed extends Person {

	private static final String JOB_NUMBER = "0001/01";
	private static final double SALARY = 500.0;
	
	protected String jobNumber;
	protected double salary;
	
	public Employed() {
		System.out.println("Client call the public constructor");
	}
	
	//Here, another client can access the protected constructor why
	//belong the same package. 
	//Remember, protected = package + child
	protected Employed(String jobNumber, double salary){
		super();
		this.jobNumber = jobNumber;
		this.salary = salary;
		System.out.println("Client call the protected constructor");
	}
	
	//This private constructor just can invoked by members of within itself class.
	private Employed(double salary) {
		this(JOB_NUMBER, SALARY);
		System.out.println("Client call the private constructor");
	}
	
	
}