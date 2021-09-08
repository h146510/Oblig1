package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {

	public static void main(String[] args) {
	String grossSalary = showInputDialog("What is your gross salary: ?");
	int salary = Integer.parseInt(grossSalary);

	double level0 = 0;
	double level1 = 0.017;
	double level2 = 0.040;
	double level3 = 0.132;
	double level4 = 0.162;
	
	if (salary >=0 && salary <= 184800) {
		showMessageDialog(null, "Your extra tax payment is " + salary * level0);
	} else if (salary >= 184800 && salary <= 260100) {
		showMessageDialog(null, "Your extra tax payment is " + salary * level1);
	} else if (salary >= 260100 && salary <=651250) {
		showMessageDialog(null, "Your extra tax payment is " + salary * level2);
	} else if (salary >= 651250 && salary <= 1021550) {
		showMessageDialog(null, "Your extra tax payment is " + salary * level3);
	} else if (salary >= 1021550) {
		showMessageDialog(null, "Your extra tax payment is " + salary * level4);
	}
	}

}
