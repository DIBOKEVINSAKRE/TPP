package outlfrml;

public class Systemee {
	 

 
	 
		    private String etatActuel;  

		    public Systemee() {
		       
		        this.setEtatActuel(Etats.q0);
		    }

		  
		    
		    public void transition(String action) {
		        switch (getEtatActuel()) {
		            case Etats.q0:  
		                if ("carteValide".equals(action)) {
		                    setEtatActuel(Etats.q1);
		                    System.out.println("Transition : q0 -> q1 (Carte valide insérée, attente du code)");
		                } else if ("carteInvalide".equals(action)) {
		                    setEtatActuel(Etats.q4);
		                    System.out.println("Transition : q0 -> q4 (Carte invalide, alarme déclenchée)");
		                } else {
		                    System.out.println ("Action invalide pour q0.");
		                }
		                break;

		            case Etats.q1:
		                if ("codeCorrect".equals(action)) {
		                    setEtatActuel(Etats.q3);
		                    System.out.println("Transition : q1 -> q3 (Code correct, accès accordé)");
		                } else if ("codeIncorrect".equals(action)) {
		                    setEtatActuel(Etats.q2);
		                    System.out.println("Transition : q1 -> q2 (Code incorrect, attente de la 2e tentative)");
		                } else {
		                    System.out.println("Action invalide pour q1.");
		                }
		                break;

		            case Etats.q2 :
		                if ("codeCorrect".equals(action)) {
		                    setEtatActuel(Etats.q3);
		                    System.out.println("Transition : q2 -> q3 (Deuxième tentative correcte, accès accordé)");
		                } else if ("codeIncorrect".equals(action)) {
		                    setEtatActuel(Etats.q4);
		                    System.out.println("Transition : q2 -> q4 (Deuxième tentative échouée, alarme déclenchée)");
		                } else {
		                    System.out.println("Action invalide pour q2.");
		                }
		                break;

		            case Etats.q3:  
		                System.out.println("Accès déjà accordé. Aucune transition nécessaire.");
		                break;

		            case Etats.q4:  
		                System.out.println("Alarme déclenchée. Réinitialisez le système.");
		                break;

		            default:
		                System.out.println("État inconnu.");
		        }
		    }

		      
		    public void reinitialiser() {
		        this.setEtatActuel(Etats.q0);
		        System.out.println("Système réinitialisé à l'état initial (q0).");
		    }



			public String getEtatActuel() {
				return etatActuel;
			}



			public void setEtatActuel(String etatActuel) {
				this.etatActuel = etatActuel;
			}
		}
	 

 
