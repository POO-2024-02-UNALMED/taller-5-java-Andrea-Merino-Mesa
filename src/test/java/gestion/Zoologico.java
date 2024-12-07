package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;
public class Zoologico {
	
	public Zoologico() {}
	public Zoologico(String nom, String ubi){
		nombre=nom;
		ubicacion=ubi;
		this.zonas= new ArrayList<Zona>();
	}
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public void cantidadTotalAnimales(){
		Animal.getTotalAnimales();
		//retornar la cantidad de animales total de todas 
		//las zonas que tengan relacion con el Zoologico
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nom) {
		nombre=nom;
	}
	public String getUbicacion() {
		return this.ubicacion;
	}
	public void setUbicacion(String ubi) {
		ubicacion=ubi;
	}
	public ArrayList<Zona> getZona() {
		return this.zonas;
	}
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
}