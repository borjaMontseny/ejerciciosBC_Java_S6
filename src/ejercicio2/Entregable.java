package ejercicio2;

public interface Entregable {
	// Métodos

	// Cambia el atributo entregado a true
	public void entregar();

	// Cambia el atributo entreago a false
	public void devolver();

	// Devuelve el estado del atributo entregado
	public boolean isEntregado();

	// Compara las horas estimadas en los videojuegos y en las series el numero de
	// temporadas
	public int compareTo(Object a);

}
