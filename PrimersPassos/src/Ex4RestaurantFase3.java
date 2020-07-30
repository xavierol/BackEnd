import java.util.ArrayList;
import java.util.Scanner;

public class Ex4RestaurantFase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Classe Scanner per guardar a la variable entrada els plats del menu 
		Scanner entrada=new Scanner(System.in);
		// Classe Scanner per guardar a la variable entrada els preus dels plats del menu 
		Scanner entrada2=new Scanner(System.in);
		//Classe Scanner per guardar a la variable entrada2 valor 1 o 0
		Scanner entrada3=new Scanner(System.in);
			
		//Variables
		double preuTotal=0;
		int menjar=1;
		//Variable que conta núm voltes al bucle per trobar un plat que no tenim al menú
		int count2=0;
		
		String arrayMenu[] = new String[5];
		
		double arraypreuPlat[] = new double[5];
		
		// ArrayList al que afegire'm plats del menu
		ArrayList<String> menu = new ArrayList<String>();  
		
		
		//Carreguem arrayMenu amb els 5 plats que conté el menu	
		for (int i=0;i<arrayMenu.length;i++) {
			
			System.out.println("Introdueix el plat núm "+(i+1));
			
			arrayMenu[i]=entrada.nextLine();
			
		}
		
		// Carreguem arraypreuPlat amb el preu de cada plat del menú	
		for (int i=0;i<arraypreuPlat.length;i++) {
			
			System.out.println("Introdueix preu del plat núm "+(i+1));
			
			arraypreuPlat[i]=entrada2.nextDouble();
			
		}
				
		/*
		 * MOSTRA MENU + PREUS, I PREN NOTA COMANDA MENTRE EL PLAT SIGUI AL MENU
		 */
				
		//BUCLE PER FER COMANDA DELS PLATS. SI EL PLAT NO EXISTEIX TORNA A DEMANAR
		do {
			
			//Inicialitzem variables i Arraylist menu
			preuTotal=0;
			menu.clear();
			count2=0;	
			
			// Mostrem que hi ha per menjar
			
			System.out.println("SI NO TENIM ALGUN PLAT AL MENU, HAS DE TORNAR A DEMANAR DE NOU");
			
			System.out.println("AQUEST ÉS EL MENÚ D'AVUI: ");
			
			for (int i=0,j=0; i<arrayMenu.length; i++,j++) {
				
				System.out.println(arrayMenu[i]+" --- "+arraypreuPlat[j]+' '+'€');		
			}	
			
			//BUCLE PER DEMANAR PLATS MENTRE DIGUEM QUE VOLEM PLAT PER MENJAR
			while (menjar==1) {
					
				//Demanem plat del menu i afegim a l'array menu
				System.out.println("QUIN PLAT VOLS DEMANAR? ");
				
				menu.add(entrada.nextLine());
				
				//Demanem si vol algun plat més
					
				System.out.println("Vols demanar algun plat? (1 = Si / 0 = No )");
				
				menjar=entrada3.nextInt();
				
				if (menjar==0) {
				
					break;
					
				} else {
					
					System.out.println("Per demanar un plat has d'entrar 1, si no vols "
							+ "cap més plat has d'entrar 0: (1 = Si / 0 = No )");
					menjar=1;
				}
			
			}
				
			//BUCLE PER COMPARAR ARRAY MENU AMB ARRAY DELS PLATS QUE HEM DEMANAT
			for (int i=0; i<menu.size(); i++) {
				
				for (int j=0,count=0; j<arrayMenu.length; j++) {
					
					if (arrayMenu[j].equalsIgnoreCase((String)menu.get(i))) {
						
						System.out.println("Has demanat del menu d'avui: "+menu.get(i));
						
						preuTotal=preuTotal+arraypreuPlat[j];
						
					} else {
						//SUMANT ELS COPS QUE PASSEM PER AQUESTA CONDICIÓ SABEM SI EL PLAT DEMANAT ESTÀ AL MENÚ
						count++;
									
						if (count==arrayMenu.length) {
							
							System.out.println("Ho sentim, no tenim aquest plat al menu: "+menu.get(i));
							
							count2=0;
							count2=count2+count;
							menjar=1;							
						}					
					}
				}
				
			}
		
		} while (count2==arrayMenu.length); //SI UN PLAT DEMANAT NO ESTÀ AL MENÚ TORNEM A DEMANAR PLATS
	
		//Tanquem classe Scanner per entrada de dades
		entrada.close();		
		entrada2.close();
		entrada3.close();
		
		//MOSTRA ELS PLATS DEMANATS, EL NÚM DE PLATS I EL PREU TOTAL EN €	
		
		System.out.println("Has demanat aquests plats per menjar: "+menu);
		
		System.out.println("El productes que has demanat són "+menu.size());
		
		System.out.println("El preu del que has demanat: "+preuTotal+" €");
							
	}

}
