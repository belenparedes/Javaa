package com.krakedev.controlFlujo;

public class Validador {
	public void validadorEdad(int edad) {
		if(edad>=18 ) {
		System.out.println("es mayor de edad");
		}
		else if(edad>=12 && edad<18)
		{
			System.out.println("es adolecente");
		}
		else if(edad>0 && edad <12) {
			System.out.println("es un nino");
		}
		else
		{
			System.out.println("edad incorrecta");
		}
		
	}

}
