package com.krakedev.controlFlujo.test;

import com.krakedev.controlFlujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador=new Validador();
		validador.validadorEdad(10);
		validador.validadorEdad(20);
		validador.validadorEdad(40);
		validador.validadorEdad(9);
		validador.validadorEdad(-1);
		validador.validadorEdad(18);

	}

}
