package com.KrakeDev.test;

import com.KrakeDev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcul;
		Calculadora mensaje;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDividir;
		double resultadoPromedio;
		calcul = new Calculadora();
		mensaje= new Calculadora();
		resultadoSuma=calcul.sumar(5, 8);
		resultadoResta=calcul.restar(50, 53);
		resultadoMultiplicacion=calcul.multiplicar(10, 5);
		resultadoDividir=calcul.dividir(10, 2);
		resultadoPromedio=calcul.promediar(10, 8, 9);
		System.out.println("Resultado Suma: "+resultadoSuma);
		System.out.println("Resultado Resta: "+resultadoResta);
		System.out.println("Resultado multiplicacion: "+resultadoMultiplicacion);
		System.out.println("Resultado Dividir: "+resultadoDividir);
		System.out.println("Resultado Promedio: "+resultadoPromedio);
		mensaje.mostrarResultado();
	}

}
