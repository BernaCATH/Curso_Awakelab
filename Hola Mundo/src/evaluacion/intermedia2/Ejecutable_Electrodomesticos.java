package evaluacion.intermedia2;

public class Ejecutable_Electrodomesticos {

	public static void main(String[] args) {

		Electrodomesticos listaElectros[] = new Electrodomesticos[10];

		listaElectros[0] = new Lavadora(150000, 30);
		listaElectros[1] = new Electrodomesticos(123000, 3);
		listaElectros[2] = new Television(250000, 70, 'A', "gris", 42, false);
		listaElectros[3] = new Electrodomesticos(25000, 5);
		listaElectros[4] = new Electrodomesticos(30000,2);
		listaElectros[5] = new Lavadora(370000, 40, 'Z', "blanco", 40);
		listaElectros[6] = new Television(250000, 70);
		listaElectros[7] = new Lavadora(430000, 100, 'A', "verde", 15);
		listaElectros[8] = new Television(250000, 60, 'C', "naranja", 30, true);
		listaElectros[9] = new Lavadora(370000, 20, 'B', "rojo", 30);

		double sumaElectros = 0;
		double sumaTelevisiones = 0;
		double sumaLavadoras = 0;
		double totalElectros = 0;

		for (int i = 0; i < listaElectros.length; i++) {
			if (listaElectros[i] instanceof Electrodomesticos) {
				sumaElectros += listaElectros[i].precioFinal();
			}
			if (listaElectros[i] instanceof Lavadora) {
				sumaLavadoras += listaElectros[i].precioFinal();
			}
			if (listaElectros[i] instanceof Television) {
				sumaTelevisiones += listaElectros[i].precioFinal();
			}
		}
		totalElectros = (sumaElectros + sumaLavadoras + sumaTelevisiones);

		System.out.println("El monto total de la clase electrodomesticos es  $" + totalElectros);
		System.out.println("El monto total de la clase lavadoras es $" + sumaLavadoras);
		System.out.println("El monto total de la clase Televisiones es $" + sumaTelevisiones);
	}

}
