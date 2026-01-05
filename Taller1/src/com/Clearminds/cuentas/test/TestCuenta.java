package com.Clearminds.cuentas.test;

import com.Clearminds.cuentas.Cuentas;

public class TestCuenta {

	public static void main(String[] args) {
		// Creo el objeto Cuenta y referencio con cuenta1
		Cuentas cuenta1=new Cuentas("03476");
		//coloco un valor de saldo en la Cuenta 1
		cuenta1.setSaldo(675);
		//creo el objeto Cuenta y lo referencio con cuenta2
		Cuentas cuenta2=new Cuentas("03476","C",98);
		// Creo el objeto Cuenta y referencio con cuenta3
		Cuentas cuenta3=new Cuentas("03476");
		//Modifico el tipo de cuenta 
		cuenta3.setTipo("C");
		//Imprimo cuenta1,cuenta2,cuenta3
		System.out.println("--------valores iniciales------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("------valores modiciados--------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		//creo wl objeto Cuenta y referencio a cuenta4
		Cuentas cuenta4=new Cuentas("0987");
		cuenta4.setSaldo(10);
		cuenta4.imprimirConMiEstilo();
		//CREO EL IBJETO CUENTAS Y REFERENCIOA CUENTAS5
		Cuentas cuenta5 =new Cuentas("0557","C",10);
		cuenta5.imprimirConMiEstilo();
		//creo el objeto cienta y referencio a cuenta6
		Cuentas cuenta6=new Cuentas("0966");
		 cuenta6.imprimirConMiEstilo();
	}

}
