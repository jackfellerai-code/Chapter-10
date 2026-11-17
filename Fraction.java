public class Fraction {
	
	// instance vairriables (attributes, fields) 
	// Instances of the Fraction class will have the following ints:
	// • The Numerator 
    // • The Denominator
	private int numerator, denominator;
	
	
	// constructor
	public Fraction () { // Default fraction
						 // Do not set denomenator 0
	numerator = 1;
	denominator = 1;
		
	}
	
	public Fraction (int n, int d) { //Paramitized constructor;
	numerator = n;
	if(d != 0)
	denominator = d;
	else {
	denominator = 1;
	System.out.println("Error: Denominator does not equal zero");
		
		}	
		
	// behaviour methods
	
	}
}
