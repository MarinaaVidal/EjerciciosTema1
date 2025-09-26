
import java.util.*;

public class Ejercicio4 {
	
	
	
	public float devuelveSuma (List<Float> num) {
		float suma=0;
		for(int i=0; i<num.size(); i++) {
			suma+=num.get(i);
		}
		return suma;
	}
	
	
	public int buscaValor (List<Integer> numeros, int numBuscado) {
		
		int posicion=-1;
		
		for(int i=0; i<numeros.size(); i++) {
			if(numeros.get(i)==numBuscado) {
			posicion=i;	
			}
		}
		
		return posicion; // devuelve la posición, en caso de que no se cumpla el if posicion sigue valiendo -1. 
	}
	
	
	public void generaLista300 (){
		
		List <Integer> modulo16 = new ArrayList<Integer>();
		
		for(int i=0; i<300; i++) {
			modulo16.add(i%16);
		}
		
		for(Integer num : modulo16) {
			System.out.print(num + ", ");
		}
		
	}
	
	
	public float calculaPromedio(List<Float> numeros) {
		
		float suma=0;
		float numTotal=0;
		
		for(Float num : numeros) {
			suma+=num;
			numTotal++;
		}
		
		return suma/numTotal;
	}
	
	
	
	public List<Integer> listaCambiada (List <Integer> lista, int num){
		
		List<Integer> listaCambiada = new ArrayList<>();
		
		for(int i=0; i<lista.size(); i++) {
			
			listaCambiada.add(lista.get(i)*num);  // mientras vamos recorriendo la lista vamos almacenando en la lista cambiada los valores multiplicados por el numero que queramos. 	
		}
		
		return listaCambiada;
		
	}
	
	
	public int numNegativos(List<Integer> numeros) {
		int index=0;
		
		for(Integer num : numeros) {
			if(num<0) {
				index++;
			}
		}
		
		return index;
	}
	
	
	public void invertirOrden(List<Integer> lista) {
		
		List <Integer> listaInvertida= new ArrayList<>();
		
		for(int i=0; i<lista.size(); i++) {
			listaInvertida.add(lista.get(lista.size()-1-i));
		}
		
		for(Integer num : listaInvertida) {
			System.out.print(num + ", ");
		}
	}
	
	
	public void calculaMediaMaxMin() {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numIntroducidos = new ArrayList<Integer>();
		
		float suma=0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int numero;
		
		do {
			
		  System.out.println("introduzca un numero");
		  numero=sc.nextInt();
		  
		  if(numero!=0) {
		  numIntroducidos.add(numero);
		  }
		  
		  for(Integer num : numIntroducidos) { // este for debe ir aquí dentro porque sino sigue pidiendo numeros al ver que hay un sc. 
				
				suma+=numero;
				
				if(num>max) {
					max=num;
				}
				
				if(num<min) {
					min=num;
				}	
		
		}
		 
		
		} while(numero != 0);
		
		
		
		System.out.println("El promedio es: " + suma/numIntroducidos.size());
		System.out.println("El valor máxiomo es: " + max);
		System.out.println("El valor mínimo es: " + min);
		
	
	}
		
		
		
	public List<Integer> filtro (List<Integer> lista, int umbral){
		
		List<Integer> listaFiltrada = new ArrayList<>();
		
		for(Integer numero : lista) {
			if(numero>umbral) {
				listaFiltrada.add(numero);
			}
		}
		
		return listaFiltrada;
		
	}
	
	
	
	
	public static void main (String args[]) {
		
		Ejercicio4 ej = new Ejercicio4();
		List <Float> numeros = new ArrayList <>();
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(356);
		
		numeros.add(2.5f);
		numeros.add(3.9f);
		numeros.add(5.6f);
		
		System.out.println("la suma de la lista de números es: " + ej.devuelveSuma(numeros));
		System.out.println("la posición del número introducido es: " + ej.buscaValor(numbers, 1));
	    ej.generaLista300();
	    System.out.println("");
	    System.out.println(ej.calculaPromedio(numeros));
	    System.out.println(ej.listaCambiada(numbers, 3));
	    System.out.println(ej.numNegativos(numbers));
        ej.invertirOrden(numbers);
        ej.calculaMediaMaxMin();
        System.out.println(ej.filtro(numbers, 3));
        
        
	}
	
	
	
	
	
	

}
