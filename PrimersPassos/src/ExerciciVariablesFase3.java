
public class ExerciciVariablesFase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final short any=1973;
		//Creem variable no constant per poder canviar el seu valor
		int anyOrigen=1948;
		//Establim variable boolean any de trasp�s a false
		boolean traspasAny=false;
		
		//Variables per mostrar resultat depenent valor variable boolean anterior
		String siTraspas="L'any de Naixement �s de trasp�s";
		
		String noTraspas="L'any de Naixement no �s de trasp�s";
		
		//Mostrem els anys de trasp�s del per�ode fins data naixement (variable any)
		for(int anyTras=1948;anyTras<=any;anyTras++) {
			
			/*Condici� per mostrar per pantalla l'any que �s de trasp�s
			 * Anem incrementant 4 anys per complir condici� que �s de trasp�s
			 */
			if(anyTras==anyOrigen) {
				anyOrigen=anyOrigen+4;
				System.out.println(anyTras);
			}
			
			/*Condici� per establir variable boolean per saber
			 * si la data de naixement �s de trasp�s o no
			 */
			if(anyOrigen==any) {
				traspasAny=true;
			}
		}
			
		//Condici� per mostrar si l'any de naixement �s de trasp�s o no
		if(traspasAny) {
			System.out.println(siTraspas);
		} else {
			System.out.println(noTraspas);
		}

	}

}

/* FASE 3
 * Partint de l�any 1948 heu de fer un bucle for i mostrar els anys de trasp�s fins arriba al vostre any de naixement.
 * ATENCIO! Haureu de canviar el tipus de variable de l�any 1948 per poder modificar-la. 
 * Creeu una variable bool que sera certa si l�any de naixement �s de trasp�s o falsa si no ho �s.
 * En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, en cas de
 * ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases.
 */
