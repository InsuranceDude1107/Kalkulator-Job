package Taschenrechner;

public class Bruch {
	double zahler;
	double nenner;

	public Bruch(double zahler, double nenner) {
		this.zahler = zahler;
		this.nenner = nenner;
		kurzen();
	}

	// Bruch kürzen
	private void kurzen() {
		// ggt= großter gemeinsamer teiler
		double ggt = ggt(zahler, nenner);
		zahler /= ggt;
		nenner /= ggt;

	}

//ggt berechnen 
	private static double ggt(double zahler2, double nenner2) {
		if (nenner2 == 0)
			return Math.abs(zahler2);
		return ggt(nenner2, zahler2 % nenner2);
	}

//Erweitern auf Nenner
	public void erweiterAuf(double gemeinsamerNenner) {
		double faktor = gemeinsamerNenner / this.nenner;
		this.zahler *= faktor;
		this.nenner = gemeinsamerNenner;
	}
	
	@Override
	public String toString() {
		return zahler + " / " + nenner; 
	}

//kvg= kleinstes gemeinsames Vielfaches
	private static double kgv(double a, double b) {
		return Math.abs(a * b) / ggt(a, b);
	}

//Brücher auf gleichen Nenner bringen
	public static void aufGleichenNenner(Bruch b1, Bruch b2) {
		double gemeinsamerNenner = kgv(b1.nenner, b2.nenner);
		b1.erweiterAuf(gemeinsamerNenner);
		b2.erweiterAuf(gemeinsamerNenner);
	}
	public static Bruch addieren(Bruch b1, Bruch b2) {
		aufGleichenNenner(b1, b2);
		double newZahler = b1.zahler + b2.zahler;
		double newNenner = b1.nenner;
		return new Bruch(newZahler, newNenner);
		
	}
	public static Bruch subtrahieren(Bruch b1, Bruch b2) {
		aufGleichenNenner(b1, b2);
		double newZahler = b1.zahler - b2.zahler;
		double newNenner = b1.nenner;
		return new Bruch(newZahler, newNenner);
	}
	public static Bruch multiplizieren(Bruch b1, Bruch b2) {
		double newZahler = b1.zahler*b2.zahler;
		double newNenner = b1.nenner*b2.nenner;
		return new Bruch (newZahler, newNenner);
	}
	public static Bruch dividieren(Bruch b1, Bruch b2) {
		double newZahler= b1.zahler*b2.nenner;
		double newNenner=b1.nenner*b2.zahler;
		return new Bruch (newZahler, newNenner);
	}
}
