package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","09941234123",20);
		Telefono telf2=new Telefono("claro","09941234123",20);
		Telefono telf3=new Telefono("movi","09941234123",20);
		Telefono telf4=new Telefono("claro","09941234123",20);
		AdminTelefono at1=new AdminTelefono();
		int movi=at1.contarClaro(telf,telf2,telf3,telf4);
		System.out.println("Existen:"+movi+ " con operadora claro");

	}

}
