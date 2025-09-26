import java.util.*;

public class Ejercicio2 {
	
	
	float [] numeros = {1f,2f,3f,4.5f,67.8f};  // cuando escribimos un float tiene que ser con una f al final. 
	int [] numeros2 = {1,2,3,4,5,6,7};
	
	public float suma (float [] numeros) {
		
		float suma=0;
		
		for(int i=0; i<numeros.length; i++) {
			suma+=numeros[i];
		}
		
		return suma;
		
		
	}
	
	
	public int buscaNumero(int[] numeros, int numero) {
		
		int posicion=0;
		
		for(int i=0; i<numeros.length; i++) {
			
			if (numeros[i]==numero) {
				posicion=i;
			}
		}
			if (posicion==0) { // si posicion sigue valiendo 0 quiere decir que no ha encontrado el valor en ese array y que por eso no se ha actualizado el valor de posicion.
				
				System.out.println("no existe");
				posicion=-1;
			}
			
		return posicion;
	}

	
	
	public void creaArray() {
		
		int [] modulo16 = new int[15]; 
		
		for(int i=0; i<modulo16.length; i++) {
			
			modulo16[i]=i%16; // así va almacenando cada vez el resto (0,1, 2, 3, 4 ,... 15, 0,1,2,3,..)
	
		}
			
		System.out.println(modulo16);
	}
	

	 public float devuelvePromedio(float[] numbers) {
	    	
	    	float suma=0f;
	    	float promedio=0f;
	    	
	    	for(int i=0; i<numbers.length;i++) {
	    		suma+=numbers[i];
	    	}
	    	
	    	promedio=suma/numbers.length;
	    
	    	return promedio;
	    	
	    }
	    
    
	 
	 public int[] valorMaximoFila (int [][] valores) {
		 
		 int index=0;
		 int [] valoresMaximos = new int [valores.length]; // como queremos un array que nos devuelva el valor máximo de cada fila, habrá tantas posiciones como filas. 

		 
		 for(int i=0; i<valores.length; i++) {
			 
			 int valorMax = Integer.MIN_VALUE; // metemos esto aquí dentro porque sino para la siguiente vez que comparase valorMax lo estaría haciendo con el máximo de la fila anterior y no queremos eso sino encontrar el máximo de cada fila, no el de la matriz. 
			 
			 for(int j=0; j<valores[i].length; j++) {
				 
				if( valores[i][j]>valorMax) {
					valorMax=valores[i][j];
					
				}
				
			 }
			 
			 valoresMaximos[i]=valorMax;
			 
		 }
		
		 return valoresMaximos;
		 
	 }
	 
	 
	 public int[] multiplicarPorFactor(int [] array, int factor) {
		 
		 int arrayMultiplicado [] = new int [array.length]; // va a tener el mismo tamaño porque es el mismo array pero multiplicando por un factor.
		 int valor=0;
		 
		 
		 for(int i=0; i<array.length; i++) {
			 valor=array[i]; // el valor que queremos cambiar va siempre a la izquierda!!!
			 
			 arrayMultiplicado[i]=valor*factor;
			 
		 }
		 
		 return arrayMultiplicado;
		 
	 }
	 
	 
	 
	 public int numValoresNegativos(float[] numeros) {
		 
		 int numNeg=0;
		 
		 for(int i=0; i<numeros.length; i++) {
			 
			 if(numeros[i]<0) {
				 numNeg++;
			 }
		 }
		 
		 return numNeg;
		 
	 }
	 
	 
	 public char[] invertirOrden(char[] palabra) {
		 
		 char[] palabraInvertida = new char[palabra.length];
		 char letra=0;
		 
		 for(int i=0; i<palabra.length; i++) {
			 
			 letra=palabra[i];
			 
			 palabraInvertida[palabra.length-1-i]=letra; // hay q tener en cuenta el -1 porq no tiene posición palabra.length (es un num más que el nº de posiciones). 
			 
		 }
		 
		 return palabraInvertida;
	 }
    
	 
   
