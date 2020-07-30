import java.util.Scanner;

public class Ex3NomsCiutatsFase4 {

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
		
		//Creació array per cada ciutat i omplim lletra per lletra
		
		char [] arrayPrimer = ciutat1.toCharArray();  
		char [] arraySegon = ciutat2.toCharArray();  
		char [] arrayTercer = ciutat3.toCharArray();  
		char [] arrayQuart = ciutat4.toCharArray();  
		char [] arrayCinque = ciutat5.toCharArray();  
		char [] arraySise = ciutat6.toCharArray();  
		
		entrada.close();
		
		// Variable per ficar el valor que canvia de posició a cada bucle dins l'array
		char aux;
			
		// Invertim els valors dels arrays amb els següents bucles
		// Bucle per moure valors dins Array de les primeres a les últimes posicions correlativament
		for (int i=0;i<arrayPrimer.length/2;i++) {
			
			// Desem valor de la posició de l'array a la variable aux
			aux=arrayPrimer[i];
			/*
			 * Desem a la posició de l'array que indica el bucle la variable que hi ha a la
			 * posició restant posició i 1
			 */
			arrayPrimer[i]=arrayPrimer[arrayPrimer.length-i-1];
			
			// Desem valor desat a variable aux a la posició de l'array que indica el bucle
			arrayPrimer[arrayPrimer.length-i-1]=aux;
		}
		
		//Repetim bucle anterior per tots els arrays per invertir array
		for (int i=0;i<arraySegon.length/2;i++) {
			
			aux=arraySegon[i];

			arraySegon[i]=arraySegon[arraySegon.length-i-1];

			arraySegon[arraySegon.length-i-1]=aux;
		}
		
		for (int i=0;i<arrayTercer.length/2;i++) {
			
			aux=arrayTercer[i];

			arrayTercer[i]=arrayTercer[arrayTercer.length-i-1];

			arrayTercer[arrayTercer.length-i-1]=aux;
		}
		
		for (int i=0;i<arrayQuart.length/2;i++) {
			
			aux=arrayQuart[i];

			arrayQuart[i]=arrayQuart[arrayQuart.length-i-1];

			arrayQuart[arrayQuart.length-i-1]=aux;
		}
		
		for (int i=0;i<arrayCinque.length/2;i++) {
			
			aux=arrayCinque[i];

			arrayCinque[i]=arrayCinque[arrayCinque.length-i-1];

			arrayCinque[arrayCinque.length-i-1]=aux;
		}
		
		for (int i=0;i<arraySise.length/2;i++) {
			
			aux=arraySise[i];

			arraySise[i]=arraySise[arraySise.length-i-1];

			arraySise[arraySise.length-i-1]=aux;
		}
		
		
		System.out.println(arrayPrimer);
		
		System.out.println(arraySegon);
		
		System.out.println(arrayTercer);
		
		System.out.println(arrayQuart);
		
		System.out.println(arrayCinque);
		
		System.out.println(arraySise);

	}

}

/* FASE 4
 * Creeu un nou array per cada una de les ciutats que tenim. 
 * La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).
 * Ompliu els nous arrays lletra per lletra.
 * Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB)
 */


