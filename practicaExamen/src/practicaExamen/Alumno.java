package practicaExamen; import java.util.*;


public class Alumno {
	
	private String nombre;
	private double nota;
	
	public Alumno(String nombre, double nota) {
		this.nombre=nombre;
		this.nota=nota;
	}
	
	
	public boolean haAprobado(double nota) {
		return (nota>=5.0);
	}
	
	
	
	public static void main(String args[]) {
		
		Alumno alumno1 = new Alumno("Juan", 6.7);
		Alumno alumno2 = new Alumno ("María", 4.5);
		
		List<Alumno> alumnos = new ArrayList<>();
		
		alumnos.add(alumno2);
		alumnos.add(alumno1);
		
		for(Alumno alumno : alumnos){
		
			System.out.println("nombre: " + alumno.nombre + ", nota: " + alumno.nota + ", ha aprobado? " + alumno.haAprobado(alumno.nota));
			
		}
		
	}
	

}
