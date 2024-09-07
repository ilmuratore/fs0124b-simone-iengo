package u4.d2.es1;

public class Rettangolo {
	double altezza;
	double larghezza;

	public Rettangolo(double alt, double larg) {
		this.altezza = alt;
		this.larghezza = larg;
	}

	public double area() {
		return altezza * larghezza;
	}

	public double perimetro() {
		return (altezza + larghezza) * 2;
	}

}
