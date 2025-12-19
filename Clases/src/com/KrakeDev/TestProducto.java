package com.KrakeDev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instanciado y referenciado con las variables productoA, productoB, productoC
		Producto productoA;
		productoA = new Producto("Aspirina", "avilia el dolor", 0.87, 12);
		Producto productoB;
		productoB = new Producto("Buprex flash", "avilia la fiebre", 2.87, 10);
		Producto productoC;
		productoC = new Producto("Sult", "avilia el dolor", 0.85, 8);
		
		System.out.println("--------PRODUCTO 1-------");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio:" + productoA.getPrecio());
		System.out.println("Stock Actual: " + productoA.getStockActual());
		
		// MOSTRAR EN PANTALLA LOS PRDUCTOS
		System.out.println("--------PRODUCTO 2-------");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio:" + productoB.getPrecio());
		System.out.println("Stock Actual: " + productoB.getStockActual());

		// MOSTRAR EN PANTALLA LOS PRDUCTOS
		System.out.println("--------PRODUCTO 3-------");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio:" + productoC.getPrecio());
		System.out.println("Stock Actual: " + productoC.getStockActual());

		
		
		// modificar los productos
		// productoA
		productoA.setNombre("paracetamol");
		productoA.setDescripcion("alivia el malestar");
		productoA.setPrecio(0.50);
		productoA.setStockActual(10);
		// productoB
		productoB.setNombre("FEMEN");
		productoB.setDescripcion("alivia el dolor");
		productoB.setPrecio(0.60);
		productoB.setStockActual(15);
		// productoC
		productoC.setNombre("ibuprofeno");
		productoC.setDescripcion("alivia el malestar");
		productoC.setPrecio(0.25);
		productoC.setStockActual(12);

		// MOSTRAR EN PANTALLA LOS PRDUCTOS
		System.out.println("--------PRODUCTO 1-------");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio:" + productoA.getPrecio());
		System.out.println("Stock Actual: " + productoA.getStockActual());

		// MOSTRAR EN PANTALLA LOS PRDUCTOS
		System.out.println("--------PRODUCTO 2-------");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio:" + productoB.getPrecio());
		System.out.println("Stock Actual: " + productoB.getStockActual());

		// MOSTRAR EN PANTALLA LOS PRDUCTOS
		System.out.println("--------PRODUCTO 3-------");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio:" + productoC.getPrecio());
		System.out.println("Stock Actual: " + productoC.getStockActual());

	}

}
