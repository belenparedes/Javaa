package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","1234567890",20);
		Contacto c=new Contacto();
		c.setNombre("Belen");
		c.setApellido("Paredes");
		c.setPeso(25.2);
		c.setTelefono(telf);
		 System.out.println("Nombre: "+c.getNombre());
		 System.out.println("Apellido: "+c.getApellido());
		 System.out.println("Peso: "+c.getPeso());
		 System.out.println("Telefono");
		 telf.imprimir();
		
		

	}

}
