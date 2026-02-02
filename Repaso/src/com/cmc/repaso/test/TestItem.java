package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item producto=new Item();
			producto.setProductosActuales(20);
			producto.imprimir();
			producto.devolver(10);
			producto.imprimir();
			producto.vender(5);
			producto.imprimir();

	}

}
