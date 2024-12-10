package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zoologico {
	
	public Zoologico() {}
	{this.zonas= new ArrayList<Zona>();}
	public Zoologico(String nom, String ubi){
		nombre=nom;
		ubicacion=ubi;
		this.zonas= new ArrayList<Zona>();
	}
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public int cantidadTotalAnimales(){
		int ca=0;
		for(int i = 0; i < zonas.size(); i++){
			ca+=this.getZona().get(i).cantidadAnimales();
		}
		return ca;
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