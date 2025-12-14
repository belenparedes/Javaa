package com.KrakeDev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo r3=new Rectangulo();
		
		
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=5;
		
		r3.altura=2;
		r3.base=4;
		
		int resultadoArea1=r1.calcularArea();
		int resultadoArea2=r2.calcularArea();
		int resultadoPerimetro=r3.calcularPerimetro();
		
		System.out.println("Area de r1 "+resultadoArea1);
		System.out.println("Area de r2 "+resultadoArea2);
		System.out.println("Perimetro r3 "+resultadoPerimetro);
	}

}
