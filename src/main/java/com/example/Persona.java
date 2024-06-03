package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@ToString (callSuper = true)
public class Persona {

	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;

	
	
	
}
