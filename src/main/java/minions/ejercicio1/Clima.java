package minions.ejercicio1;

public class Clima {
	
	private boolean precipitacionAgua;
	private boolean precipitacionNieve;
	private double humedad;
	private double temperatura;
	private boolean nublado;
	
	
	
	


	public Clima(boolean precipitacionAgua, boolean precipitacionNieve, double humedad, double temperatura,
			boolean nublado) {
		super();
		this.precipitacionAgua = precipitacionAgua;
		this.precipitacionNieve = precipitacionNieve;
		this.humedad = humedad;
		this.temperatura = temperatura;
		this.nublado = nublado;
		
	}

	
	public boolean isPrecipitacionAgua() {
		return precipitacionAgua;
	}


	public boolean isPrecipitacionNieve() {
		return precipitacionNieve;
	}


	public double getHumedad() {
		return humedad;
	}


	public double getTemperatura() {
		return temperatura;
	}


	public boolean isNublado() {
		return nublado;
	}
	
	
}
