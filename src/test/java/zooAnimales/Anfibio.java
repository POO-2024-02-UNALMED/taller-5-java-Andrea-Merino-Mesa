package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	public Anfibio() {}
	public Anfibio (int tA, String nom, int ed, String hab, String gen, Zona[] zona,Anfibio[] lis, int rana, int salam, String piel, boolean veneno){
		listado=lis;
		ranas=rana;
		salamandras=salam;
		colorPiel=piel;
		venenoso=veneno;
	}
	private Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public void cantidadAnfibios(){}
	public void movimiento(){}
	public void crearRana(){}
	public void crearSalamandra(){}	
}