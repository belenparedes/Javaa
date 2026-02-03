package com.krakedev.composicion.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona=new Persona();
		persona.setNombre("Belen");
		persona.setApellido("Paredes");
		Direccion dir=new Direccion();
		dir.setCallePrimaria("Av siempre viva");
		dir.setCalleSecundaria("los sauces");
		dir.setNumero("n45");
		persona.setDireccion(dir);
		
		String nombre= persona.getNombre();
		Direccion d1=persona.getDireccion();
		
		System.out.println("Nombre: "+nombre);
		//d1 esta null y trato de invocar a un metodo con esa vaariable 
		System.out.println("calle principal: "+d1.getCalleSecundaria());
		persona.imprimir();
		Persona p2= new Persona();
		Direccion d2=new Direccion("AvLOs sauces","Clavijo","s/n");
		p2.setNombre("Jose");
		p2.setDireccion(d2);
		p2.imprimir();
		
		Persona  p3=new Persona();
		p3.setDireccion(new Direccion("vv","gg","nh"));
		p3.imprimir();
		
		//null.algunmetodo();
		
		
	}
}
