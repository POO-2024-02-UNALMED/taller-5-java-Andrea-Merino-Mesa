package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	public Ave() {}
	public Ave (int tA, String nom, int ed, String hab, String gen, Zona[] zona,Ave[] lis, int halcon, int aguila, String colorPluma){
		listado=lis;
		halcones=halcon;
		aguilas=aguila;
		colorPlumas=colorPluma;
	}
	private Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	public void cantidadAves(){}
	public void movimiento(){}
	public void crearHalcon(){}
	public void crearAguila(){}	
}