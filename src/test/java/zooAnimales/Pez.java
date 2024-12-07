package zooAnimales;
import gestion.Zona;

public class Pez extends Animal {
	
	public Pez() {
		listado[listado.length]=this;
	}
	public Pez (String nom, int ed, String hab, String gen,String colorEscama, int cantidadAleta){
		setNombre(nom);
		setEdad(ed);
		setHabitat(hab);
		setGenero(gen);
		colorEscamas=colorEscama;
		cantidadAletas=cantidadAleta;
		listado[listado.length]=this;
	}
	
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private int cantidadAletas;
	private String colorEscamas;
	
	public static int cantidadPeces(){
		return bacalaos+salmones;
	}
	
	public String movimiento(){
		return "nadar";
	}
	
	public static Pez crearBacalao(String nom, int ed, String gen){
		bacalaos+=1;
		return new Pez(nom,ed,"oceano",gen,"rojo",6);
	}
	
	public static Pez crearSalmon(String nom, int ed, String gen){
		salmones+=1;
		return new Pez(nom,ed,"oceano",gen,"gris",6);
	}
	
	public Pez[] getListado(){
		return listado;
	}
	
	public void setListado(Pez pez){
		listado[listado.length]=pez;
	}
	
	public int getCantidadAletas(){
		return cantidadAletas;
	}
	
	public void setCantidadAletas(int cantidadAletas){
		this.cantidadAletas=cantidadAletas;
	}
	
	public String getColorEscamas(){
		return colorEscamas;
	}
	
	public void setColorPlumas(String colEscamas){
		this.colorEscamas=colEscamas;
	}
}