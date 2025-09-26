
public class DNI {

	public char calcularLetraDNI(int numDni) {
		char letra=' ';
		double valor = (numDni%23);
		
		if(valor==0) {
			letra='T';
		}
		else if (valor==1) {
			letra='R';
		}
		else if (valor==2) {
			letra='W';
		
	    }
		else if (valor==3) {
			letra='A';
		}
		else if (valor==4) {
			letra='G';
		
	    }else if (valor==5) {
		letra='M';
	   }
	     else if (valor==6) {
		  letra='Y';
	
        }else if (valor==7) {
	     letra='F';
        }
       else if (valor==8) {
	    letra='P';

       }else if (valor==9) {
	    letra='D';
       }
      
       else if (valor==10) {
	    letra='X';
	    
       } else if (valor==11) {
			letra='B';
		}
		else if (valor==12) {
			letra='N';
		
	}
		else if (valor==13) {
			letra='J';
		}
		else if (valor==14) {
			letra='Z';
		
	    }else if (valor==15) {
		letra='S';
	   }
	     else if (valor==16) {
		  letra='Q';
	
        }else if (valor==17) {
	     letra='V';
        }
       else if (valor==18) {
	    letra='H';

       }else if (valor==19) {
	    letra='L';
      
       }
       else if (valor==20) {
	    letra='C';
      
       }else if (valor==21) {
   	    letra='K';
         
       }
          else if (valor==22) {
   	    letra='E';

}
	    
	    return letra;
}
	
	public static void main (String args[]) {
		DNI ej = new DNI();
		
		System.out.println(ej.calcularLetraDNI(43231735));
	}
	
}
