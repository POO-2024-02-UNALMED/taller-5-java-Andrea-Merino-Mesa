package zooAnimales;
import gestion.Zona;
public class Reptil extends Animal {
	public Reptil() {}
	public Reptil (int tA, String nom, int ed, String hab, String gen, Zona[] zona,Reptil[] lis, int iguana, int serpiente, String colorEscama, int cola){
		listado=lis;
		iguanas=iguana;
		serpientes=serpiente;
		colorEscamas=colorEscama;
		largoCola=cola;
	}
	private Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private int largoCola;
	private String colorEscamas;
	public void cantidadReptiles(){}
	public void movimiento(){}
	public void crearIguana(){}
	public void crearSerpiente(){}	
}