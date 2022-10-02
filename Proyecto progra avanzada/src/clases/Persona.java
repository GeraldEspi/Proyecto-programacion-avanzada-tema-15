package clases;

import java.io.*;

public class Persona 
{
	
	protected String nombre;
	protected String mail;
	protected String profesion;
	protected int rut;


	public Persona() 
	{
		nombre = "";
		mail = "";
		profesion = "";
		rut = 0;
	}

  /*Funcion para generar un nodo de tipo persona mediante una linea de formato:
  	claveFuncionario,Nombre,mail,ministerio,profesion,rut,sueldo*/
	public boolean llenado(String linea) 
	{
		if (linea == null) 
		{
			return false;
		}

		String[] datosLinea = linea.split(",");

		nombre = datosLinea[0];
		mail = datosLinea[1];
		profesion = datosLinea[2];
		rut = Integer.parseInt(datosLinea[3]);
		return true;
	}

	public String imprimirDatos() 
	  {
		  
		String cadena;
			
		cadena = "-Nombre: " + nombre;
		cadena += "-Mail: " + mail;
		cadena += "-Profesión: " + profesion;
		cadena += "-Rut: " + rut ;
		cadena += "--------------------------\n";
			
		return cadena;
	  }
	  

  // Getters
	public String getsNombre() {
		return nombre;
	}

	public String getsMail() {
		return mail;
	}

	public String getsProfesion() {
		return profesion;
	}

	public int getsRut() {
		return rut;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public void setRut(String rut) throws IOException
	{
		try 
		  {
			  this.rut = Integer.parseInt(rut);
		  }
		  catch(Exception e1) 
		  {
			  
		  }
	}
  
	public boolean compararPersonas(Persona auxPerso) 
	{
		if(nombre.equals(auxPerso.getsNombre()))
		{
			if(rut == (auxPerso.getsRut())) 
			{
				if(profesion.equals(auxPerso.getsProfesion())) 
				{
					return true;
				}
			}
		}
		return false;
	}
}