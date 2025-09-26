import java.io.*;
public class Ejercicio8 {
	
	String [] numeros = {"1.2", "3.5", "6.7"};
	
	public float[] conversorStringFloat() {
    
		float [] valores = new float[numeros.length];
		
		for(int i=0; i<numeros.length; i++) {
			valores[i]=Float.parseFloat(numeros[i]);
		}
		
	    return valores;
    
		}
	
	
	public File dividirArchivo(String filename) throws Exception {
		
		File f = new File(filename);
		FileInputStream fis = new FileInputStream(f);
		DataInputStream fid = new DataInputStream(fis);
		
		String line = fid.readLine();
		String [] componentes = line.split(","); // split mete los num separados por comas en un array.
		
		while(line!=null) {
			line=fid.readLine();
			
		}
		
	}
	

}
