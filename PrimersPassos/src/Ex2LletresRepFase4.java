
public class Ex2LletresRepFase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Matrius pel cognom, nom i nom complet
		char [] surname=new char[]{'F','o','n','t'};
		
		char [] name=new char[]{'X','a','v','i','e','r'};
		
		char [] fullname=new char[11];
		
		//Mostra posicions matriu
		System.out.println("Length of Array  =  "+fullname.length);
		
		//Fiquem 6 caracters del nom a la matriu fullname i mostra contingut
		for (int i=0,j=0; i<6; i++,j++) {
			
			fullname[i]=name[j];
			System.out.print(fullname[i]);
			
		}
		
		//Fiquem espai entre el nom i el cognom  i mostra contingut
		fullname[6]=' ';
		System.out.print(fullname[6]);
		
		//Fiquem el cognom després de l'espai a la matriu fullname i mostra contingut
		for (int i=7,j=0; i<fullname.length; i++,j++) {
			
			fullname[i]=surname[j];
			System.out.print(fullname[i]);
			
		}
		
		
		System.out.println();
		System.out.print("My name is ");
		
		//Mostrem unió matriu name i surname
		System.out.println(fullname);
		
		for(char element:fullname) {
			System.out.print(element);
		}

	}

}
