package es.upm.prueba;

public class Prueba {
	
	public static void main (String args[]) { 
		
		int x =5; // declaramos y ya inicializamos 
		
		char a;  // declaramos y en la línea de abajo inicializamos
		a= 'N'; // el char va con solo una comilla, el String con dos. 
		
		boolean logica = true;
		
		float f = 5.0F; 
		
		// realmente el ordenador lo que almacena en la variable x no es un "5" sino la representacion binaria del 5 (010 por ej). 
		// lo mismo sucede con el char a, logica y f. No almacenan esos valores sino sus representaciones binarias. 
	
		x = x + 5; // estamos cambiando el valor que tenia x inicialmente. si ejecutasemos el programa desp de esta línea la x valdría su valor inciial más 5.  
		f = f - 1.0F;
		logica=false;
		
		System.out.println(a); // imprime por pantalla lo que está guardado en la variable a. 
		

	}
	
	// para hacer un debug colocamos un breakpoint a partir de la lína que queremos que nos cuete qué está pasando a nuestro programa. 

}
