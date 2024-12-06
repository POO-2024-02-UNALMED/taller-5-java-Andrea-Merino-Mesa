package gestion;
import zooAnimales.Animal;
public class Zona {
	public Zona() {}
	public Zona(String nom, Zoologico[] zoo, Animal[] animal) {
		nombre=nom;
		this.zoo=zoo;
		animales=animal;
	}
	private String nombre;
	private Zoologico[] zoo;
	private Animal [] animales;
	public void Animales(){}
	public void cantidadAnimales(){}
}