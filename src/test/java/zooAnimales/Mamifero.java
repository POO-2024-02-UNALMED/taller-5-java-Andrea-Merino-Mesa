package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	public Mamifero() {}
	public Mamifero (int tA, String nom, int ed, String hab, String gen, Zona[] zona,Mamifero[] lis, int caballo, int leon, boolean pelaje, int pata){
		listado=lis;
		leones=leon;
		caballos=caballo;
		patas=pata;
		this.pelaje=pelaje;
	}
	private Mamifero[] listado;
	public int caballos;
	public int leones;
	private int patas;
	private boolean pelaje;
	public void cantidadMamiferos(){}
	public void crearCaballo(){}
	public void crearLeon(){}
}