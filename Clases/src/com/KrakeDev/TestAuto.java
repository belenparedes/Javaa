package com.KrakeDev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// instancia y se referencia con las variables auto1 y auto2
				Auto auto1 = new Auto("Chevrolet", 2025, 123.45);
				Auto auto2 = new Auto("Aveo", 2025,19.900);
				System.out.println("DATOS DEL AUTO 1");
				System.out.println("Marca: " + auto1.getMarca());
				System.out.println("Anio: " + auto1.getAnio());
				System.out.println("Precio: " + auto1.getPrecio());
				
				System.out.println("DATOS DEL AUTO 2");
				System.out.println("Marca: " + auto2.getMarca());
				System.out.println("Anio: " + auto2.getAnio());
				System.out.println("Precio: " + auto2.getPrecio());
				// se mofidica los valores de los atributos del auto1
				auto1.setMarca ("Chevrolet");
				auto1.setAnio(2023);
				auto1.setPrecio(29.985);
				// se muestra en consola los datos del auto1
				System.out.println("DATOS DEL AUTO 1");
				System.out.println("Marca: " + auto1.getMarca());
				System.out.println("Anio: " + auto1.getAnio());
				System.out.println("Precio: " + auto1.getPrecio());
				// se mofidica los valores de los atributos del auto2
				auto2.setMarca("Toyota");
				auto2.setAnio(2025);
				auto2.setPrecio(32.985);
				// sw muestra en consola los datos del auto1
				System.out.println("DATOS DEL AUTO 2");
				System.out.println("Marca: " + auto2.getMarca());
				System.out.println("Anio: " + auto2.getAnio());
				System.out.println("Precio: " + auto2.getPrecio());

	}

}
