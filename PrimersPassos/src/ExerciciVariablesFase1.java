import javax.swing.JOptionPane;

public class ExerciciVariablesFase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FASE 1
		//Variables per emmagatzemar nom i cognoms
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
		
		
		//FASE 1
		
		// Mostra cognoms i nom
		System.out.println(cognom1+' '+cognom2+','+' '+nom);
		
		JOptionPane.showMessageDialog(null, "El teu nom complet és "+(surname+' '+surname2+','+' '+name));
		
		
		// Mostra data de naixement
		System.out.println(DIA+"/"+MES+"/"+ANY);
		
		JOptionPane.showMessageDialog(null, "La teva data de naixement és "+(DAY+"/"+MONTH+"/"+YEAR));
		

	}
	

}

/* FASE 1
 * Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
 * Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
 * Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
 * Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.
 */

