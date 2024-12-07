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
		return "Mamiferos: "+new Mamifero().cantidadMamiferos()+"\n"+"Aves: "+new Ave().cantidadAves()+"\n"+"Reptiles: "+new Reptil().cantidadReptiles()+"\n"+"Peces: "+new Pez().cantidadPeces()+"\n"+"Anfibios: "+new Anfibio().cantidadAnfibios();	
	}
	
	public String toString(){
		if(zona==null || zona.getZoo()==null) {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+",habito en "+habitat+" y mi genero es "+genero;
		}
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+",habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.getNombre()+", en el"+zona.getZoo().getNombre()+".";}
	
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