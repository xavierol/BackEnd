import java.util.ArrayList;

public class Ex2LletresRepFase4ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// ArrayList al que afegire'm lletres nom
		ArrayList<Character> name = new ArrayList<Character>();  
		
		name.add('X'); 
		
		name.add('a'); 

		name.add('v'); 
		
		name.add('i'); 
		
		name.add('e'); 
		
		name.add('r'); 
		
		
		// ArrayList al que afegire'm lletres cognom
		ArrayList<Character> surname = new ArrayList<Character>();  
		
		surname.add('F'); 
		
		surname.add('o'); 

		surname.add('n'); 
		
		surname.add('t'); 
		
	 
		// ArrayList per unir nom i cognom
	    ArrayList<Character> fullname = new ArrayList<Character>(name); 
	    
	    fullname.add(' ');
	    
	    fullname.addAll(surname);
	    
        //Mostrem arraylist fullname
	    System.out.println("Fullname: "+fullname);

	}

}

/*
 * FASE 4
 * Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra.
 * Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit
 *  entre la primera i la segona. És a dir, partim de la llista name i surname i al 
 *  acabar l’execució només tindrem una que es dirà fullName.
 *  FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’]
*/


