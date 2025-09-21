package practicaExamen; import java.util.*;

public class bucles4 {

	/*
	 * Escribe un programa que pida al usuario una contraseña hasta que introduzca la correcta: "java123".

El programa debe pedir la contraseña al menos una vez, aunque la primera vez sea correcta.

Cuando se introduce la contraseña correcta, el programa imprime "Acceso concedido" y termina.
	 */
	
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
	
		// hay que poner algo por pantalla antes para que el scanner pueda almacenar un valor, sino está almacenando algo vacío

		System.out.println("por favor introduzca la contraseña"); 
		
		String password = sc.next();
		String contrasena="java123";
	
		// nos aseguramos de que almenos pida la contraseña una vez. por eso hacemos un do while
		
		
		do {

			System.out.println("por favor introduzca la contraseña, gracias");
			password = sc.next(); // cada vez que vuelve a introducir la contraseña se actualiza el valor de password y vuelve a comparalo con la contraseña correcta. 
			
		}
		// hasta que la contraseña que ha introducido no sea igual que java123 no va a parar de preguntar la contraseña. 
		while(!password.equals(contrasena));
	

		System.out.println("ha introducido la contraseña correcta");
		
	}
	
	
	
	
	
}
