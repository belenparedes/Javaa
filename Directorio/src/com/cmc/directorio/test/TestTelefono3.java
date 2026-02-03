package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","09941234123",20);
		Telefono telf2=new Telefono("claro","09941234123",20);
		Telefono telf3=new Telefono("movi","09941234123",20);
		AdminTelefono at1=new AdminTelefono();
		int movi=at1.contarMovi(telf,telf2,telf3);
		System.out.println("Existen:"+movi+ " con operadora movi");

	}

}