     public char[] invertirOrden2(char[] palabra) { // si queremos hacerlo con el mismo array temos que asegurarnos de eliminar lo que había en esa posición. 
		 
		 char letra=0;
		 
		 for(int i=0; i<palabra.length; i++) {
			 
			 letra=palabra[i];
			 
			 palabra[i]=palabra[palabra.length-1-i];
			 
			 palabra[palabra.length-1-i]=letra; // hay q tener en cuenta el -1 porq no tiene posición palabra.length (es un num más que el nº de posiciones). 
			 
		 
		 }
		 
		 return palabra;
	 }
    
     
    
     public void calculaMediaMAxMin() {
    	 
    	 int suma=0;
    	 int valor=0;
    	 int index=0;
    	 int valorMax=Integer.MIN_VALUE;
    	 int valorMin=Integer.MAX_VALUE;
    	 
    	 do {
    	 
    		 System.out.println("introduzca un número");

    	     Scanner sc = new Scanner (System.in);
    	     valor=sc.nextInt();
    	     
    	     suma+=valor;
    	     index++;
    	
    	     if(valor>valorMax) {
    		 valorMax=valor; }
    	     
    	     if(valor<valorMin) {
    	    	 valorMin=valor; 
    	    	 }
    	 
    	 } while(valor!=0);
    	 
    	 System.out.println("el valor de la suma es: " + suma);
    	 System.out.println("el valor de la media es: " + (double)suma/index);
    	 System.out.println("el valor máximo es: " + valorMax);
    	 System.out.println("el valor minimo es: " + valorMin);
    	 
    	 
    	 }
     
   
     public static void main (String args[]) {
     	
     	Ejercicio2 ej = new Ejercicio2();
     
     	
         System.out.println("la suma del array de decimales es: " + ej.suma(ej.numeros)); // numeros es un atributo del objeto, por lo que para acceder a él se necesita hacer a través del objeto. 
     	System.out.println(ej.buscaNumero(ej.numeros2, 10));
     	ej.creaArray();
     	System.out.println("El promedio es: " + ej.devuelvePromedio(ej.numeros)); 
        ej.calculaMediaMAxMin();
     	
     }
     
     
     public char[] unirChars(char[] palabra1, char[] palabra2) {
		 int i=0; 
    	 char[] palabrasUnidas = new char [palabra1.length+palabra2.length];
    	 
    	 for(int m=0; m<palabra1.length; m++) {
    		 
    		 palabrasUnidas[m]=palabra1[m];
    		  
    		 
    	 }
    	 
    	 for(int j=palabra1.length; j<palabra1.length+palabra2.length; j++) {
    		 palabrasUnidas[j]=palabra2[i];
    		 i++;
    	 }
    	 
    	 return palabrasUnidas;
     }
     
     
     public List<int[]> segmentaArrays(int[] array, int numSegmentos) {
    	   
    	 List<int[]> arraysSegmentados = new ArrayList<>();

    	    int tamañoSegmento = array.length / numSegmentos;

    	    for (int s = 0; s < numSegmentos; s++) {
    	        int[] nuevoArray = new int[tamañoSegmento];

    	        for (int i = 0; i < tamañoSegmento; i++) {
    	            nuevoArray[i] = array[s * tamañoSegmento + i];
    	        }

    	        arraysSegmentados.add(nuevoArray);
    	    }

    	    return arraysSegmentados;
    	}
     
    
     public float[] seleccionNumeros (float [] valores) {
    	 
    	 int indice=0;
    	 List<Float> numSeleccionados = new ArrayList<>();
    	 
    	 for(int i=1; i<valores.length-1; i++) {
    		 
    		 if(valores[i]>valores[i-1] && valores[i]>valores[i+1]) {
    			 
    			 indice++;
    			 numSeleccionados.add(valores[i]);
    			 
    		 }
    	 }
    	 
    	
    	 float[] valoresSeleccionados = new float[indice];
    	 
    	 
    		 for(int i=0; i<numSeleccionados.size(); i++) {
    		 valoresSeleccionados[i]=numSeleccionados.get(i);
    	 }
    	 
     // numSeleccionados.get(i) nos devuelve el float de esa posicion concreta de la lista. 
    	 
    	 return valoresSeleccionados;
   
}
     
     
     
  
     
     
}
	

