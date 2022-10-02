package clases;

import vista.Gestion;
import vista.ventana1;
import vista.ventana2;
import vista.ventana3;
import vista.ventana4;
import vista.ventana3_1;
import vista.ventana3_2;
import vista.ventana3_encontradamodificar;
import vista.ventana3_personaencontrada;
import vista.ventana4_1;
import vista.ventana4_2;


public class Coordinador 
{
	private Gestion ges;
	private	ventana1 v1;
	private ventana2 v2;
	private ventana3 v3;
	private ventana4 v4;
	private ventana3_1 v3_1;
	private ventana3_2 v3_2;
	private ventana3_encontradamodificar v3_e;
	private ventana3_personaencontrada v3_p;
	private ventana4_1 v4_1;
	private ventana4_2 v4_2;
	
	public Coordinador() 
	{
		ges = new Gestion();
		v1 = new ventana1();
		v2 = new ventana2();
		v3 = new ventana3();
		v4 = new ventana4();
		v3_1 = new ventana3_1();
		v3_2 = new ventana3_2();
		v3_e = new ventana3_encontradamodificar();
		v3_p = new ventana3_personaencontrada();
		v4_1 = new ventana4_1();
		v4_2 = new ventana4_2();
	}
	
	
	
	
}
