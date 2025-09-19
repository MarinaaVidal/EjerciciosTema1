package es.upm.medicalHistory; import java.time.*; import java.util.*;

public class MedicalHistory {
	
	private String name;  // al poner los atributos privados lo que hacemos es que no podemos usarlos desde fuera de la clase a no ser que creemos los getters y setters. Dentro de la misma clase sí que podría usarse. 
	private String dob;
	private String bloodType; 
	private boolean alive; 
	private String dod;
	private List<Disease> diseases = new ArrayList<Disease>();
	
	// getters y setters. 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getDod() {
		return dod;
	}

	public void setDod(String dod) {
		this.dod = dod;
	}

	public List<Disease> getDiaseases() {
		return diseases;
	}

	public void setDiaseases(List<Disease> diaseases) {
		this.diseases = diaseases;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	
	public void addDisease(Disease disease) {	
		this.diseases.add(disease);
	}
	
	
	public boolean hasDisease(Disease disease) {
		return this.diseases.contains(disease); // aquí llamamos a diseases desde el objeto porque no está declarado como static. 
	} // el this esta funcionando como objeto? pero como no tenemos ninguno creado le ponemos this?
	
	
	public MedicalHistory() { // constructor
		
		this.alive=true; // siempre que creamos un paciente lo creamos VIVO.
	}
	
	// se pueden crear tantos constructores de la misma clase como queramos siempre y cuando no tengan el mismo numero de parámetros. ??
	
	public MedicalHistory(String name, String dob, String bloodType) {
        super(); // sería necesario??
		this.alive=alive;
		this.bloodType=bloodType;
		this.dob=dob;
		this.name=name;
		
	}
	
	
	public boolean isAlive() { // no hace falta que le pasemos nada por parámetro porq la función la vamos a ejecutar sobre un objeto y ese objeto ya va a tener sus atributos (alive false o true). 
		return alive;	
	}
	
	public void hasDied(String dead) {
		this.dod=dead;
		
	}
	
	public String toString() {
		return "MedicalHistory [name " + name + ""; // terminar el toString 
		
	}
	

	
}
