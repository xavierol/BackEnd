import java.util.Scanner;

public class Ex3NomsCiutatsFase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

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
		
		System.out.println("La 1era ciutat �s " + ciutat1);
		System.out.println("La 2ona ciutat �s " + ciutat2);
		System.out.println("La 3era ciutat �s " + ciutat3);
		System.out.println("La 4rta ciutat �s " + ciutat4);
		System.out.println("La 5ena ciutat �s " + ciutat5);
		System.out.println("La 6ena ciutat �s " + ciutat6);
			
		}	

}

/* FASE 1 
 * Crea sis variables tipu string buides.
 * Demana per consola que s�introdueixin els noms.
 * Introdueix els seg�ents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per teclat.
 * Mostra per consola el nom de les 6 ciutats
 */
