import javax.swing.JOptionPane;

public class ExerciciVariablesFase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nom="Xavier";
		
		String cognom1="Font";
		
		String cognom2="Salas";
		
		//Demanem nom i cognoms i els fiquem en noves variables
		String name=JOptionPane.showInputDialog("Introdueix el teu nom");
		
		String surname=JOptionPane.showInputDialog("Introdueix el teu primer cognom");
		
		String surname2=JOptionPane.showInputDialog("Introdueix el teu segon cognom");
		
		//Variables per la data de naixement
		final byte DIA=12;
		
		final byte MES=11;
		
		final int ANY=1973;

		//Demanem data de naixement i la fiquem en noves variables
		String day=JOptionPane.showInputDialog("Introdueix el dia que vas nèixer");
		
		final byte DAY=Byte.parseByte(day);
		
		String month=JOptionPane.showInputDialog("Introdueix el mes que vas nèixer");
		
		final byte MONTH=Byte.parseByte(month);
		
		String year=JOptionPane.showInputDialog("Introdueix l'any que vas nèixer");
		
		final int YEAR=Integer.parseInt(year);
			
		
		//Creem variable no constant per poder canviar el seu valor
		int anyOrigen=1948;
		//Establim variable boolean any de traspàs a false
		boolean traspasAny=false;
		
		//Establim variable boolean any de traspàs a false
		boolean leapYear=false;
		
		// Variable per desar nom complet
		String completName=nom+' '+cognom1+' '+cognom2;
		
		// Variable per desar data naixement
		String dataNaix=DIA+"/"+MES+"/"+ANY;
		
		System.out.println("El meu nom és "+completName);
		
		System.out.println("Vaig néixer el "+dataNaix);
		
		
		//Mostrem els anys de traspàs del període fins data naixement (variable any)
		for(int anyTras=1948;anyTras<=ANY;anyTras++) {
			
			// Anem incrementant 4 anys per complir condició que és de traspàs
			if(anyTras==anyOrigen) {
				anyOrigen=anyOrigen+4;
			}
			
			/*Condició per establir variable boolean per saber
			 * si la data de naixement és de traspàs o no
			 */
			if(anyOrigen==ANY) {
				traspasAny=true;
			}
			
		}

		//Mostra resultat càlcul data naixement si és de traspàs o no
		if(traspasAny) {
			System.out.println("El meu any de naixement és de traspàs");
		} else {
			System.out.println("El meu any de naixement no és de traspàs");
		}
		
		
		//Mostrem els anys de traspàs del període fins data naixement (variable any)
		for(int anyTras=1948;anyTras<=YEAR;anyTras++) {
			
			// Anem incrementant 4 anys per complir condició que és de traspàs
			if(anyTras==anyOrigen) {
				anyOrigen=anyOrigen+4;
			}
			
			/*Condició per establir variable boolean per saber
			 * si la data de naixement és de traspàs o no
			 */
			if(anyOrigen==YEAR) {
				leapYear=true;
			}
			
		}
		
		// Mostra cognoms i nom
		JOptionPane.showMessageDialog(null, "El teu nom complet és "+(surname+' '+surname2+','+' '+name));
			
		// Mostra data de naixement
		JOptionPane.showMessageDialog(null, "La teva data de naixement és "+(DAY+"/"+MONTH+"/"+YEAR));
			
		if(leapYear) {
			JOptionPane.showMessageDialog(null, "El meu any de naixement és de traspàs");
		} else {
			JOptionPane.showMessageDialog(null, "El meu any de naixement no és de traspàs");
		}	

	}

}

/* FASE 4
 * Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la
 * data de naixement separada per “/” (tot en una variable). Mostreu per consola les variables del nom
 * complet, la data de naixement i si l’any de naixement es de traspàs o no.
 * 
 * Exemple de sortida per consola:
 * El meu nom és Juan Perez Gonzalez
 * Vaig néixer el 01/01/1979
 * El meu any de naixement és de traspàs.
 */
