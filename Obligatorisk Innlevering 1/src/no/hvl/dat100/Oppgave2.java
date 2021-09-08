package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			String karTxt;
			boolean acceptedInput = false;
			int points = 1;
			
			while (!acceptedInput) {
				karTxt = showInputDialog("Poengsum? : (elev" + (i+1) + ")");
				points = Integer.parseInt(karTxt);
				
				if (points >=0 && points <=100) {
					acceptedInput = true;
				} else { 
					showMessageDialog(null, "Ugyldig input, prøv igjen! (Poengsum må være mellom 0-100)");
				}
			}
			
		String karakter;
	
		if  (points >=90 && points <= 100) {
			karakter = "A - Fremragende";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >=80 && points <=89) {
			karakter = "B - Meget god";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >=60 && points <=79) {
			karakter = "C - God";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >=50 && points <= 59) {
			karakter = "D - Nokså god";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >=40 && points <=49) {
			karakter = "E - Tilstrekkelig";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >=0 && points <=39) {
			karakter = "F - Ugyldig karakter";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >0 || points <100) {
			karakter = "Ugyldig karakter";
			showMessageDialog(null, "Din karakter er: " + karakter);
		}
		
	}
	}
}