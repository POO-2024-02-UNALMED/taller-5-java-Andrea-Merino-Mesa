package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	public Anfibio() {}
	public Anfibio (String nom, int ed, String hab, String gen,String piel, boolean veneno){
		colorPiel=piel;
		venenoso=veneno;
		listado[listado.length]=this;
	}
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public int cantidadAnfibios(){
		return ranas+salamandras;
	}
	public String movimiento(){
		return "saltar";
	}
	public void crearRana(String nom, int ed, String gen){
		++ranas;
		Anfibio anfibio =new Anfibio(nom,ed,"selva",gen,"rojo",true);
	}
	public void crearSalamandra(String nom, int ed, String gen){
		++salamandras;
		Anfibio anfibio =new Anfibio(nom,ed,"selva",gen,"negro y amarillo",false);
	}
	public Anfibio[] getListado(){
		return listado;
	}
	public void setListado(Anfibio anfibio){
		listado[listado.length]=anfibio;
	}
	public String getColorPiel(){
		return colorPiel;
	}
	public void setColorPiel(String colPiel){
		this.colorPiel=colPiel;
	}
	public boolean isVenenoso(){
		return venenoso;
	}
	public void setVenenoso(boolean veneno){
		venenoso=veneno;;
	}
	
}