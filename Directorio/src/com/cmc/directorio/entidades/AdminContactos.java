package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPeso(Contacto c1, Contacto c2) {
	    if (c1.getPeso() > c2.getPeso()) {
	        return c1;
	    } else {
	        return c2;
	    }
	}

	public boolean comparaOperadoras(Contacto c1, Contacto c2) {
	    return c1.getTelefono().getOperadora()
	             .equalsIgnoreCase(c2.getTelefono().getOperadora());
	}

	
	public void activarUsuario(Contacto c1) {
	    if (c1.getTelefono().isTieneWhatsapp()) {
	        c1.getTelefono().setActivo(true);
	    } else {
	        c1.getTelefono().setActivo(false);
	    }
	}


}
