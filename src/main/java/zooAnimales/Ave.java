package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
	
	public Ave() {
	}
	static {listado= new ArrayList<Ave>();}
	{listado.add(this);}
	public Ave (String nom, int ed, String hab, String gen,String colorPluma){
		setNombre(nom);
		setEdad(ed);
		setHabitat(hab);
		setGenero(gen);
		colorPlumas=colorPluma;
		}

	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public static int cantidadAves(){
		return listado.size();
	}
	
	public String movimiento(){
		return "volar";
	}
	
	public static Ave crearHalcon(String nom, int ed, String gen){
		halcones+=1;
		return new Ave(nom,ed,"montanas",gen,"cafe glorioso");
	}
	
	public static Ave crearAguila(String nom, int ed, String gen){
		aguilas+=1;
		return new Ave(nom,ed,"montanas",gen,"blanco y amarillo");
	}
	
	public ArrayList<Ave> getListado(){
		return listado;
	}
	
	public void setListado(Ave ave){
		listado.add(ave);
	}
	
	public String getColorPlumas(){
		return colorPlumas;
	}
	
	public void setColorPlumas(String colplumas){
		this.colorPlumas=colplumas;
	}
}