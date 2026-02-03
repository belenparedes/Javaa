package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		 Telefono telf = new Telefono("movi", "0985741252", 25);
		 telf.imprimir();
		 
		 AdminTelefono admin=new AdminTelefono();
	     AdminContactos cont=new AdminContactos();
	     
	     Contacto c = new Contacto();
	        c.setNombre("Elias");
	        c.setApellido("Paredes");
	        c.setPeso(25.3);
	        c.setTelefono(telf);
	        
		 cont.activarUsuario(c);
		 	telf.imprimir();
		 	
	}

}
