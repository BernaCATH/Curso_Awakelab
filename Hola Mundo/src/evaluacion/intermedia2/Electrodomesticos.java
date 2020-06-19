package evaluacion.intermedia2;

public class Electrodomesticos {

	public final static double PRECIO_BASE = 100000;
	public static String COLOR = "blanco";
	public static char CONSUMO_ENERGETICO = 'F';
	public static double PESO = 5;

	public double precioBase = PRECIO_BASE;
	private String color = COLOR;
	private char consumoEnergetico = CONSUMO_ENERGETICO;
	private double peso = PESO;

	public Electrodomesticos() {
		this(PRECIO_BASE, COLOR, CONSUMO_ENERGETICO, PESO);
	}

	public Electrodomesticos(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) { // Con todos
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	public double getprecioBase() {
		return precioBase;
	}

	public String getcolor() {
		return color;
	}

	public char getconsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getpeso() {
		return peso;
	}

	public void comprobarConsumoEnergetico(char consumoEnergetico) {

		if (consumoEnergetico >= 65 && consumoEnergetico <= 70)
			this.consumoEnergetico = consumoEnergetico;

		else
			this.consumoEnergetico = CONSUMO_ENERGETICO;
	}

	public void comprobarColor(String color) {

		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };

		boolean encontrado = false;

		for (int i = 0; i < colores.length && !encontrado; i++) {

			if (colores[i].equals(color))
				encontrado = true;
		}

		if (encontrado)

			this.color = color;
		else {

			this.color = COLOR;
		}
	}

	public double precioFinal() {
		double plus = 0;
		switch (consumoEnergetico) {
		case 'A':
			plus += 100000;
			break;
		case 'B':
			plus += 80000;
			break;
		case 'C':
			plus += 60000;
			break;
		case 'D':
			plus += 50000;
			break;
		case 'E':
			plus += 30000;
			break;
		case 'F':
			plus += 10000;
			break;
		}
		if (peso >= 0 && peso < 19) {
			plus += 10000;
		} else if (peso >= 20 && peso < 49) {
			plus += 50000;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80000;
		} else if (peso >= 80) {
			plus += 100000;
		}
		return precioBase + plus;
	}
}
