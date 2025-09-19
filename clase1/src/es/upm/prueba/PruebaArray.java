package es.upm.prueba;

public class PruebaArray {

	public static void main (String args[]) {
		int [] a1= {1, 2, 3, 4};
		int [] a2 = {1, 2, 3, 4}; 
		
		int x=3; 
		int y=3; 
		
		System.out.println("y=x? " + (y==x)); // true tienen la misma direccion de memoria???
		System.out.println("a1=a2? " + (a1==a2)); //false estamos comparando dos mochilas de cosas. Las direcciones de memoria de a1 y a2 no son las mismas. por eso da false.  
		
		System.out.println("posicion 1 de a1 = posición 1 de a2? " + (a1[1]==a2[1])); // aquí SI son lo mismo. porque los valores que se estan almacenando son iguales. 

		// cambiamos el valor de a1[1]
		
		a1[1]=5;
		System.out.println("posicion 1 de a1 = posición 1 de a2? " + (a1[1]==a2[1])); // ahora ya no tienen el mismo número almacenado. 

	}
}
