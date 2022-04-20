package ejercicio6;

public class Cine {
	// Atributos
	private String pelicula;
	private double precioEntrada;
	private Espectador[] arrayEspectador;
	private Asiento[] arrayAsiento;
	
	// Constructores
	public Cine() {
	//	this.
	}
	
	String numeros = {"1","2","3",	}
	//Métodos
	public Espectador[] generarEspectador(int numero) {
		Espectador[] arrayEspectadores = new Espectador[numero];
		for (int i = 0; i < arrayEspectadores.length; i++) {
			Espectador a = new Espectador();
		}
		return arrayEspectadores;
	}
}
