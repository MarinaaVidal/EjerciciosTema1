package practicaExamen; import java.util.*;

public class bucles3 {

	/*
	 * Escribe un programa que pida al usuario números enteros y los sume.

   El programa debe seguir pidiendo números mientras el usuario no introduzca 0.

    Cuando se introduce 0, el programa termina y muestra la suma total.
    
	 */
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		int suma=0;
		
		System.out.println("por favor introduzca un número");

		int num = sc.nextInt();
				
		while (num!=0) {
			
			System.out.println("vuelva a introducir un número");
			
			// si el numero introducido es distinto de 0 el bucle se va repitiendo y se va actualizando la suma. 
		   
			suma+=num; 
			
			num=sc.nextInt(); // ahora num pasa a ser otro (el que se vuelve a introducir). y se vuelve a evaluar el bucle. 
			
		}
		
		// cuando se termina el bucle nos imprime el resultado de la suma (ya no se han añadido más números). 
		
		System.out.println("el resultado de la suma es: " + suma);
	}
	
	
	
	
}
