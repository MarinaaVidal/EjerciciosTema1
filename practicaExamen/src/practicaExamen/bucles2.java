package practicaExamen; import java.util.*;

public class bucles2 {
	
	// ejercicios de práctica switch/case. 
	
	// pedimos al usuario que introduzca por pantalla un día de la semana y nosotros le devolvemos si es 
	// un día laborable o fin de semana. 
	
	public static void main (String args[]) {
     
		System.out.println("por favor introduzca un día de la semana");
		
		Scanner sc = new Scanner (System.in);
     
     String dia = sc.next();
     
     switch(dia){
     
     case "lunes" : 
    	 System.out.println("día laborable, entre semana");
    	 break;
    	 
     case "martes" : 
    	 System.out.println("día laborable");
    	 break;
    	 
     case "miércoles" : 
        	 System.out.println("día laborable");
        	 break;
        	 
     case "jueves" : 
            	 System.out.println("día laborable");
            	 break;
            	 
     case "viernes" : 
                	 System.out.println("día laborable");
                	 break;
              
     case "sábado" : 
    	 System.out.println("fin de semana");
    	 break; 
     
     case "domingo" : 
    	 System.out.println("fin de semana");
    	 break; 
    	 
    	 default:
    		 System.out.println("no ha introducido un día de la semana");                	 
 
     
     }
     }
}
