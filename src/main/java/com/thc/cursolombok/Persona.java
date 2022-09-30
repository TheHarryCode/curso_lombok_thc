package com.thc.cursolombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona {

	private String nombre;
	@Builder.Default
	private String apellido="Marin";
	private int edad;
	
	@Builder.Default
	@ToString.Exclude
	private String direccion="Calle Colombia";
	
	
	
}
