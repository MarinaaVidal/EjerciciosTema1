package practicaExamen;

public class Perro extends Animal {
	
	private String raza; 
	
	public Perro (String nombre, String raza) {
		super(nombre);
		this.raza=raza;
	}
	
	public void hacerSonido() { // estamos sobreescribiendo el método heredado de la clase padre. 
		System.out.println("guau!");
	}

	public static void main (String args[]) {
		
		Animal a = new Animal ("jirafa");
		Perro p = new Perro ("Max", "labrador");
		
		System.out.println("La jirafa hace este sonido: ");
        a.hacerSonido();
		
		System.out.println("El perro hace este sonido: ");
		 p.hacerSonido();
		
	}
}
