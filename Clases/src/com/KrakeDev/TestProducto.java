package com.KrakeDev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instanciado y referenciado con las variables productoA, productoB, productoC
		Producto productoA;
		productoA = new Producto();
		Producto productoB;
		productoB = new Producto();
		Producto productoC;
		productoC = new Producto();
		// modificar los productos
		// productoA
		productoA.nombre = "paracetamol";
		productoA.descripcion = "alivia el malestar";
		productoA.precio = 0.50;
		productoA.stockActual = 10;
		// productoB
		productoB.nombre = "FEMEN";
		productoB.descripcion = "alivia el dolor";
		productoB.precio = 0.60;
		productoB.stockActual = 15;
		// productoC
		productoC.nombre = "ibuprofeno";
		productoC.descripcion = "alivia el malestar";
		productoC.precio = 0.25;
		productoC.stockActual = 12;

		// MOSTRAR EN PANTALLA LOS PRDUCTOS
		System.out.println("--------PRODUCTO 1-------");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio:" + productoA.precio);
		System.out.println("Stock Actual: " + productoA.stockActual);

		// MOSTRAR EN PANTALLA LOS PRDUCTOS
		System.out.println("--------PRODUCTO 2-------");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio:" + productoB.precio);
		System.out.println("Stock Actual: " + productoB.stockActual);

		// MOSTRAR EN PANTALLA LOS PRDUCTOS
		System.out.println("--------PRODUCTO 3-------");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio:" + productoC.precio);
		System.out.println("Stock Actual: " + productoC.stockActual);

	}

}
