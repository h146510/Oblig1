package no.hvl.dat100;

public class Oppgave3 {

	public static void main(String[] args) {
		String Tall = javax.swing.JOptionPane.showInputDialog("Tall? ");
		int n = Integer.parseInt(Tall);
		
		int sum = 1;

		for (; n >=1; n--) {
			sum = sum * n;	
		} 
		
	System.out.println(sum);
}
}