package com.thc.cursolombok;

public class Main {

	public static void main(String[] args) {
				
		Persona per = Persona.builder().nombre("Harry").edad(25).build();
		System.out.println(per.toString());		
		
	}

}
