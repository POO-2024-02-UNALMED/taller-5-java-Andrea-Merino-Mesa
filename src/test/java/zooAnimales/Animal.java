package zooAnimales;
import gestion.Zona;
public class Animal {
	public Animal() {}
	public Animal(String nom, int ed, String hab, String gen, Zona zona){
		++totalAnimales;
		nombre=nom;
		edad=ed;
		habitat=hab;
		genero=gen;
		this.zona=zona;
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
	
	public String totalPorTipo(){
		//devolvera el siguiente formato con la cantidad de animales por cada
		//subclase de animales
		return "Mamíferos: "+"\nAves: "+"\nReptiles: "+"\nPeces: "+"\nAnfibios: ";
			
	}
	public String toString(){
		if(zona==null || zona.getZoo()==null) {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+"habito en "+habitat+" y mi genero es "+genero;
		}
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+"habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.getNombre()+", en el"+zona.getZoo().getNombre()+".";}
	
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
		return habitat;
	}
	public void setGenero(String gen){
		genero=gen;
	}
	public Zona getZonat(){
		return zona;
	}
	public void setZona(Zona zona){
		this.zona=zona;
	}
}