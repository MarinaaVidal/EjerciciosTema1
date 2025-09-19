package es.upm.medicalHistory; import java.util.*;

public class Disease {
	
	
	private String name;
	private String symptoms []; // los síntomas son fijos en una enfermedad por lo que lo podemos meter en un array. 
	private static List<Disease> allDiseases = new ArrayList <Disease>(); // static (común para todas las enfermedades)
	 // las enfermedades se van descubriendo nuevas, como queremos poder ir añadiendo y que el tamaño no sea fijo las metemos en una lista. 

	// como lleva static pertenece a la clase. 
	// si no llevase static pertenece al objeto. 
	
	
	
   String [] symptomsLupus = {"inflamacion", "fiebre", "sarpullido"} ;
	
   
	/* recorrido de arrays:
   
	for (int i=0; i<symptomsLupus.length; i++) {
		
		symptomsLupus[i];
		
	}
	
	*/
   
   /*  recorrido de listas: 
     
    for each 
    
    for(Disease otherDisease : Disease.allDiseases){
    
    String [] otherDiseaseSymptomes = otherDisease.getSymptoms(); // va cogiendo todos los sintomas y los almacena en el string otherDiseaseSymptoms 
    
    for(int j=0; j< OtherDiseaseSymptoms.length;j++){ //recorre el String con todos los síntomas 
    
   // si es el mismo síntoma añade le enfermedad a la lista porq estamos creando una lista de enfermedades con los mismos síntomas.
   // si no es el mismo 
    
    }
    
    */
   
   
   public Disease (String name, String [] symptoms) {
	   super();
	   this.name=name;
	   this.symptoms=symptoms;
	   Disease.allDiseases.add(this); // tenemos que llamar primero a la clase porq allDiseases está declarado como static?
   }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getSymptoms() {
		return symptoms;
	}
	
	public void setSymptoms(String[] symptoms) {
		this.symptoms = symptoms;
	}
	
	

}

