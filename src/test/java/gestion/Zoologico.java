package gestion;
public class Zoologico {
	public Zoologico() {}
	public Zoologico(String nom, String ubi){
		nombre=nom;
		ubicacion=ubi;
	}
	private String nombre;
	private String ubicacion;
	private Zona zonas;
	public void cantidadTotalAnimales(){
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
	public Zona getZona() {
		return this.zonas;
	}
	public void agregarZona(Zona zona) {
		zonas=zona;
	}
}