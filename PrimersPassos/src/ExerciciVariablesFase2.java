
public class ExerciciVariablesFase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable per desar data naixement
		final short any=1973;
		
		final short anyTraspas=1948;
		//Variable per desar cada quan �s any trasp�s
		final byte traspas=4;
	
		//Crida al m�tode que far� el c�lcul
		calculaTraspas(anyTraspas, traspas, any);
	}
	
	//M�tode que calcula quants anys de trasp�s hi ha fins data naixement
	public static void calculaTraspas (short num1, byte num2, short num3) {
		//Variable per desar resultat	
		int resultat=(num3-num1)/num2;	
		//Mostrem resultat calculat en la variable anterior
		System.out.println(resultat);	
	}

}

/* FASE 2
 * Sabent que l�any 1948 es un any de trasp�s:
 * Creeu una constant amb el valor de l�any (1948).
 * Creeu una variable que guardi cada quan hi ha un any de trasp�s.
 * Calculeu quants anys de trasp�s hi ha entre 1948 i el vostre any de naixement
 * i emmagatzemeu el valor resultant en una variable.
 * Mostreu per pantalla el resultat del c�lcul.
 */
