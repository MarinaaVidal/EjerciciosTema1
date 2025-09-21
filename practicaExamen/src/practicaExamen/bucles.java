package practicaExamen; import java.util.*;

public class bucles {

	// práctica if/else 
	// ej1: pida al usuario que introduzca un número por pantalla y diga si es par o impar. 
	
	public static void main (String args[]) {
	System.out.println("introduzca un número entero");
	
	Scanner sc = new Scanner (System.in); // creamos un objeto de tipo Scanner donde vamos a almacenar el valor que introduzca por pantalla el usuario. 
	
	int numero = sc.nextInt();
	
	// un número es par si al dividir entre 2 su resto es 0. 
	// un número es impar si al dividir entre 2 su resto es 1. 
		
	
	if(numero%2==0) {
	
		System.out.println("el número introducido es par");
	}
	else {
		System.out.println("El número introducido es impar");
	}
	
	}
	
	
}
