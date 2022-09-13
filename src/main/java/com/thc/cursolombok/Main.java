package com.thc.cursolombok;

public class Main {

	public static void main(String[] args) {
		
		Persona per1 = new Persona();
		per1.setNombre("Harry");
		System.out.println(per1.toString());
		
		Persona per2 = new Persona("Laura", "Mesa", 15);
		System.out.println(per2.toString());
		
		Persona per3 = Persona.builder().nombre("Harry").edad(25).build();
		System.out.println(per3.toString());		
		
	}

}
