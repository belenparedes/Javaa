package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Productos;

public class TestProducto {

	public static void main(String[] args) {
		Productos producto=new Productos("Yogurt",100);
		System.out.println(producto.getPrecio());
		producto.setPrecio(25);
		System.out.println(producto.getPrecio());
		double resultado=producto.calcularPrecioPromo(5);
		System.out.println(resultado);
		
		
	
		
		

	}

}
