import java.util.Scanner;

public class Ex3NomsCiutatsFase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Classe Scanner per entrar dades des de consola
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introdueix la 1era ciutat ");
		
		String ciutat1=entrada.nextLine();
		
		System.out.println("Introdueix la 2ona ciutat ");
		
		String ciutat2=entrada.nextLine();
		
		System.out.println("Introdueix la 3era ciutat ");
		
		String ciutat3=entrada.nextLine();
		
		System.out.println("Introdueix la 4rta ciutat ");
		
		String ciutat4=entrada.nextLine();
		
		System.out.println("Introdueix la 5ena ciutat ");
		
		String ciutat5=entrada.nextLine();
		
		System.out.println("Introdueix la 6ena ciutat ");
		
		String ciutat6=entrada.nextLine();	
		
		entrada.close();
		
		// Array per carregar amb noms ciutats
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
		
		for (int i=0; i<arrayCiutats.length; i++) {
			
			System.out.println(arrayCiutats[i]);
			
		}
		
			
		// Array on copiarem arrayCiutats amb les ciutats modificades
		String arrayCiutatsModificades[] = new String[6];
		
		// Bucle per copiar valors array en nou array i reemplaçar caracter
		for (int i=0;i<arrayCiutats.length;i++) {
			
			//replacem lletra A/a pel 4 i carreguem Array modificat
			arrayCiutatsModificades[i]=arrayCiutats[i].replace('a','4').replace('A','4');
					
		}
		
		
		// Bucle per ordenar paraules alfabèticament
		for (int i=0;i<=(arrayCiutatsModificades.length-1);i++) {
			
			for (int j=i+1;j<arrayCiutatsModificades.length;j++) {
				
				if(arrayCiutatsModificades[i].compareToIgnoreCase(arrayCiutatsModificades[j])>0) {
					
					//Intercanvi valors
					String vaux=arrayCiutatsModificades[i];
					arrayCiutatsModificades[i]=arrayCiutatsModificades[j];
					arrayCiutatsModificades[j]=vaux;
				
				}					
			}
			
		System.out.println(arrayCiutatsModificades[i]);
		
		}

	}

}

/* FASE 3 
 * Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i 
 * guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
 * Mostreu per consola l’array modificat i ordenat per ordre alfabetic.
 */
