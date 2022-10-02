package clases;
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
	  public void setSueldo(String sueldo) 
	  {
		  this.sueldo = Integer.parseInt(sueldo);
	  }
	  
	  public void imprimirDatos() 
	  {
			System.out.println("\n--------------------");
		    System.out.println("-Nombre: " + nombre);
		    System.out.println("-Mail: " + mail);
		    System.out.println("-Profesión: " + profesion);
		    System.out.println("-Rut: " + rut);
		    System.out.println("-Sueldo: " + sueldo + " UTM");
		    System.out.println("--------------------\n");
	  }
	  
	  public boolean llenado(String linea) 
	  {
	    if (linea == null) {
	      return false;
	    }

	    String[] datosLinea = linea.split(",");

	    nombre = datosLinea[1];
	    mail = datosLinea[2];
	    ministerio = datosLinea[3];
	    profesion = datosLinea[4];
	    rut = Integer.parseInt(datosLinea[5]);
	    sueldo = Integer.parseInt(datosLinea[6]);

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
