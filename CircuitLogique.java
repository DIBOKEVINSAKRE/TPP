package outlfrml;

public class CircuitLogique {
	 
 
	    public boolean transitionQ3(boolean carteValide, boolean codeCorrect, boolean codeIncorrect) {
	 
	        return (carteValide && codeCorrect) || (codeCorrect);
	    }

	    
	    public boolean transitionQ4(boolean carteInvalide, boolean codeIncorrect, boolean codeSecondIncorrect) {
	      
	        return carteInvalide || (codeIncorrect && codeSecondIncorrect);
	    }

	    public static void main(String[] args) {
	         
	        CircuitLogique circuit = new CircuitLogique();

	       
	        boolean carteValide = true;  
	        boolean codeCorrect = true; 
	        boolean codeIncorrect = false;  
	        boolean resultatQ3 = circuit.transitionQ3(carteValide, codeCorrect, codeIncorrect);
	        System.out.println("Accès accordé (q3) : " + resultatQ3);  

	         
	        boolean carteInvalide = false;  
	        boolean codeSecondIncorrect = true;  
	        boolean resultatQ4 = circuit.transitionQ4(carteInvalide, codeIncorrect, codeSecondIncorrect);
	        System.out.println("Alarme déclenchée (q4) : " + resultatQ4);  
	    }
	}
 
