package gestion;
public class Zoologico {
	public Zoologico() {}
	public Zoologico(String nom, String ubi, Zona[] zona){
		nombre=nom;
		ubicacion=ubi;
		zonas=zona;
	}
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	public void agregarZonas(){}
	public void cantidadTotalAnimales(){}
}