import java.util.Scanner;

public class Ex3NomsCiutatsFase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introdueix la 1era ciutat ");
		
		String ciutat1=entrada.nextLine();
		
		System.out.println("Introdueix la 2ona ciutat ");
		
		String ciutat2=entrada.nextLine();
		System.out.println("Introdueix la   ciutat ");
		
		String ciutat3=entrada.nextLine();
		
		System.out.println("Introdueix la 4rta ciutat ");
		
		String ciutat4=entrada.nextLine();
		
		System.out.println("Introdueix la 5ena ciutat ");
		
		String ciutat5=entrada.nextLine();
		
		System.out.println("Introdueix la 6ena ciutat ");
		
		String ciutat6=entrada.nextLine();
		
		entrada.close();

		// Array per carregar amb les ciutats
		String arrayCiutats[] = new String[6];
	
		// Bucle per carregar array ciutats
		for (int i=0;i<arrayCiutats.length;i++) {
			
			arrayCiutats[i]=ciutat1;
			
			// Poc ortodoxe, però canvia el valor variable1 amb valor de la següent variable
			ciutat1=ciutat2;
			ciutat2=ciutat3;
			ciutat3=ciutat4;
			ciutat4=ciutat5;
			ciutat5=ciutat6;
		}
		
	
		// Bucle per ordenar paraules
		
		for (int i=0;i<=(arrayCiutats.length-1);i++) {
			
			for (int j=i+1;j<arrayCiutats.length;j++) {
				
				if(arrayCiutats[i].compareToIgnoreCase(arrayCiutats[j])>0) {
					
					//Intercanvi valors
					String vaux=arrayCiutats[i];
					arrayCiutats[i]=arrayCiutats[j];
					arrayCiutats[j]=vaux;
				
				}					
			}
			
		System.out.println(arrayCiutats[i]);
			
		}	

	}

}

/* FASE 2 
 * Un cop tenim els noms de les ciutats guardats en variables haurem de pasar l’informacio a un array (arrayCiutats).
 * Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats ordenadas per ordre alfabetic.
 */


