package com.KrakeDev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// instancia y se referencia con las variables auto1 y auto2
				Auto auto1 = new Auto();
				Auto auto2 = new Auto();
				// se mofidica los valores de los atributos del auto1
				auto1.marca = "Chevrolet";
				auto1.anio = 2023;
				auto1.precio = 29.985;
				// sw muestra en consola los datos del auto1
				System.out.println("DATOS DEL AUTO 1");
				System.out.println("Marca: " + auto1.marca);
				System.out.println("Anio: " + auto1.anio);
				System.out.println("Precio: " + auto1.precio);
				// se mofidica los valores de los atributos del auto2
				auto2.marca = "Toyota";
				auto2.anio = 2025;
				auto2.precio = 32.985;
				// sw muestra en consola los datos del auto1
				System.out.println("DATOS DEL AUTO 2");
				System.out.println("Marca: " + auto2.marca);
				System.out.println("Anio: " + auto2.anio);
				System.out.println("Precio: " + auto2.precio);

	}

}
