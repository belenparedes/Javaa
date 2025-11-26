package com.KrakeDev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcul;
		int resultadoSuma;
		double resultadoResta;
		calcul = new Calculadora();
		resultadoSuma=calcul.sumar(5, 8);
		resultadoResta=calcul.restar(50, 53);
		System.out.println("Resultado Suma: "+resultadoSuma);
		System.out.println("Resultado Resta: "+resultadoResta);
	}

}
