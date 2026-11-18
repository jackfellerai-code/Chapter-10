public class Fraction {
    // instance vairriables (attributes, fields)
    // Instances of the Fraction class will have the following ints:
    // • The Numerator
    // • The Denominator
    private int numerator, denominator;

    // constructor
    public Fraction() { // Default fraction
                        // Do not set denomenator 0
        numerator = 1;
        denominator = 1;
    }
    public Fraction(int n, int d) { // Paramitized constructor;
        numerator = n;
        setDemom(d);
    }

    public Fracton(String f) {
        int slashIndex = f.indexOf("/");
        String n = f.substring(0, slashIndex);
        String b = f.substring(slashIndex + 1);
        numerator = Integer.parseINt(n);
        denominator(Integer.parseINt(d));
    }

    // behaviour methods
    public int getNum() {
        return numerator;
    }
    public int getDenom() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" denominator;
    }

    public void setDenom(int n) {}

    public Fraction(int n, int d) { // Paramitized constructor;
        numerator = n;
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: Denominator does not equal zero");
        }
    }
}
