package zooAnimales;

import gestion.Zona;

public class Ave extends Animal {
	public Ave() {}
	public Ave (String nom, int ed, String hab, String gen,String colorPluma){
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
	public void crearHalcon(String nom, int ed, String gen){
		++halcones;
		Ave ave =new Ave(nom,ed,"montanas",gen,"cafe glorioso");
	}
	public void crearAguila(String nom, int ed, String gen){
		++aguilas;
		Ave ave =new Ave(nom,ed,"montanas",gen,"blanco y amarillo");
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