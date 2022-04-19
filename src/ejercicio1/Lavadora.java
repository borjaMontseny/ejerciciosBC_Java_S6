package ejercicio1;

public class Lavadora extends Electrodomestico {
	// Atributos, si no indicamos nada más es como si fueran los de la clase padre
	private double carga;

	// Constantes
	private final double CARGADEFECTO = 5.0;

	// Constructores
	public Lavadora() {
		super();
		this.carga = CARGADEFECTO;
	}

	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGADEFECTO;
	}

	public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;

	}

	public double getCarga() {
		return carga;
	}

	public void precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			super.setPrecio(super.getPrecio() + 50.0);
		}
	}

}
