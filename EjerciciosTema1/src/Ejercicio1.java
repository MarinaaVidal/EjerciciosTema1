import java.util.*; 
public class Ejercicio1 {
	
	/* 
	 * Defina variables que representen el número de días de un año, el número de horas que
    tiene un día, el número de minutos que tiene una hora y el número de segundos que tiene
    un minuto. Emplee las variables que ocupen el mínimo espacio de memoria posible.
	 */
	
	 short días; // no podemos meterlo en byte porq byte solo va de -128 a 127. 365 DÍAS
	 short horas; // 8760 HORAS
	 int minutos; // no podemos meterlo en un short porq va de -32768 a 32767. 525600 MINUTOS.
	 int segundos; // 31,536,000 
	
	/*
	 * A continuación, calcule el número de segundos que tiene un año y almacene el valor de dicho
	cálculo en otra variable.
	 */

	 // segundos = (365*24*60*60); DA ERROR PORQUE DEBERÍA ESTAR METIDO DENTRO DE UN MÉTODO. LA OTRA POSIBILIDAD ES INICIALIZAR LA VARIABLE DIRECTAMENTE. 
	
	 int segundosAño = (365*24*60*60);
	 
	/* Muestre por pantalla los mayores números enteros que se pueden representar mediante un
	 char, un short y un int */
	 
	 
	 // CREAMOS UN OBJETO DE TIPO SCANNER PORQUE VAMOS A QUERER QUE EL USUARIO INTRODUZCA NUMEROS POR PANTALLA. 
	 
	 Scanner sc = new Scanner(System.in);
	 
	 public static void main (String args[]) {
		 
		 Ejercicio1 ej = new Ejercicio1();
		 
		 
   System.out.println("Valor máximo de char: " + Character.MAX_VALUE); // llamamos desde la clase Character al método MAX_VALUE que nos devuelve el valor máximo que puede almacenarse en char. 
   System.out.println("Valor máximo de int: " + Integer.MAX_VALUE); // llamamos al método MAX_VALUE desde la clase Integer.
   System.out.println("Valor máximo de char: " + Short.MAX_VALUE); 
  
   System.out.println("Valor mínimo de char: " + Character.MIN_VALUE); // llamamos desde la clase Character al método MIN_VALUE que nos devuelve el valor mínimo que puede almacenarse en char. 
   System.out.println("Valor máximo de int: " + Integer.MIN_VALUE); // llamamos al método MIN_VALUE desde la clase Integer.
   System.out.println("Valor máximo de char: " + Short.MIN_VALUE); 
   System.out.println("El valor de la suma de todos los múltiplos del 1 al 100 es:" + ej.sumaMultiplesCinco());
   System.out.println("El número de múltiplos del 1 al 100 es:" + ej.numMultiplosCinco());
   System.out.println("Todos los múltiplos de 5 del 1 al 10 son");
   ej.MultiplosCinco();
  //   ej.numMax();
  // ej.numMin();
   ej.tablasMultiplicacion();
   

	 }
	 
	 // calcula la suma de todos los múltiplos de de 5 que hay entre 1 y 100. 
	 
	 public int sumaMultiplesCinco () {
		 
		 int suma=0;
		 int numeros1al100 [] = new int[100];
		 int index=0;
		 
		 for(int i=0; i<numeros1al100.length;i++) {
			 numeros1al100[i]=i+1; // creamos un array que tiene todos los números del 1 al 100 almacenados. 
		 }
		 
		 // para saber cuales son los múltiplos de 5. 
		 
		 List<Integer> multiplosde5 = new ArrayList<>();
		 
		 for(int j=0; j<numeros1al100.length;j++) {
			
			 if(numeros1al100[j]%5==0) {
					
				multiplosde5.add(numeros1al100[j]);
				index++;
				
			 }
		 }
		 
		 for(Integer multiplo : multiplosde5) {
			 suma+=multiplo;
		 }
		 
		 
		 return suma;
		 
	 }
	 
