package gestion;
import zooAnimales.Animal;
import zooAnimales.Ave;
public class Zona {
	public Zona() {}
	public Zona(String nom, Zoologico zoo) {
		nombre=nom;
		this.zoo=zoo;
	}
	private String nombre;
	private Zoologico zoo;
	private Animal [] animales;
	
	public void Animales(){}
	public void cantidadAnimales(){
		//No se
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
	public Animal[] getAnimales(){
		return animales;
	}
	public void setAnimales(Animal animal){
		animales[animales.length]=animal;
	}
	
}