package com.KrakeDev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Persona p; // 1 declaro una variable llamada p de tipo personas
				Persona p2 = new Persona();
				p = new Persona();// 2 instanciar o crear un objeto persona y referencio con p

				// 3 accediendo a los atributos y mostrando en consola
				System.out.println("-------------------");
				System.out.println("nombre:" + p.getNombre());
				System.out.println("edad:" + p.getEdad());
				System.out.println("estatura:" + p.getEstatura());

				// 4 modificar los atributos
				p.setNombre("Belen");
				p.setEdad(28);
				p.setEstatura(1.53);
				// 5 accediendo a los atributos y mostrando en consola
				System.out.println("-------------------");
				System.out.println("nombre:" + p.getNombre());
				System.out.println("edad:" + p.getEdad());
				System.out.println("estatura:" + p.getEstatura());

				p2.setNombre("Angelina");

				System.out.println("-----------");
				System.out.println("p.nombre: " + p.getNombre());
				System.out.println("p2.nombre: " + p2.getNombre());

	}

}
