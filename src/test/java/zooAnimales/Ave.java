package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	
	public Ave() {
		listado[listado.length]=this;
	}
	public Ave (String nom, int ed, String hab, String gen,String colorPluma){
		setNombre(nom);
		setEdad(ed);
		setHabitat(hab);
		setGenero(gen);
		colorPlumas=colorPluma;
		listado[listado.length]=this;
	}
	
	private static Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public static int cantidadAves(){
		return aguilas+halcones;
	}
	
	public String movimiento(){
		return "volar";
	}
	
	public static Ave crearHalcon(String nom, int ed, String gen){
		++halcones;
		return new Ave(nom,ed,"montanas",gen,"cafe glorioso");
	}
	
	public static Ave crearAguila(String nom, int ed, String gen){
		++aguilas;
		return new Ave(nom,ed,"montanas",gen,"blanco y amarillo");
	}
	
	public Ave[] getListado(){
		return listado;
	}
	
	public void setListado(Ave ave){
		listado[listado.length]=ave;
	}
	
	public String getColorPlumas(){
		return colorPlumas;
	}
	
	public void setColorPlumas(String colplumas){
		this.colorPlumas=colplumas;
	}
}