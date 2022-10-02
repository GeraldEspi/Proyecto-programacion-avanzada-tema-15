package clases;
import java.io.*;
public class Funcionario extends Persona
{
	  private String ministerio;
	  private int sueldo;
	  
	  public Funcionario() 
	  {
		  super();
		  ministerio = "";
		  sueldo = 0;
	  }
	  
	  //getters
	  public String getsMinisterio() 
	  {
		    return ministerio;
	  }
	  public int getsSueldo() 
	  {
		    return sueldo;
	  }
	  
	  //setters
	  public void setMinisterio(String ministerio) 
	  {
		    this.ministerio = ministerio;
	  }
	  public void setSueldo(String sueldo) throws IOException
	  {
		  try 
		  {
			  this.sueldo = Integer.parseInt(sueldo);
		  }
		  catch(Exception e1) 
		  {
			  
		  }
	  }
	  
	  public String imprimirDatos() 
	  {
		  
		String cadena;
			
		cadena = "-Nombre: " + nombre + "\n";
		cadena += "-Mail: " + mail + "\n";
		cadena += "-Ministerio: " + ministerio + "\n";
		cadena += "-Profesión: " + profesion + "\n";
		cadena += "-Rut: " + rut + "\n";
		cadena += "-Sueldo: " + sueldo + " UTM\n";
		cadena += "--------------------------\n";
			
		return cadena;
	  }
	  
	  public boolean llenado(String linea) 
	  {
	    if (linea == null) {
	      return false;
	    }

	    String[] datosLinea = linea.split(",");

	    nombre = datosLinea[0];
	    mail = datosLinea[1];
	    ministerio = datosLinea[2];
	    profesion = datosLinea[3];
	    rut = Integer.parseInt(datosLinea[4]);
	    sueldo = Integer.parseInt(datosLinea[5]);

	    return true;
	  }
	  
	  public boolean compararPersonas(Funcionario auxFuncio) 
		{
			if(nombre.equals(auxFuncio.getsNombre()))
			{
				if(rut == (auxFuncio.getsRut())) 
				{
					if(profesion.equals(auxFuncio.getsProfesion())) 
					{
						if(ministerio.equals(auxFuncio.getsMail())) 
						{
							if(sueldo == (auxFuncio.getsSueldo())) 
							{
								return true;
							}
						}
					}
				}
			}
			return false;
		}
	  
	  
}
