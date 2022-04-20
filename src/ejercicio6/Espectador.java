package ejercicio6;

import java.util.Random;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;

	// Constructores
	public Espectador() {
		this.nombre = generarNombres();
		this.edad = generarEdad();
		this.dinero = generarDinero();
		
	}
	// Métodos
	public double randomizar(int min, int max) {
		double randomizador = Math.floor(Math.random()*(max-min+1)+min); //
		return randomizador;
	}
	
	public int generarEdad() {
		return (int)randomizar(10, 80);
	}
	
	public double generarDinero() {
		return randomizar(100, 0);
	}
	
	public String generarNombres() {
		String[] arrayNombres = {"Juan", "Marta", "Jaume", "María"};
		
		return arrayNombres[(int)randomizar(0, 3)];
			
	}
	// Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	
	
	
	
}
