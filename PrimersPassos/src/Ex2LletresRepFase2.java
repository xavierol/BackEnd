import java.util.ArrayList;

public class Ex2LletresRepFase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList tipus char al que afegire'm lletres nom
		ArrayList<Character> name = new ArrayList<Character>();  
		
		name.add('X'); 
		
		name.add('a'); 

		name.add('v'); 
		
		name.add('i'); 
		
		name.add('3'); 
		
		name.add('r'); 		
		
		//Recorre array name i troba n�meros, vocals i consonants		
		for(char element:name) {
			//Condici� per trobar si hi ha n�ms del 0 al 9 en codi ASCII
			if((int) element<58 && (int) element>47) {
				
				System.out.println(element+" --> Els noms de persones no contenen n�meros!");
			//Condici� per trobar vocals
			} else if(element=='a' || element=='e' || element=='i' || element=='o' || element=='u') {
				
				System.out.println(element+" --> VOCAL");
			
			} else {
				
				System.out.println(element+" --> CONSONANT");

			}

		}
		
	}
}

/* FASE 2
 * Canvia la taula per una llista (List<Character>)
 * Al bucle, si la lletra �s una vocal imprimeix a la consola: �VOCAL�. Sin�, imprimeix: �CONSONTANT�.
 * Si trobes un numero, mostra per pantalla: �Els noms de persones no contenen n�meros!�.
 */



