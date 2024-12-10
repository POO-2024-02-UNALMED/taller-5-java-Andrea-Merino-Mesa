package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {
	
	public Mamifero() {
	}
	static {listado= new ArrayList<Mamifero>();}
	{listado.add(this);}
	public Mamifero (String nom, int ed, String hab, String gen, boolean pelaje, int pata){
		setNombre(nom);
		setEdad(ed);
		setHabitat(hab);
		setGenero(gen);
		patas=pata;
		this.pelaje=pelaje;
		}

	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private int patas;
	private boolean pelaje;
	
	public static int cantidadMamiferos(){
		return listado.size();
	}
	
	public static Mamifero crearCaballo (String nom, int ed, String gen){
		caballos+=1;
		return new Mamifero(nom,ed,"pradera",gen,true,4);
	}
	
	public static Mamifero crearLeon(String nom, int ed, String gen){
		leones+=1;
		return new Mamifero(nom,ed,"selva",gen,true,4);
	}
	
	public static ArrayList<Mamifero> getListado(){
		return listado;
	}
	
	public static void setListado(Mamifero mam){
		listado.add(mam);
	}
	
	public int getPatas(){
		return patas;
	}
	
	public void setPatas(int patas){
		this.patas=patas;
	}
	
	public boolean isPelaje(){
		return pelaje;
	}
	
	public void setPelaje(boolean pelaje){
		this.pelaje=pelaje;
	}
	
}