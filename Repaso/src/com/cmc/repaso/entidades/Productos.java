package com.cmc.repaso.entidades;

public class Productos {
	private String nombre;
	private double precio;
	public Productos(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
		if (precio<0) {
			precio=precio*(-1);			
		}
	}
	public double calcularPrecioPromo(double porcentaje) {
		double resultado=this.precio-(this.precio*porcentaje/100);
		return resultado;
				
		}
}
