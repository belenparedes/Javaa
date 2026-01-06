package com.Krakedev.demo.test;

import com.Krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		//instanciar un objeto  y atribuyo a producto1
		Producto producto1 =new Producto(001,"Caramelos");
		producto1.setDescripcion("caramelos acidos");
		producto1.setPeso(10);
		producto1.imprimir();

	}

}
