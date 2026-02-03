package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto3 {

    public static void main(String[] args) {
        Telefono telf = new Telefono("Claro", "0985741252", 25);
        Telefono telf1 = new Telefono("Movi", "5677889052", 15);

        Contacto c = new Contacto();
        c.setNombre("Joaquin");
        c.setApellido("Paredes");
        c.setPeso(26.7);
        c.setTelefono(telf);

        Contacto c1 = new Contacto();
        c1.setNombre("Pedro");
        c1.setApellido("ez");
        c1.setPeso(23.8);
        c1.setTelefono(telf1);

        AdminContactos con = new AdminContactos();

        Contacto masPeso = con.buscarMasPeso(c, c1);
        System.out.println("El contacto con más peso es: " + masPeso.getNombre());

        boolean comOperadora = con.comparaOperadoras(c, c1);
        System.out.println("¿Tienen la misma operadora? " + comOperadora);
    }
}