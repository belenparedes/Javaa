package com.KrakeDev.test;

import com.KrakeDev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo r3=new Rectangulo();
		
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(5);
		
		r3.setAltura(2);
		r3.setBase(4);
		
		int resultadoArea1=r1.calcularArea();
		int resultadoArea2=r2.calcularArea();
		int resultadoPerimetro=r3.calcularPerimetro();
		
		System.out.println("Area de r1 "+resultadoArea1);
		System.out.println("Area de r2 "+resultadoArea2);
		System.out.println("Perimetro r3 "+resultadoPerimetro);
	}

}
