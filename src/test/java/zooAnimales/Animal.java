package zooAnimales;
import gestion.Zona;
public class Animal {
	public Animal() {}
	public Animal(int tA, String nom, int ed, String hab, String gen, Zona[] zona){
		totalAnimales=tA;
		nombre=nom;
		edad=ed;
		habitat=hab;
		genero=gen;
		this.zona=zona;
	}
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	public void movimiento(){}
	public void totalPorTipo(){}
	public String toString(){return "hola";}
}