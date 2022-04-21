package ejercicio6;

public class Cine {
	// Atributos
	private String pelicula;
	private double precio;
	private Espectador[] arrayEspectador;
	private Asiento[] arrayAsiento;
	
	// Constantes
	private final double precioEntrada = 5.0;
	private final int edadMinima = 18;
	
	// Constructores
	public Cine(String pelicula, double precio, Espectador[] arrayEspectador, Asiento[] arrayAsiento) {
		super();
		this.pelicula = pelicula;
		this.precio = precioEntrada;
		this.arrayEspectador = arrayEspectador;
		this.arrayAsiento = arrayAsiento;
	}
	
	//Métodos
	public Espectador[] generarEspectador(int numero) {
		Espectador[] arrayEspectadores = new Espectador[numero];
		for (int i = 0; i < arrayEspectadores.length; i++) {
			Espectador a = new Espectador();
		}
		return arrayEspectadores;
	}

	public Asiento[] generarAsiento(int numero) {
		Asiento[] arrayAsientos = new Asiento[numero];
		for (int i = 0; i < arrayAsientos.length; i++) {
			Asiento a = new Asiento();
		}
		return arrayAsientos;
		
	}
	
	// Método para comprobar si el espectador tiene edad y dinero suficiente o igual
	public boolean comprobarEspectador(Espectador espectador) {
		// getEdad mayor o igual a edadMinima && getDinero mayor o igual que precioEntrada
		if (espectador.getEdad() >= edadMinima && espectador.getDinero() >= precioEntrada) {
			System.out.println("El espectador puede entrar");
			return true;

		} else {
			System.out.println("El espectador no puede entrar");
			return false;
		}
		
	}
	// Método para comprobar asiento
	public boolean comprobarAsiento(Asiento asiento) {
		
		
	}
	
}
