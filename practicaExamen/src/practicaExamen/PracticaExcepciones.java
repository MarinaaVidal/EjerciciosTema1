package practicaExamen; import java.lang.*; import java.util.*;

public class PracticaExcepciones {
	
	 private int a;
	 private int b;
	 
	
	 public PracticaExcepciones() {
	
	 } 
	 
	 public int dameResultado(int a, int b) throws ArithmeticException{
			
			if(b==0) {
				throw new ArithmeticException ("El valor introducido para b, no es válido, la operación tiende a infinito");
			}
			else {
			return a/b;
		}
	 }
	 
	 
	public static void main (String args[]) {
		
		PracticaExcepciones ej1 = new PracticaExcepciones();

		 Scanner sc = new Scanner(System.in);

		System.out.println("introduzca un valor"); 
		
		ej1.a=sc.nextInt(); // para poder usar la variable a (declarada para toda la clase) debe usarse a través de un objeto. Sino habría que declararla como static
		                    // para usarla dentro del main. 
		System.out.println("introduzca otro valor"); 
		
		ej1.b=sc.nextInt();
	
		try {
			
		System.out.println("El resultado de la operación es: "+ ej1.dameResultado(ej1.a, ej1.b));
		
		} catch (ArithmeticException e) {
			
			System.out.println ("no ha podido realizarse la operación");
		}
		
		

}
}
