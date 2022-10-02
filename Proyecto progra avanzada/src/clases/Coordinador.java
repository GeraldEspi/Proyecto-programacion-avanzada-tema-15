package clases;

import java.io.FileNotFoundException;

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
		gober = new Gobierno();
	}
	
	public void inicioGober() throws FileNotFoundException
	{
		String linea, linea2;
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
	
	//--------------------------------------
	
	public Gestion getGes() {
		return ges;
	}

	public void setGes(Gestion ges) {
		this.ges = ges;
	}

	public ventana1 getV1() {
		return v1;
	}

	public void setV1(ventana1 v1) {
		this.v1 = v1;
	}

	public ventana2 getV2() {
		return v2;
	}

	public void setV2(ventana2 v2) {
		this.v2 = v2;
	}

	public ventana3 getV3() {
		return v3;
	}

	public void setV3(ventana3 v3) {
		this.v3 = v3;
	}

	public ventana4 getV4() {
		return v4;
	}

	public void setV4(ventana4 v4) {
		this.v4 = v4;
	}

	public ventana3_1 getV3_1() {
		return v3_1;
	}

	public void setV3_1(ventana3_1 v3_1) {
		this.v3_1 = v3_1;
	}

	public ventana3_2 getV3_2() {
		return v3_2;
	}

	public void setV3_2(ventana3_2 v3_2) {
		this.v3_2 = v3_2;
	}

	public ventana3_encontradamodificar getV3_e() {
		return v3_e;
	}

	public void setV3_e(ventana3_encontradamodificar v3_e) {
		this.v3_e = v3_e;
	}

	public ventana3_personaencontrada getV3_p() {
		return v3_p;
	}

	public void setV3_p(ventana3_personaencontrada v3_p) {
		this.v3_p = v3_p;
	}

	public ventana4_1 getV4_1() {
		return v4_1;
	}

	public void setV4_1(ventana4_1 v4_1) {
		this.v4_1 = v4_1;
	}

	public ventana4_2 getV4_2() {
		return v4_2;
	}

	public void setV4_2(ventana4_2 v4_2) {
		this.v4_2 = v4_2;
	}
	
	//--------------------------------------

	public void inicioVentana() 
	{
		ges.setVisible(true);
	}
	
	public Gobierno getGober() 
	{
		return gober;
	}
	
	
	
}
