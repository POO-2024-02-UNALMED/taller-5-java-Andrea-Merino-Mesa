package gestion;
import zooAnimales.Animal;
import zooAnimales.Ave;
public class Zona {
	public Zona() {}
	public Zona(String nom, Zoologico zoo, Animal animal) {
		nombre=nom;
		this.zoo=zoo;
		animales[animales.length]=animal;
	}
	private String nombre;
	private Zoologico zoo;
	private Animal [] animales;
	
	public void Animales(){}
	public void cantidadAnimales(){}
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
	public Animal[] getAnimales(){
		return animales;
	}
	public void setAnimales(Animal animal){
		animales[animales.length]=animal;
	}
	
}