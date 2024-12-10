package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	public Zona() {}

	{this.animales= new ArrayList<Animal>();}
	public Zona(String nom, Zoologico zoo) {
		nombre=nom;
		this.zoo=zoo;
	}
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public static void agregarAnimales(Animal animal){
		animales.add(animal);
	}
	
	public static int cantidadAnimales(){
		return animales.size();
	}
	
	public Zoologico getZoo() {
		return this.zoo;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo=zoo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	
	public static ArrayList<Animal> getAnimales(){
		return animales;
	}
	
}