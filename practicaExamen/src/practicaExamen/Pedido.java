package practicaExamen;

public class Pedido {
	
	private int id;
	private EstadosPedido estado;
	
	public Pedido (int id, EstadosPedido estado) {
		
		this.id=id;
		this.estado=estado;
	}

	public void mostrarEstado() {
		System.out.println("El estado del pedido es: " + this.estado); // poniendo el this aquí hacemos que coja el estado del respectivo pedido según se haya inicializado en el constructor.
	}
	
	public static void main (String args[]) {
		
		Pedido pedido1 = new Pedido (245, EstadosPedido.EN_PROCESO);
		Pedido pedido2 = new Pedido (2938, EstadosPedido.ENTREGADO); 
		
		System.out.println("El pedido 1 de id: " + pedido1.id); 
		pedido1.mostrarEstado();
		
		
	}
}
