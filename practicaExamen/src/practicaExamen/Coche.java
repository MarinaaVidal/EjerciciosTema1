package practicaExamen;

public class Coche {
	
	private String marca;
	private int velMax;
	
	public Coche(String marca, int velMax) {
		this.marca=marca;
		this.velMax=velMax;
	}
		
	
	public String getMarca() {
		return marca;
		
	}
	
	public int velMax() {
		return velMax; 
	}
	
 
	public static void main (String args[]) {
		
		Coche coche1 = new Coche("Audi", 80);
		Coche coche2 = new Coche("Mercedes", 280);
		Coche coche3 = new Coche("Toyota", 180);
		
		 Coche [] coches = {coche1, coche2, coche3};
	
		 for(int i=0; i<coches.length; i++) {
		 System.out.println( "Marca: " + coches[i].getMarca() + ", velocidad máxima: " + coches[i].velMax );
		 }
		 
	}
 
	

	

	
	
	
}
