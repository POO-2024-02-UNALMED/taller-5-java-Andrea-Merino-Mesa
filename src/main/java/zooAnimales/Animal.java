package zooAnimales;
import gestion.Zona;

public class Animal {
	
	public Animal() {
	}
	public Animal(String nom, int ed, String hab, String gen){
		totalAnimales+=1;
		nombre=nom;
		edad=ed;
		habitat=hab;
		genero=gen;
	}
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	public String movimiento(){
		return "desplazarse";
	}
	
	public static String totalPorTipo(){
		return "Mamiferos: "+ (Mamifero.getListado().size())+"\n"+"Aves: "+(Ave().getListado().size())+"\n"+"Reptiles: "+(Reptil().getListado().size())+"\n"+"Peces: "+(Pez().getListado().size())+"\n"+"Anfibios: "+(Anfibio().getListado().size());	
	}
	
	public String toString(){
		if(this.zona==null || this.zona.getZoo()==null) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
		}
		return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona.getNombre()+", en el"+this.zona.getZoo().getNombre()+".";}
	
	public static int getTotalAnimales(){
		return totalAnimales;
	}
	
	public static void setTotalAnimales(int tAnimales){
		totalAnimales+=tAnimales;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nom){
		nombre=nom;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	public String getHabitat(){
		return habitat;
	}
	
	public void setHabitat(String hab){
		habitat=hab;
	}
	
	public String getGenero(){
		return genero;
	}
	
	public void setGenero(String gen){
		genero=gen;
	}
	
	public Zona getZona(){
		return zona;
	}
	
	public void setZona(Zona zona){
		this.zona=zona;
	}
}