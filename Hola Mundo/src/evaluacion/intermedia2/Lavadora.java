package evaluacion.intermedia2;

public class Lavadora extends Electrodomesticos {

	private final static int CARGA = 5;
	private int carga;

	public int getCarga() {
		return carga;
	}
	public double precioFinal() {
		double plus = super.precioFinal();
		if (carga > 30)
			;
		plus += 50000;
		return plus;
	}
	public Lavadora() {
		this (PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR, CARGA);
	}
	public Lavadora(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO, COLOR, CARGA);
	}
	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
		this.carga = carga;
	}
}
