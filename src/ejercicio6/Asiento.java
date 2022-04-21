package ejercicio6;

public class Asiento {
	// Atributos
	private Espectador espectador;
	private int fila;
	private int columna;
	private String posicion;

	// Constructores
	public Asiento() {
		this.espectador = espectador;
		this.fila = fila;
		this.columna = columna;
		this.posicion = posicion;
	}

	// Getters and Setters
	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
