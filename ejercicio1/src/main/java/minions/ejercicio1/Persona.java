package minions.ejercicio1;

public class Persona {
	
	private boolean sana;
	private boolean sintomas;
	private boolean contactoCOVID;
	private boolean pasoCOVID;
	private boolean cartillaVacunacion;
	
	
	
	

	public Persona(boolean sana, boolean sintomas, boolean contactoCOVID, boolean pasoCOVID,
			boolean cartillaVacunacion) {
		super();
		this.sana = sana;
		this.sintomas = sintomas;
		this.contactoCOVID = contactoCOVID;
		this.pasoCOVID = pasoCOVID;
		this.cartillaVacunacion = cartillaVacunacion;
	}

	public boolean isSana() {
		return sana;
	}


	public boolean isSintomas() {
		return sintomas;
	}


	public boolean isContactoCOVID() {
		return contactoCOVID;
	}


	public boolean isPasoCOVID() {
		return pasoCOVID;
	}


	public boolean isCartillaVacunacion() {
		return cartillaVacunacion;
	}


	
	
	
	
	

}
