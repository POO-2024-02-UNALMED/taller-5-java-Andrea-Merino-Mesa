package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	public Mamifero() {}
	public Mamifero (String nom, int ed, String hab, String gen, boolean pelaje, int pata){
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
	public static Mamifero crearCaballo (String nom, int ed, String gen){
		++caballos;
		return new Mamifero(nom,ed,"pradera",gen,true,4);
	}
	public static Mamifero crearLeon(String nom, int ed, String gen){
		++leones;
		return new Mamifero(nom,ed,"selva",gen,true,4);
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
	public boolean isPelaje(){
		return pelaje;
	}
	public void setPelaje(boolean pelaje){
		this.pelaje=pelaje;
	}
	
}