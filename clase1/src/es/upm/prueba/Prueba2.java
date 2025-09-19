package es.upm.prueba; import java.util.*; // para poder usar Scanner necesito importar este 

public class Prueba2 {
	
	public static void main (String args[]) {
		// el programa va a recibir un entero, lo transforma en el umbral sumando o restando 1 para que el valor introducido finalmente valga 5. 
		int umbral =5; 
		
		Scanner sc =  new Scanner (System.in); // sc es un objeto y nextInt() es un método ya creado que nos devuelve el entero que se acaba de introducir por pantalla. 
		System.out.println("Por favor escriba un entero"); 
		
		int x = sc.nextInt(); // estamos guardando en la variable x el valor entero que acaba de introducir por pantalla en el scanner. 
	  
	    
		// para el if y el else NO es necesario usar llaves. 
		
	
		
		if(x>umbral) {
			System.out.println("Por encima del umbral"); 
			System.out.println("el usuario ha introducido el número " + x);
			
			int i=0; 
			for(i=x;i>umbral;i--){
				x--;
				if(x==umbral) {
				System.out.println("El valor de x ya es igual al umbral= " + x);
			}
			}
			
		} 
		else if (x==umbral) {
			System.out.println("El valor introducido es igual al umbral");
		}
		
		else {
			System.out.println("Por debajo del umbral");
			
			int i=0; 
			for(i=x;i<umbral;i++) {
				x++;
				if(x==umbral) {
				System.out.println("El valor de x ya es el del umbral= "+ x);
				}
			}
			
		}
	
		
	}
	

}
