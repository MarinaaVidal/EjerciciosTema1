package practicaExamen; import java.util.*;

public class bucles7 {
	
	/* 
	 * crea una lista con 5 nombres e imprimelos por pantalla.
	 */

	public static void main (String args[]) {
	
		List<String> nombres = new ArrayList<>(); 
	
	nombres.add("María");
	nombres.add("Lucía");
	nombres.add("Julia");
	nombres.add("Paula");
	nombres.add("Magnet");
	nombres.add("Marina");
	nombres.add("Paco");

	
	for(String nombre : nombres) {
		System.out.println(nombre); // para de recorrerlo automáticamente cuando se ha leido toda la lista. 
	}
	
	// ponemos que se imprima cada elemento de la lista por eso nombre. 
	// si pusiésemos que se imprima nombres veríamos toda la lista entera con todos los elementos almacenados en ella y 
	// lo veríamos tantas veces impreso como veces se repite el bucle. 
	
	}
	
	
}
