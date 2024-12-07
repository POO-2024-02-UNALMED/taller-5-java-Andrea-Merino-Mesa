package zooAnimales;
import gestion.Zona;
public class Reptil extends Animal {
	public Reptil() {}
	public Reptil (String nom, int ed, String hab, String gen, Zona zona, String colorEscama, int cola){
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
	public void crearIguana(String nom, int ed, String gen, Zona zona){
		++iguanas;
		Reptil reptil =new Reptil(nom,ed,"humedal",gen,zona,"verde",3);
	}
	public void crearSerpiente(String nom, int ed, String gen, Zona zona){
		++serpientes;
		Reptil reptil =new Reptil(nom,ed,"jungla",gen,zona,"blanco",1);
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
