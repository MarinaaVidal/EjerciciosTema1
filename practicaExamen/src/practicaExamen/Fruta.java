package practicaExamen; import java.util.*;

public class Fruta {
	
	private String color;
	private String nombre;
	
	public Fruta(String color, String nombre) {
		this.color=color;
		this.nombre=nombre;
	}
	
	public static void main(String args[] ) {
	   
		List<Fruta> frutas = new ArrayList<>(); // creamos una lista que almacenará objetos fruta. 

		Fruta fruta1 = new Fruta ("rojo", "manzana");
		Fruta fruta2 = new Fruta("verde", "pera");
		Fruta fruta3 = new Fruta ("amarillo", "plátano");
		
		frutas.add(fruta1);
		frutas.add(fruta2);
		frutas.add(fruta3);
		
		for(Fruta fruta : frutas) {
			System.out.println("Nombre: "+ fruta.nombre + ", color de la fruta: " + fruta.color);
		}
		
	}
	

}
