package com.Krakedev.demo;

public class Producto {
 private int codigo;
 private String nombre;
 private String descripcion;
 private float peso;
 
 public Producto(int codigo, String nombre)
 {
	 this.codigo=codigo;
	 this.nombre=nombre;
 }
 
 public void imprimir()
 {
	 System.out.println(codigo);
	 System.out.println(nombre);
	 System.out.println(descripcion);
	 System.out.println(peso);
 }
 public int getCodigo() {
	return codigo;
 }
 public void setCodigo(int codigo) {
	this.codigo = codigo;
 }
 public String getNombre() {
	return nombre;
 }
 public void setNombre(String nombre) {
	this.nombre = nombre;
 }
 public String getDescripcion() {
	return descripcion;
 }
 public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
 }
 public float getPeso() {
	return peso;
 }
 public void setPeso(float peso) {
	this.peso = peso;
 }
 
 
}
