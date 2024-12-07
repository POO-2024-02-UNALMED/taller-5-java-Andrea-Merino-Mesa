package zooAnimales;
import gestion.Zona;
public class Reptil extends Animal {
	public Reptil() {
		listado[listado.length]=this;
	}
	public Reptil (String nom, int ed, String hab, String gen,String colorEscama, int cola){
		setNombre(nom);
		setEdad(ed);
		setHabitat(hab);
		setGenero(gen);
		colorEscamas=colorEscama;
		largoCola=cola;
		listado[listado.length]=this;
	}
	
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private int largoCola;
	private String colorEscamas;
	
	public static int cantidadReptiles(){
		return serpientes+iguanas;
	}
	
	public String movimiento(){
		return "reptar";
	}
	
	public static Reptil crearIguana(String nom, int ed, String gen){
		++iguanas;
		return new Reptil(nom,ed,"humedal",gen,"verde",3);
	}
	
	public static Reptil crearSerpiente(String nom, int ed, String gen){
		++serpientes;
		return new Reptil(nom,ed,"jungla",gen,"blanco",1);
	}
	
	public Reptil[] getListado(){
		return listado;
	}
	
	public void setListado(Reptil reptil){
		listado[listado.length]=reptil;
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
