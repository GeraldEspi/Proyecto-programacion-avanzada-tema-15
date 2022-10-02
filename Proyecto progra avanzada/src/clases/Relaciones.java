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
import vista.VentanaTexto;

public class Relaciones 
{
	
	public void inicioPrograma() throws FileNotFoundException
	{
		Gestion ges = new Gestion();
		ventana1 v1 = new ventana1();
		ventana2 v2 = new ventana2();
		ventana3 v3 = new ventana3();
		ventana4 v4 = new ventana4();
		ventana3_1 v3_1 = new ventana3_1();
		ventana3_2 v3_2 = new ventana3_2();
		ventana3_encontradamodificar v3_e  = new ventana3_encontradamodificar();
		ventana3_personaencontrada v3_p = new ventana3_personaencontrada();;
		ventana4_1 v4_1 = new ventana4_1();
		ventana4_2 v4_2 = new ventana4_2();
		VentanaTexto vT= new VentanaTexto();
		Coordinador coord = new Coordinador();
		
		coord.inicioGober();
		
		coord.setGes(ges);
		coord.setV1(v1);
		coord.setV2(v2);
		coord.setV3(v3);
		coord.setV4(v4);
		coord.setV3_1(v3_1);
		coord.setV3_2(v3_2);
		coord.setV3_e(v3_e);
		coord.setV4_1(v4_1);
		coord.setV4_2(v4_2);
		coord.setVT(vT);
		
		ges.setCoord(coord);
		v1.setCoord(coord);
		v2.setCoord(coord);
		v3.setCoord(coord);
		v4.setCoord(coord);
		v3_1.setCoord(coord);
		v3_2.setCoord(coord);
		v3_e.setCoord(coord);
		v3_p.setCoord(coord);
		v4_1.setCoord(coord);
		v4_2.setCoord(coord);
		vT.setCoord(coord);
		
		coord.iniciarPrograma();
	}

}
