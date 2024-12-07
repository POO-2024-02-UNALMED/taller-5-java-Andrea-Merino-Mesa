package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal {
	public Anfibio() {}
	public Anfibio (String nom, int ed, String hab, String gen, Zona zona, String piel, boolean veneno){
		colorPiel=piel;
		venenoso=veneno;
		listado[listado.length]=this;
	}
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public void cantidadAnfibios(){}
	public String movimiento(){
		return "saltar";
	}
	public void crearRana(String nom, int ed, String gen, Zona zona){
		++ranas;
		Anfibio anfibio =new Anfibio(nom,ed,"selva",gen,zona,"rojo",true);
	}
	public void crearSalamandra(String nom, int ed, String gen, Zona zona){
		++salamandras;
		Anfibio anfibio =new Anfibio(nom,ed,"selva",gen,zona,"negro y amarillo",false);
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
	public void ColorPiel(String colPiel){
		this.colorPiel=colPiel;
	}
	public boolean Venenoso(){
		return venenoso;
	}
	public void setHabitat(boolean veneno){
		this.venenoso=veneno;
	}
}