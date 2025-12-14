package com.KrakeDev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		
		c1.lado=4;
		c2.lado=5;
		c3.lado=10;
		
		int area1=c1.calcularArea();
		int perimetro1=c1.calcularPerimetro();
		int area2=c2.calcularArea();
		int perimetro2=c2.calcularPerimetro();
		int area3=c3.calcularArea();
		int perimetro3=c3.calcularPerimetro();
		
		System.out.println("el area de C1: "+area1);
		System.out.println("el perimetro de c1: "+perimetro1);
		System.out.println("el area de C2: "+area2);
		System.out.println("el perimetro de c2: "+perimetro2);
		System.out.println("el area de C3: "+area3);
		System.out.println("el perimetro de c3: "+perimetro3);
	}

}
