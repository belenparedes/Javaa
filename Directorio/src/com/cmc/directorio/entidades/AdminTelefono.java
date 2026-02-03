package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono)
	{
		if(telefono.getOperadora().equalsIgnoreCase("movi"))
		{
			telefono.setTieneWhatsapp(true);
		}
	}
public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
	int movi=0;
	if(telf1.getOperadora().equalsIgnoreCase("movi"))
	{
		movi=movi+1;
	}
	if(telf2.getOperadora().equalsIgnoreCase("movi"))
	{
		movi=movi+1;
	}
	if (telf3.getOperadora().equalsIgnoreCase("movi"))
	{
		movi=movi+1;
	}
	
	return movi;
	}
	
public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
	int claro=0;
	if(telf1.getOperadora().equalsIgnoreCase("claro"))
	{
		claro=claro+1;
	}
	if(telf2.getOperadora().equalsIgnoreCase("claro"))
	{
		claro=claro+1;
	}
	if (telf3.getOperadora().equalsIgnoreCase("claro"))
	{
		claro=claro+1;
	}
	if (telf4.getOperadora().equalsIgnoreCase("claro"))
	{
		claro=claro+1;
	}
	
	return claro;
	}
	
}

