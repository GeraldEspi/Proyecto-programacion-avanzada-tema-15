package clases;

import java.io.*;

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
	private Gobierno gober;
	
	public Coordinador() 
	{
		gober = new Gobierno();
	}
	
	//--------------------------------------

	public void setGes(Gestion ges) {
		this.ges = ges;
	}

	public void setV1(ventana1 v1) {
		this.v1 = v1;
	}

	public void setV2(ventana2 v2) {
		this.v2 = v2;
	}

	public void setV3(ventana3 v3) {
		this.v3 = v3;
	}

	public void setV4(ventana4 v4) {
		this.v4 = v4;
	}

	public void setV3_1(ventana3_1 v3_1) {
		this.v3_1 = v3_1;
	}

	public void setV3_2(ventana3_2 v3_2) {
		this.v3_2 = v3_2;
	}

	public void setV3_e(ventana3_encontradamodificar v3_e) {
		this.v3_e = v3_e;
	}

	public void setV3_p(ventana3_personaencontrada v3_p) {
		this.v3_p = v3_p;
	}

	public void setV4_1(ventana4_1 v4_1) {
		this.v4_1 = v4_1;
	}

	public void setV4_2(ventana4_2 v4_2) {
		this.v4_2 = v4_2;
	}
	
	public void setGobierno(Gobierno g) 
	{
		this.gober=g;
	}
	
	//--------------------------------------

	public Gobierno getGober() 
	{
		return gober;
	}
		
	public void inicioVentana() 
	{
		ges.setVisible(true);
	}
	
	public void iniciarPrograma(Gobierno g) throws FileNotFoundException
	{
		setGobierno(g);
		inicioVentana();
	}
	
	public void inicioGober() throws FileNotFoundException
	{
		String linea;
		Lector l = new Lector();
		
		l.openFile("Ministerios");
		
		
		linea = l.firstLine();
		// Ciclo para crear los nodos del arreglo ministerios
		while(linea != null) 
		{
			gober.llenadoArray(linea);
			linea = l.nextLine();
		}	
		
		l.openFile("personas");
		
		linea = l.firstLine();
		// Ciclo para crear los nodos tipo personas y agregarlos al arraylist perteneciente al ministerio que pertenece la persona
		while(linea != null) 
		{
			gober.llenadoTablaMinisterio(linea);
			linea = l.nextLine();
		}
	}
	
	public void guardarDatos() throws IOException
	{
		Lector l = new Lector();
		l.guardarDatos(gober);
	}
	
	public void back() 
	{
		ges.setVisible(true);
	}
	
	
	
	
	
}
