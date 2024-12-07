package gestion;
public class Zoologico {
	public Zoologico() {}
	public Zoologico(String nom, String ubi, Zona zona){
		nombre=nom;
		ubicacion=ubi;
		zonas=zona;
	}
	private String nombre;
	private String ubicacion;
	private Zona zonas;
	public void cantidadTotalAnimales(){
		//retornar ́a la cantidad de animales total de todas 
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
	public Zona getZonas() {
		return this.zonas;
	}
	public void agregarZonas(Zona zona) {
		zonas=zona;
	}
}