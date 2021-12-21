package minions.ejercicio1;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



public class ejercicio1Test {
	
	private ejercicio1 e1;
	
	   @Before
	   public void setUp() throws Exception 
	   {
	      e1 = new ejercicio1();
	   }
	  
	  
	   @Test
		 public void testMain() 
		   {
			 String a=null;
			 ejercicio1.main(null);
			 assertEquals(a,null);
		      
		    
		   }
	   @Test
		 public void testMetodoPrincipal() 
		   {
			 Persona p= new Persona(true, false, false, true, true);
			 Clima c= new Clima(false, false, 0.14, -1, false);
			 Espacio e = new Espacio(10, 20, false);
			 boolean objetivo=true;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	   @Test
		 public void testMetodoPrincipal2() 
		   {
			 Persona p= new Persona(false, false, false, true, true);
			 Clima c= new Clima(false, false, 0.14, -1, false);
			 Espacio e = new Espacio(10, 20, false);
			 boolean objetivo=false;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	   @Test
		 public void testMetodoPrincipal3() 
		   {
		   	Persona p= new Persona(true, false, false, true, true);
			 Clima c= new Clima(true, false, 0.14, -1, false);
			 Espacio e = new Espacio(10, 20, false);
			 boolean objetivo=true;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	   @Test
		 public void testMetodoPrincipal4() 
		   {
		   Persona p= new Persona(true, false, false, true, true);
			 Clima c= new Clima(false, false, 0.14, 14.0, false);
			 Espacio e = new Espacio(10, 20, false);
			 boolean objetivo=true;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	   @Test
		 public void testMetodoPrincipal5() 
		   {
		   Persona p= new Persona(true, false, false, true, true);
			 Clima c= new Clima(false, false, 0.14, 16, false);
			 Espacio e = new Espacio(10, 20, false);
			 boolean objetivo=true;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	  
	   @Test
		 public void testMetodoPrincipal6() 
		   {
		   Persona p= new Persona(true, false, false, true, true);
			 Clima c= new Clima(false, false, 0.14, 26, false);
			 Espacio e = new Espacio(10, 20, false);
			 boolean objetivo=true;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	   
	   @Test
		 public void testMetodoPrincipal7() 
		   {
		   Persona p= new Persona(true, false, false, true, true);
			 Clima c= new Clima(false, false, 0.14, 35, false);
			 Espacio e = new Espacio(10, 20, false);
			 boolean objetivo=true;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	   
	   @Test
		 public void testMetodoPrincipal8() 
		   {
		   Persona p= new Persona(true, false, false, true, true);
			 Clima c= new Clima(false, false, 0.14, 35, false);
			 Espacio e = new Espacio(40, 20, false);
			 boolean objetivo=true;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	   @Test
		 public void testMetodoPrincipal9() 
		   {
		   Persona p= new Persona(false, false, false, true, true);
			 Clima c= new Clima(false, false, 0.14, 35, false);
			 Espacio e = new Espacio(40, 20, false);
			 boolean objetivo=false;
			 boolean ob=ejercicio1.metodoPrincipal(p, c, e);
			 assertEquals(objetivo,ob);
		      
		    
		   }
	   @Test
	 public void testRealizarActividad() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 boolean objetivo=true;
		 boolean resultadoActual=ejercicio1.realizarActividad(p);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   @Test
	   public void testRealizarActividad2() 
	   {
		 Persona p= new Persona(false, false, false, true, true);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.realizarActividad(p);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   @Test
		 public void testRealizarActividad3() 
		   {
			 
		     Persona p= new Persona(false, false, false, false, true);
			 String objetivo="Fin del programa";
			 String resultado="";
			 boolean resultadoActual=ejercicio1.realizarActividad(p);
			 if(!resultadoActual)
				 resultado="Fin del programa";
			 assertEquals(objetivo,resultado);
		      
		    
		   }
	   @Test
	   public void testQuedarseEnCasa() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.14, -1, false);
		 boolean objetivo=true;
		 boolean resultadoActual=ejercicio1.quedarseEnCasa(p,c);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testQuedarseEnCasa2() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, -1, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.quedarseEnCasa(p,c);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testQuedarseEnCasa3() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 25, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.quedarseEnCasa(p,c);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testQuedarseEnCasa4() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, true, 0.14, -1, false);
		 boolean objetivo=true;
		 boolean resultadoActual=ejercicio1.quedarseEnCasa(p,c);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	  
	   @Test
	   public void testQuedarseEnCasa5() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, true, 0.16, -1, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.quedarseEnCasa(p,c);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   @Test
	   public void testEsquiar() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, -1, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=true;
		 boolean resultadoActual=ejercicio1.esquiar(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testEsquiar2() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 23, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.esquiar(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testEsquiar3() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 23, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.esquiar(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testEsquiar4() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, -1, false);
		 Espacio e = new Espacio(40, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.esquiar(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testEsquiar5() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.16, -1, false);
		 Espacio e = new Espacio(40, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.esquiar(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testEsquiar6() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.16, -1, false);
		 Espacio e = new Espacio(40, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.esquiar(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testEsquiar7() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, true, 0.16, -1, false);
		 Espacio e = new Espacio(40, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.esquiar(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   @Test
	   public void testEsquiar8() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.16, 23, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.esquiar(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testSenderismo() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 14.0, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=true;
		 boolean resultadoActual=ejercicio1.senderismo(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testSenderismo2() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.14, 14.0, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.senderismo(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testSenderismo3() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, true, 0.16, 9.0, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.senderismo(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testTurismo() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 16, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=true;
		 boolean resultadoActual=ejercicio1.turismo(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testTurismo2() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.14, 16, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.turismo(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	  
	   
	   @Test
	   public void testCanias() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 26, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=true;
		 boolean resultadoActual=ejercicio1.canias(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   @Test
	   public void testCanias2() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 2, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.canias(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   @Test
	   public void testCanias3() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.14, 26, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.canias(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   @Test
	   public void testCanias4() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 26, false);
		 Espacio e = new Espacio(140, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.canias(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   @Test
	   public void testCanias5() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.14, 26, false);
		 Espacio e = new Espacio(140, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.canias(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testCanias6() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.14, 2, false);
		 Espacio e = new Espacio(140, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.canias(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testCanias7() 
	   {
		   Persona p= new Persona(true, false, false, true, true);
			 Clima c= new Clima(true, false, 0.14, 26, false);
			 Espacio e = new Espacio(10, 20, false);
			 boolean objetivo=false;
			 boolean resultadoActual=ejercicio1.canias(p,c,e);
			 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testBañarse() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 35, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=true;
		 boolean resultadoActual=ejercicio1.bañarse(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testBañarse2() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(false, false, 0.14, 25, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.bañarse(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testBañarse3() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.14, 35, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.bañarse(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
	   @Test
	   public void testBañarse4() 
	   {
		 Persona p= new Persona(true, false, false, true, true);
		 Clima c= new Clima(true, false, 0.14,15, false);
		 Espacio e = new Espacio(10, 20, false);
		 boolean objetivo=false;
		 boolean resultadoActual=ejercicio1.bañarse(p,c,e);
		 assertEquals(objetivo,resultadoActual);
	      
	    
	   }
	   
}

