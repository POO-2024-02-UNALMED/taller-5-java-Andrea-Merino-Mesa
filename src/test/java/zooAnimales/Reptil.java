package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;
public class Reptil extends Animal {
	public Reptil() {
		listado.add(this);
	}
	
	public Reptil (String nom, int ed, String hab, String gen,String colorEscama, int cola){
		setNombre(nom);
		setEdad(ed);
		setHabitat(hab);
		setGenero(gen);
		colorEscamas=colorEscama;
		largoCola=cola;
		listado.add(this);
		}

	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private int largoCola;
	private String colorEscamas;
	
	public static int cantidadReptiles(){
		return listado.size();
	}
	
	public String movimiento(){
		return "reptar";
	}
	
	public static Reptil crearIguana(String nom, int ed, String gen){
		iguanas+=1;
		return new Reptil(nom,ed,"humedal",gen,"verde",3);
	}
	
	public static Reptil crearSerpiente(String nom, int ed, String gen){
		serpientes+=1;
		return new Reptil(nom,ed,"jungla",gen,"blanco",1);
	}
	
	public ArrayList<Reptil> getListado(){
		return listado;
	}
	
	public void setListado(Reptil rep){
		listado.add(rep);
	}
	public int getLargoCola(){
		return largoCola;
	}
	
	public void setLargoCola(int Cola){
		this.largoCola=Cola;
	}
	
	public String getColorEscamas(){
		return colorEscamas;
	}
	
	public void ColorPiel(String colPiel){
		this.colorEscamas=colPiel;
	}
}
