package practicaExamen; import java.util.*;

public class bucles5 {
	
	/*
	 * Escribe un programa que simule un menú de opciones:

Mostrar mensaje "Opción 1 seleccionada"

Mostrar mensaje "Opción 2 seleccionada"

Salir

El programa debe mostrar el menú y pedir la opción al usuario hasta que elija salir.

	 */
	
	public static void main (String args[]) {
		
		Scanner sc =  new Scanner (System.in);
		System.out.println("seleccione una de las siguientes opciones: Opcion 1, Opcion 2, salir"); 
	
		String menu = sc.next();
		
		do {
			
			
			if(menu.equals("1")){
				System.out.println("la opción 1 ha sido seleccionada");
			}
			else if(menu.equals("2")) {
				System.out.println("la opción 2 ha sido seleccionada!");
			}
			
			System.out.println("seleccione una de las siguientes opciones: Opcion 1, Opcion 2, salir"); // esto tiene que ir antes del Scanner para que vuelva a evaluar el nuevo valor introducido. 
		
			menu=sc.next(); // aquí se va actualizando lo que introducimos en el menú
			

			
		} while(!menu.equals("salir"));  // muy importante que aquí solo hay la condicion, no cosas entre llaves. 
		
		System.out.println("ha salido del menú");
		
		
		
	}

	
}
