package zooAnimales;

import gestion.Zona;

public class Pez extends Animal {
	public Pez() {}
	public Pez (int tA, String nom, int ed, String hab, String gen, Zona[] zona,Pez[] lis, int salmon, int bacalao, String colorEscama, int cantidadAleta){
		listado=lis;
		salmones=salmon;
		bacalaos=bacalao;
		colorEscamas=colorEscama;
		cantidadAletas=cantidadAleta;
	}
	private Pez[] listado;
	public int salmones;
	public int bacalaos;
	private int cantidadAletas;
	private String colorEscamas;
	public void cantidadPeces(){}
	public void movimiento(){}
	public void crearSalmon(){}
	public void crearBacalao(){}	
}