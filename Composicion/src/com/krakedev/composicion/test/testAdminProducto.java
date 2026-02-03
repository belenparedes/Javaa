package com.krakedev.composicion.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class testAdminProducto {

	public static void main(String[] args) {
		Producto mcProducto;
		AdminProducto admin=new AdminProducto();
		Producto productoA =new Producto("Doritos",0.25);
		Producto productoB = new Producto("Papitas",0.55);
		
		mcProducto= admin.buscarMaCaro(productoA, productoB);
		if(mcProducto==null)
		{
			System.out.println("son iguales");
		}
		else
		{
			System.out.println("El mas caro " +mcProducto.getNombre());
		}
		
	}

}
