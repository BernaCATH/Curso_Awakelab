package evaluacion.intermedia2;

public class Television extends Electrodomesticos {

	private final static int RESOLUCION = 20;
	private int resolucion;
	private boolean sintonizadorTDT;

	public double precioFinal() {
		double plus = super.precioFinal();
		if (resolucion > 40)
			plus += precioBase * 0.3;
		if (sintonizadorTDT)
			plus += 50000;
		return plus;
	}
	public Television() {
		this(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR, RESOLUCION,false);
	}
	public Television(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_ENERGETICO, COLOR, RESOLUCION, false);
	}
	public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,
			boolean sintonizadorTDT) {
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
}