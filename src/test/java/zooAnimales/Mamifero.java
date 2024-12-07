package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	public Mamifero() {}
	public Mamifero (String nom, int ed, String hab, String gen, Zona zona,boolean pelaje, int pata){
		patas=pata;
		this.pelaje=pelaje;
		listado[listado.length]=this;
	}
	private static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private int patas;
	private boolean pelaje;
	public static int cantidadMamiferos(){
		return leones+caballos;
	}
	public void crearCaballo(String nom, int ed, String gen, Zona zona){
		++caballos;
		Mamifero mamifero =new Mamifero(nom,ed,"pradera",gen,zona,true,4);
	}
	public void crearLeon(String nom, int ed, String gen, Zona zona){
		Mamifero mamifero =new Mamifero(nom,ed,"selva",gen,zona,true,4);
		++leones;
	}
	
	public Mamifero[] getListado(){
		return listado;
	}
	public void setListado(Mamifero mamifero){
		listado[listado.length]=mamifero;
	}
	public int getPatas(){
		return patas;
	}
	public void setPatas(int patas){
		this.patas=patas;
	}
	public boolean getPelaje(){
		return pelaje;
	}
	public void setHabitat(boolean pelaje){
		this.pelaje=pelaje;
	}
	
}