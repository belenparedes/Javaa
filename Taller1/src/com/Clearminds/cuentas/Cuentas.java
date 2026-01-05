package com.Clearminds.cuentas;

public class Cuentas {
	private String id ;
	private String tipo="A";
	private float saldo;
	
	public Cuentas(String id, String tipo, float saldo)
	{
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
		
	}
	public Cuentas (String id)
	{
		this.id=id;
	}
	public String getId() {
		return id;
	}

	public String getTipo() {
		
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	public void imprimir ()
	{
	System.out.println("********************************");
	System.out.println("CUENTA");
	System.out.println("********************************");
	System.out.println("Numero de cuenta: "+id);
	System.out.println("Tipo: "+tipo);
	System.out.println("Saldo: USD"+saldo);
	System.out.println("********************************");
	}
	public void imprimirConMiEstilo()
	{
		System.out.println("Numero de cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD"+saldo);
		
	}
}
