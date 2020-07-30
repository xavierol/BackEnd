
public class ExerciciVariablesFase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable per desar data naixement
		final short any=1973;
		
		final short anyTraspas=1948;
		//Variable per desar cada quan és any traspàs
		final byte traspas=4;
	
		//Crida al métode que farà el càlcul
		calculaTraspas(anyTraspas, traspas, any);
	}
	
	//Métode que calcula quants anys de traspàs hi ha fins data naixement
	public static void calculaTraspas (short num1, byte num2, short num3) {
		//Variable per desar resultat	
		int resultat=(num3-num1)/num2;	
		//Mostrem resultat calculat en la variable anterior
		System.out.println(resultat);	
	}

}

/* FASE 2
 * Sabent que l’any 1948 es un any de traspàs:
 * Creeu una constant amb el valor de l’any (1948).
 * Creeu una variable que guardi cada quan hi ha un any de traspàs.
 * Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement
 * i emmagatzemeu el valor resultant en una variable.
 * Mostreu per pantalla el resultat del càlcul.
 */
