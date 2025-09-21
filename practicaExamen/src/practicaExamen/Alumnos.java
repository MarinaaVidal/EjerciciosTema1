package practicaExamen; import java.util.*; 

public class Alumnos {
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	private int edad;
	
	

	
	public static void main (String args[]) {

		List<Alumnos> alumnos = new ArrayList<>();


		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca el nombre del alumno1");
		System.out.println("introduzca la edad del alumno1");
		
		Alumnos alumno1 = new Alumnos(sc.next(), sc.nextInt());
		
		System.out.println("introduzca el nombre del alumno2");
		System.out.println("introduzca la edad del alumno2");
		
		
		Alumnos alumno2 = new Alumnos(sc.next(), sc.nextInt());
		
		System.out.println("introduzca el nombre del alumno3");
		System.out.println("introduzca la edad del alumno3");
		
		Alumnos alumno3 = new Alumnos(sc.next(), sc.nextInt());

		alumnos.add(alumno3);
		alumnos.add(alumno2);
		alumnos.add(alumno1);
		
		// mostrar la lista de alumnos. 
		
		for(Alumnos alumno : alumnos ) {
			System.out.println(alumno);
		}

		// mostrar la edad de un alumno según su nombre. 
		try {
		 datosAlumno(alumnos, "maría");
		 eliminarAlumno(alumnos, "maría");
		 modificarEdad(alumnos, "pepe");
		} 
		catch (ConcurrentModificationException e) {
			System.out.println("ha ocurrido un error");
			
		}
		 
		 // mostrar la lista modificada
		 for(Alumnos alumno : alumnos ) {
				System.out.println(alumno);
			}
		 
	}
	

	public Alumnos(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	
	}
	
	public String toString() {
		return "El nombre es: " + this.nombre + "la edad del alumno: "+ this.edad;
	}
	
	
	public static int datosAlumno (List<Alumnos> alumnos, String nombre) { // como la lista está creada dentro del método main para poder recorrerla hay que pasarla como parámetro. 
		int edad=0;
		for(Alumnos alumno : alumnos) {
			
			if(alumno.nombre.equals(nombre)) {
				edad= alumno.edad;
			
			}
		}
		return edad; // debe devolver algo siempre por lo que tiene que ir fuera del for. 
	}
	
	
	public static void eliminarAlumno(List<Alumnos> alumnos, String nombre) {
            for(Alumnos alumno : alumnos) {
			if(alumno.nombre.equals(nombre)) {
				alumnos.remove(alumno);
			}
	}
	
	
	}
	
	public static void modificarEdad(List<Alumnos> alumnos, String nombre) {
		for(Alumnos alumno : alumnos) {
			if(alumno.nombre.equals(nombre)) {
				alumno.setEdad(13);
			}
		
	}
	
	}
	
	
}


	

