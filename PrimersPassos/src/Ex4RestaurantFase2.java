import java.util.ArrayList;

import java.util.Scanner;

public class Ex4RestaurantFase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Classe Scanner per guardar a la variable entrada els plats del menu 
		Scanner entrada=new Scanner(System.in);
		//Classe Scanner per guardar a la variable entrada2 valor 1 o 0
		Scanner entrada2=new Scanner(System.in);
		
		//Variables
		double preuTotal=0;
		int menjar=1;
		
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
		
		// Mostrem que hi ha per menjar
		System.out.println("Aquest és el menu d'avui : ");
		
		for (int i=0,j=0; i<arrayMenu.length; i++,j++) {
			
			System.out.println(arrayMenu[i]+" --- "+arraypreuPlat[j]+'€');		
		}
		
		
		//Prenem nota de la comanda dels plats que vol menjar

		while (menjar==1) {
				
			//Demanem plat del menu i afegim a l'array menu
			System.out.println("Quin plat del menu vols demanar? ");
			
			menu.add(entrada.nextLine());
			

			//Demanem si vol algun plat més
			System.out.println("Vols demanar algun plat? (1 = Si / 0 = No )");
			
			menjar=entrada2.nextInt();
			
			if (menjar!=1 || menjar!=0) {
				
				System.out.println("Per demanar un plat has d'entrar 1, si no vols"
						+ " cap més plat has d'entrar 0: (1 = Si / 0 = No )");
			
				
			} else if (menjar==0) {
				
				break;
			}
			
		}
		
		//Tanquem classe Scanner per entrada de dades
		entrada.close();	
		entrada2.close();
		
		for (int i=0; i<menu.size(); i++) {
			
			for (int j=0; j<arrayMenu.length; j++) {
				
				if (arrayMenu[j].equals(menu.get(i))) {
					
					System.out.println(menu.get(i));
					
					preuTotal=preuTotal+arraypreuPlat[j];
					
				} 
				
			}
			
		}
		
		System.out.println("Has demanat aquests plats per menjar: "+menu);
		System.out.println("El preu del que has demanat és "+preuTotal);
							
		}

}
