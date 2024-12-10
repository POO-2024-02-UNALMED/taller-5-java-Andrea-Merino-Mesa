package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal {
	
	public Anfibio() {
	}
	static {listado= new ArrayList<Anfibio>();}
	{listado.add(this);}
	public Anfibio (String nom, int ed, String hab, String gen,String piel, boolean veneno){
		setNombre(nom);
		setEdad(ed);
		setHabitat(hab);
		setGenero(gen);
		colorPiel=piel;
		venenoso=veneno;
		listado.add(this);
		}

	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public int cantidadAnfibios(){
		return listado.size();
	}
	
	public String movimiento(){
		return "saltar";
	}
	
	public static Anfibio crearRana(String nom, int ed, String gen){
		ranas+=1;
		return new Anfibio(nom,ed,"selva",gen,"rojo",true);
	}
	
	public static Anfibio crearSalamandra(String nom, int ed, String gen){
		salamandras+=1;
		return new Anfibio(nom,ed,"selva",gen,"negro y amarillo",false);
	}
	
	public static ArrayList<Anfibio> getListado(){
		return listado;
	}
	
	public static void setListado(Anfibio anf){
		listado.add(anf);
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