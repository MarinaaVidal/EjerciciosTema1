package practicaExamen;

public class bucles6 {
	
	/*
	 * Crea un array de 10 números enteros.

     Usa un bucle for para recorrer todos los elementos del array.

     Calcula y muestra:

     La suma total de los elementos.
  
     El número mayor del array.

     El número menor del array.
     
   
	 */
	
	int numeros [] = {1, 2, 3, 4, 5, 6, 7,8, 9, 10};
	int suma=0;
	
	public bucles6() {
		
	}
	
	public int devuelveSuma() {
		
		for(int i=0; i<numeros.length; i++) { // numeros.length es 10 y la posiciones del array van de 0-9 por eso ponemos el < y no <=
			suma+=numeros[i];
		}
	
		return suma;
	}
	
	public int devuelveMayor() {
		
		int numMayor=0; // lo inicializamos como un num pequeño para que todos sean mayores y se vayan comparando entre ellos. 
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>numMayor) {
				numMayor=numeros[i];
			}
		}
		
		return numMayor; 
	}

	public int devuelveMenor() {
		
		int numMenor=20; 
		
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]<numMenor) {
				numMenor=numeros[i];
			}
		}
		
		return numMenor;
	}
	
	static bucles6 ejemplo = new bucles6();
	
	public static void main (String args[]) {
		
	try {
		System.out.println(ejemplo.devuelveSuma());
		System.out.println(ejemplo.devuelveMayor());
		System.out.println(ejemplo.devuelveMenor());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
}
