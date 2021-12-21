package minions.ejercicio1;

public class Espacio {
	private int capacidadActual;
	private int capacidadMaxima;
	private boolean confinamiento;
	
	public Espacio(int capacidadActual, int capacidadMaxima, boolean confinamiento) {
		super();
		this.capacidadActual = capacidadActual;
		this.capacidadMaxima = capacidadMaxima;
		this.confinamiento = confinamiento;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	
	public boolean isConfinamiento() {
		return confinamiento;
	}

	
	
	
	

}
