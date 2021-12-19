package minions.ejercicio1;

public class ejercicio1 {

	public static void main(String[]args) {
		Persona p= new Persona(true, false, false, true, true);
		Clima c= new Clima(false, false, 0.14, -1, false);
		Espacio e = new Espacio(10, 20, false);
		metodoPrincipal(p,c,e);
		
		
	}
	
	public static boolean metodoPrincipal(Persona p, Clima c, Espacio e) {
		boolean fin=false;
		if(!realizarActividad(p)) {
			System.out.println("Fin del programa");
			
		}else {
			if(quedarseEnCasa(p,c)) 
				System.out.println("Puede quedarse en casa");
			if(esquiar(p,c,e))
				System.out.println("Puede esquiar");
			if (senderismo(p,c,e)) 
				System.out.println("Puede hacer senderismo");
			if(turismo(p,c,e))
				System.out.println("Puede hacer turismo");
			if(canias(p,c,e))
				System.out.println("Puede irse de cañas");
			if(bañarse(p,c,e)) {
				System.out.println("Puede bañarse");
				if(!superaAforo(e.getCapacidadActual(),e.getCapacidadMaxima())) {
					System.out.println("Puede irse a la piscina");
				}else {
					System.out.println("Puede irse a la playa");
				}
			}
			fin=true;
		}
		return fin;
	}
	public static boolean superaAforo (int aforo, int aforoMax) {
		boolean supera;
		if(aforo<=aforoMax)
			supera=false;
		else
			supera=true;
		
		return supera;
		
	}
	public static boolean realizarActividad(Persona p) {
		boolean posible;
		if(p.isSana() && !p.isSintomas() && !p.isContactoCOVID() && p.isPasoCOVID() && p.isCartillaVacunacion()) {
			posible=true;
		} else {
			posible=false;
		}
		return posible;
	}
	
	public static boolean quedarseEnCasa(Persona p, Clima c) {
		boolean posible;
		if (c.getTemperatura()<0 && c.getHumedad() < 0.15 &&(c.isPrecipitacionAgua()||c.isPrecipitacionNieve())) {
			posible=true;
		}else {
			posible=false;
		}
		return posible;
	}
	
	public static boolean esquiar(Persona p, Clima c, Espacio e) {
		boolean posible;
		if(c.getTemperatura()<0 && c.getHumedad() < 0.15 && (!c.isPrecipitacionAgua() && !c.isPrecipitacionNieve()) && !superaAforo(e.getCapacidadActual(),e.getCapacidadMaxima())) {
			posible=true;
		}else {
			posible=false;
		}
		return posible;
	}
	
	public static boolean senderismo(Persona p, Clima c, Espacio e) {
		boolean posible;
		if(c.getTemperatura()>0 && c.getTemperatura()<15 && !c.isPrecipitacionAgua() && !superaAforo(e.getCapacidadActual(),e.getCapacidadMaxima())) {
			posible=true;
		}else {
			posible=false;
		}
		return posible;
	}
	
	public static boolean turismo(Persona p, Clima c, Espacio e) {
		boolean posible;
		if(c.getTemperatura()>15 && c.getTemperatura()<25 && !c.isPrecipitacionAgua() && !c.isNublado() && c.getHumedad()<0.6 && !e.isConfinamiento()) {
			posible=true;
		}else {
			posible=false;
		}
		return posible;
	}
	
	public static boolean canias(Persona p, Clima c, Espacio e) {
		boolean posible;
		if(c.getTemperatura()>25 && c.getTemperatura()<35 && !c.isPrecipitacionAgua() && !superaAforo(e.getCapacidadActual(),e.getCapacidadMaxima())) {
			posible=true;
		} else {
			posible=false;
		}
		return posible;
	}
	
	public static boolean bañarse(Persona p, Clima c, Espacio e) {
		boolean posible;
		if(c.getTemperatura()>30 && !c.isPrecipitacionAgua()) {
			posible=true;
		} else {
			posible=false;
		}
		return posible;
	}
	
	
}
