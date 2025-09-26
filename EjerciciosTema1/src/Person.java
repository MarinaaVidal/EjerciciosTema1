
public class Person {
	
	private String nombre;
	private int edad;
	private DNI dni;
    private Sexo sexo;
	
	 enum Sexo {
		MUJER, HOMBRE;
		
	}
	
	private double peso;
	private double altura;
	
	public String getnombre() {
		return nombre;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo=sexo;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public DNI getDni() {
		return dni;
	}


	public Person() {
		this.altura=0;
		this.edad=0;
		this.nombre="";
		this.peso=0;
		this.sexo=Sexo.MUJER;
	}
	
	public Person (String nombre, int edad, Sexo sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	
	public Person (String nombre, int edad, Sexo sexo, double altura, double peso) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.altura=altura;
		this.peso=peso;
	}
	
	
	public Person (String nombre, int edad, Sexo sexo, double altura, double peso, DNI dni) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.altura=altura;
		this.peso=peso;
		this.dni=dni;
	}
	
	
	public double computeBCI() {
		return (this.peso/Math.pow((this.altura),2));
	}
	
	
	enum Peso{
		SOBREPESO, PESO_IDEAL, DEBAJO_PESO;
	}
	
	public Peso evaluateWeigth() {
		
		
		if(this.peso/Math.pow((this.altura),2)>25) {
			return Peso.SOBREPESO;
		}
		
		else if (this.peso/Math.pow((this.altura),2)<18) {
			return Peso.DEBAJO_PESO;
		}
		
		else {
			return Peso.PESO_IDEAL;
		}
		
	}
	
	
	public boolean mayorEdad() {
		return this.edad>18;
	}
	
	
	public String toString() {
		return "El nombre de la persona es: " + this.nombre + ", la edad: " + this.edad + ", la altura: " + 
	     ", el peso: " + this.peso + ", el sexo: " + this.sexo + " y el DNI: " + this.dni;
	}
	
	
	
	

}
