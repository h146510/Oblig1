package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave2 {

	public static void main(String[] args) {
		String karTxt = showInputDialog("Poengsum? :");
		int points = Integer.parseInt(karTxt);
		
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
			karakter = "D - Noks� god";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >=40 && points <=49) {
			karakter = "E - Tilstrekkelig";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >=0 && points <=39) {
			karakter = "F - Ugyldig karakter";
			showMessageDialog(null, "Din karakter er: " + karakter);
		} else if (points >=0 || points <=100) {
			karakter = "Ugyldig karakter";
			showMessageDialog(null, "Din karakter er: " + karakter);
			
			
		}
		

		
	}
	
}