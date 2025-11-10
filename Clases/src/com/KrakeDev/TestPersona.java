package com.KrakeDev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Persona p; // 1 declaro una variable llamada p de tipo personas
				Persona p2 = new Persona();
				p = new Persona();// 2 instanciar o crear un objeto persona y referencio con p

				// 3 accediendo a los atributos y mostrando en consola
				System.out.println("-------------------");
				System.out.println("nombre:" + p.nombre);
				System.out.println("edad:" + p.edad);
				System.out.println("estatura:" + p.estatura);

				// 4 modificar los atributos
				p.nombre = "Belen";
				p.edad = 28;
				p.estatura = 1.53;
				// 5 accediendo a los atributos y mostrando en consola
				System.out.println("-------------------");
				System.out.println("nombre:" + p.nombre);
				System.out.println("edad:" + p.edad);
				System.out.println("estatura:" + p.estatura);

				p2.nombre = "Angelina";

				System.out.println("-----------");
				System.out.println("p.nombre: " + p.nombre);
				System.out.println("p2.nombre: " + p2.nombre);

	}

}
