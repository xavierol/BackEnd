import java.util.*;

public class Ex2LletresRepFase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList tipus char al que afegire'm lletres nom
		ArrayList<Character> name = new ArrayList<Character>();  
		
		name.add('x'); 
		
		name.add('a'); 

		name.add('v'); 
		
		name.add('i'); 
		
		name.add('e'); 
		
		name.add('r'); 	
		
		name.add('f');
		
		name.add('o');
		
		name.add('n');
		
		name.add('t');
		
		name.add('s'); 
		
		name.add('a'); 

		name.add('l'); 
		
		name.add('a'); 
		
		name.add('s'); 
	
		
		//Hashmap que contindrà arraylist name i les vegades que es repeteix cada lletra 				
		HashMap<Character, Integer> meuNom = new HashMap<Character, Integer>();
		
		//Recorre array name comparant amb si mateix al bucle intern	
		for(char element:name) {
			//Establim var contador per contar les vegades que es repeteix un caracter
			int count=0;
			for(char element2:name) {
				/*
				 * Si el caracter torna a aparéixer sumem 1 a count
				 * anem ficant la lletra amb la suma de vegades que apareix
				 * si fica la mateixa lletra no es un nou valor però canvia valor suma
				 */
				if (element==element2) {	
					count++;
					meuNom.put(element, count);
					
				}
				
			}
			
		}	
					
		System.out.println(meuNom);
	}

}

/* FASE 3
 * Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.
 */



