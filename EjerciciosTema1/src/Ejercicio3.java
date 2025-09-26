
public class Ejercicio3 {
	
	private String numeros = "1, 2, 3";
	
	public static void main (String args[]) {
		
		Ejercicio3 ej = new Ejercicio3();
		
		System.out.println(ej.numeros.charAt(0)); // imprimimos el de la posición 0 (primer numero del String)
	}
	
	public int cuantoshay (String palabra, char caracter) {
     
		int index=0;
		for(int i=0; i<palabra.length(); i++) {
			if(palabra.charAt(i)==caracter) { // charAt(i) devuelve el carácter que está en la posición i de palabra. 
				index++;
				
			}
		}
		return index;
	
		
	}
	
	
	public String eliminaEspaciosBlanco(String frase) {
		
		return frase.replace(" ", ""); // los Strings no pueden modificarse (por lo que no se pueden eliminar carácteres) lo que sí podemos hacer
		                               // es reemplazar un carácter por otro.

	}
	
	
	
	public String paseAMayúsculas(String frase) {
		return frase.toUpperCase();
	}
	
	
	public int numVocales(String frase) {
		int numVocales=0;
		for(int i=0; i<frase.length(); i++) {
			
			if(frase.charAt(i)== 'a' || frase.charAt(i)== 'e' || frase.charAt(i)== 'i' || frase.charAt(i)== 'o' || frase.charAt(i)== 'u') {
				numVocales++;
			}
			
		}
		return numVocales;
	}
	
	public String ponerAlrevés (String frase) {
		
		String fraseAlreves= "";
		
		for(int i=frase.length()-1; i>=0; i--) { // empezamos leyendo por el final
			
			char c=frase.charAt(i);
			
			fraseAlreves+=c;
			
			// fraseAlreves.charAt(frase.length()-i-1)=c; MAL PORQUE charAt(i) solo deja leer el carácter de esa posición pero no puedes escribir usando el método.
			
		}
		return fraseAlreves;
	}
	
	
	public boolean esPalindroma(String frase) {
		int index=0; 
		
		for (int i=0; i<frase.length()/2;i++) {
				if(frase.charAt(i)==frase.charAt(frase.length()-i-1)) {
					index++;
				}
		}	
		
		if(index==frase.length()/2) {
			return true;
		} else {
			return false;
		}
	}
	
		
	}
	