	 // calcula cuantos múltiplos de 5 hay entre 1 y 100. 
	 
 
	 public int numMultiplosCinco () {
		 
		 int numMultiplos=0;
		 int numeros1al100 [] = new int[100];
		 
		 for(int i=0; i<numeros1al100.length;i++) {
			 numeros1al100[i]=i+1; // creamos un array que tiene todos los números del 1 al 100 almacenados. 
		 }
		 
		 // para saber cuales son los múltiplos de 5. 
		 
		 List<Integer> multiplosde5 = new ArrayList<>();
		 
		 for(int j=0; j<numeros1al100.length;j++) {
			
			 if(numeros1al100[j]%5==0) {
					
				multiplosde5.add(numeros1al100[j]);
				numMultiplos++;
				
			 }
		 }
		 
		 return numMultiplos;
		 
	 }
	 
	 
	 //Muestra todos los números múltiplos de 5 que hay del 1 al 100. 
	 
        public void MultiplosCinco () {
		 
		 int numeros1al100 [] = new int[100];
		 
		 for(int i=0; i<numeros1al100.length;i++) {
			 numeros1al100[i]=i+1; // creamos un array que tiene todos los números del 1 al 100 almacenados. 
		 }
		 
		 // para saber cuales son los múltiplos de 5. 
		 
		 List<Integer> multiplosde5 = new ArrayList<>();
		 
		 for(int j=0; j<numeros1al100.length;j++) {
			
			 if(numeros1al100[j]%5==0) {
					
				multiplosde5.add(numeros1al100[j]);				
			 }
		 }
		 
		 
		 for(Integer multiplos : multiplosde5) {
			 System.out.print(multiplos + ", ");
		 }
		 
	 }
        
        
 /*Calcule el mínimo y el máximo de una serie de números enteros positivos introducidos por
el usuario. Cuando el usuario introduzca un número negativo se considerará que el anterior
a este es el último número*/ 
        
        
        public void numMax () {
        	
        	int num1;
        	int num2;
        	int num3;
        	int numMax=Integer.MIN_VALUE;
        	
        	List<Integer> numeros = new ArrayList<>();
        	
        	System.out.println("introduzca un número: "); 
        	num1=sc.nextInt();
        	
        	System.out.println("introduzca otro número: "); 
        	num2=sc.nextInt();

        	System.out.println("introduzca otro número: ");
        	num3=sc.nextInt();
        	
        	numeros.add(num1);
        	numeros.add(num2);
        	numeros.add(num3);
        	
        	for(Integer numero : numeros) {
        		if(numero>numMax) {
        			numMax=numero;
        		}
        		
        	}
        	
        	System.out.println("el número máximo es: " + numMax);
   	
        	
        }
        
        
        public void numMin () {
        	
        	int num1;
        	int num2;
        	int num3;
        	int numMin=Integer.MAX_VALUE;
        	
        	List<Integer> numeros = new ArrayList<>();
        	
        	System.out.println("introduzca un número: "); 
        	num1=sc.nextInt();
        	
        	System.out.println("introduzca otro número: "); 
        	num2=sc.nextInt();

        	System.out.println("introduzca otro número: ");
        	num3=sc.nextInt();
        	
        	numeros.add(num1);
        	numeros.add(num2);
        	numeros.add(num3);
        	
        	for(Integer numero : numeros) {
        		if(numero<numMin) {
        			numMin=numero;
        		}
        		
        	}
        	
        	System.out.println("el número mínimo es: " + numMin);
   	
        }
	 
      
      
        public void tablasMultiplicacion() {
			List<int[]> numeros = new ArrayList<>();

        	for (int i=1; i<11; i++) {
    			int listaNum [] = new int [10]; // cada vez que termina una tabla se crea un array nuevo en la que almacenar la tabla del numero siguiente. 

        		for(int j=1; j<11; j++) { 			
        			int numero=i*j;
        			
        			listaNum[j-1]=numero;
        			
        			if(j==10) {
        			numeros.add(listaNum);
        			}	
        			}
        	}
        	
        	for(int[] numero : numeros) {
        	 
        		for(int i=0; i<numeros.size(); i++) {
        			System.out.print(numero[i] + ", ");
        			
        			if(i==9) {
        				System.out.println(" ");
        				
        			}
        		}
        	}
        }
        
  	 	 
	 
}
