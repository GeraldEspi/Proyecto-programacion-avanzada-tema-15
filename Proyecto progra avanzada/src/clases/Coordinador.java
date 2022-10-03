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
import vista.VentanaTexto;
import vista.Ventana_leer_ministerio;

// Clase que coordina todos las ventanas y clases entre sí
// Además de lo dicho, permite el guardado y captura de los datos de los txt. 
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
	private VentanaTexto vT;
	private Ventana_leer_ministerio vLM;
	private Gobierno gober;
	private Funcionario funcio;
	private int modificado;
	
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
	
	public void setVT(VentanaTexto VT) 
	{
		this.vT = VT;
	}
	public void setvLM(Ventana_leer_ministerio vLM) 
	{
		this.vLM = vLM;
	}
	
	
	public void setGobierno(Gobierno g) 
	{
		this.gober = g;
	}
	public void setFuncioBusq(Funcionario funcio) 
	{
		this.funcio = funcio;
	}
	public void setModificado(int i) 
	{
		this.modificado = i;
	}
	
	//--------------------------------------

	public Gobierno getGober() 
	{
		return gober;
	}
	public Funcionario getFuncioBusq() 
	{
		return funcio;
	}
	public VentanaTexto getVT() 
	{
		return vT;
	}
	public ventana3_personaencontrada getV3_P() 
	{
		return v3_p;
	}
	public int getModificado() 
	{
		return modificado;
	}
	
	//visible de ventanas
	public void inicioVentana() 
	{
		ges.setVisible(true);
	}
	public void visible1() 
	{
		v1.setVisible(true);
	}
	public void visible2() 
	{
		v2.setVisible(true);
	}
	public void visible3() 
	{
		v3.setVisible(true);
	}
	public void visible3_1() 
	{
		v3_1.setVisible(true);
	}
	public void visible3_2() 
	{
		v3_2.setVisible(true);
	}
	public void visible3_p() 
	{
		v3_p.setVisible(true);
	}
	public void visibleVLM() 
	{
		vLM.setVisible(true);
	}
	public void visible3_e(int i) 
	{
		v3_e.setVisible(true);
		setModificado(i);
	}
	public void visible4() 
	{
		v4.setVisible(true);
	}
	public void visible4_1() 
	{
		v4_1.setVisible(true);
	}
	public void visible4_2() 
	{
		v4_2.setVisible(true);
	}
	
	
	
	

	
	
	//--------------------------
	public void iniciarPrograma() throws FileNotFoundException
	{
		inicioVentana();
	}
	
	// Se inicia el gobierno
	public void inicioGober() throws FileNotFoundException
	{
		String linea;
		Lector l = new Lector();
		
		l.openFile("Ministerios");

		linea = l.firstLine();
		// Ciclo para crear los nodos del arreglo ministerios
		while(linea != null) 
		{
			this.gober.llenadoArray(linea);
			linea = l.nextLine();
		}	
		
		l.openFile("personas");
		
		linea = l.firstLine();
		// Ciclo para crear los nodos tipo personas y agregarlos al arraylist perteneciente al ministerio que pertenece la persona
		while(linea != null) 
		{
			this.gober.llenadoTablaMinisterio(linea);
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
	
	public void agregarFuncio(String funcionario) 
	{
		gober.llenadoTablaMinisterio(funcionario);
	}
	
	public Funcionario buscarNombre(String mini, String nombre) 
	{
		return gober.buscarPersona(nombre, mini);
	}
	public Funcionario buscarNombre(String mini, int rut) 
	{
		return gober.buscarPersona(rut, mini);
	}
	public Ministerio getMiniNomb(String nombre) 
	{
		return gober.getsMinisterio(nombre);
	}
	public void eliminarFuncio() 
	{
		gober.eliminarFuncionario(funcio);
		funcio = null;
	}
	
	
	
	
	
}
