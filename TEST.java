package outlfrml;
import java.util.Scanner;
public class TEST {
	 


	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Systemee systeme = new Systemee();  
	        
	        while (true) {
	           
	            System.out.println("État actuel : " + systeme.getEtatActuel());
	            
	             
	            System.out.println("\nMenu :");
	            System.out.println("1. Insérer une carte valide");
	            System.out.println("2. Insérer une carte invalide");
	            System.out.println("3. Saisir un code correct");
	            System.out.println("4. Saisir un code incorrect");
	            System.out.println("5. Réinitialiser le système");
	            System.out.println("6. Quitter");
	            
	           
	            System.out.print("Choisissez une option   : ");
	            int choix = scanner.nextInt();
	            
	            switch (choix) {
	                case 1:  
	                    systeme.transition("carteValide");
	                    break;
	                
	                case 2: 
	                    systeme.transition("carteInvalide");
	                    break;
	                
	                case 3: 
	                    systeme.transition("codeCorrect");
	                    break;
	                
	                case 4: 
	                    systeme.transition("codeIncorrect");
	                    break;
	                
	                case 5:  
	                    systeme.reinitialiser();
	                    break;
	                
	                case 6:  
	                    System.out.println("Au revoir, repasse mardi prochain  ! !");
	                    scanner.close();
	                    return; 
	                
	                default:
	                    System.out.println("Option invalide, veuillez choisir entre 1 et 6.");
	            }
	        }
	    }
	}