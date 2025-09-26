
import java.util.*; import java.io.*;
public class EjerciciosArchivos {
	
	// leer un archivo y q muestre por pantalla lo que pone. 
	
	public void leerArchivo (String filename) throws Exception {
		
		File f = new File (filename); // creamos la ruta del archivo. 
		
		FileInputStream fis = new FileInputStream(f); // creamos el canal por el qu habrá una entrada de bytes. 
		
		DataInput fid = new DataInputStream (fis); 
		
		String line = fid.readLine(); // inicializamos line con la primera linea del archivo.
		
		while(line!=null) {
			System.out.println(line);
			line=fid.readLine(); // está leyendo la siguiente linea. 
		}
		
		fis.close();
		
		
	}
	
	
	
	public void escribeArrayFloat(String filename, float[] datos) throws Exception {
		
		File f = new File(filename);
		FileOutputStream fos = new FileOutputStream (f);
		PrintStream pr = new PrintStream(fos);
		
		for(int i=0; i<datos.length; i++) {
			pr.print(datos[i]+ ", "); // para escribir siempre se pone print y dentro lo que queremos que se escriba. 
		}
		
		pr.close();

		
	}
	
	public void añadeTexto (String filename) throws Exception {
		
		File f = new File (filename);
		
		FileOutputStream fos = new FileOutputStream(f);
		PrintStream pr = new PrintStream(fos); 
		
		Scanner sc = new Scanner (System.in);
		
		for(int i=0; i<4; i++) {
			String line=sc.nextLine();
			pr.print(line);
		}
		
		pr.close();
	}
	
	
	
	public void copiaPegaArchivo (String filename, String filename2) throws Exception {
		File f2 = new File (filename);
		File f = new File (filename2);
		FileInputStream fis = new FileInputStream(f);
		DataInput fid  = new DataInputStream (fis); 
		
		FileOutputStream fos = new FileOutputStream(f2);
		PrintStream pr = new PrintStream(fos);
		
		String line=fid.readLine();
		
		while(line !=null) {
			pr.print(line);
			line=fid.readLine();

		}
		
		pr.close();
		fis.close();
		
	}

	public int cuentaLineas(String filename) throws Exception {
		int numLineas=0;
		File f = new File (filename);
		FileInputStream fis = new FileInputStream(f);
		DataInputStream fid = new DataInputStream(fis);
		
		String line;
		while((line=fid.readLine())!=null) {
			numLineas++;
		}
		
		return numLineas;
		
	}
	
	// comprueba si un fichero existe antes de leerlo:
	
	public void ficheroExisteLeelo(String filename) throws Exception {
		
		File f = new File(filename);
		
		// tiene sentido poner esto antes, porque si no existe el fichero no se puede crear la entrada de bits ni la lectura de este. 
		
		if(!f.exists()) {
			System.out.println("el fichero no ha podido leerse porque no existe");
		} 
		
		else {
			
			FileInputStream fis = new FileInputStream(f);
			DataInputStream fid = new DataInputStream(fis);
             String line=fid.readLine();
			
			while(line!=null) {
				line=fid.readLine();
			}
		}
		
	}
	
	
}
