package br.com.oraclepress.ch2;

public abstract class Person {

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private int getAge() {
		return age;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
	
}