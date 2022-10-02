package clases;


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

		nombre = datosLinea[1];
		mail = datosLinea[2];
		profesion = datosLinea[4];
		rut = Integer.parseInt(datosLinea[5]);
		return true;
	}

	public void imprimirDatos() 
	{
		System.out.println("\n--------------------");
	    System.out.println("-Nombre: " + nombre);
	    System.out.println("-Mail: " + mail);
	    System.out.println("-Profesión: " + profesion);
	    System.out.println("-Rut: " + rut);
	    System.out.println("--------------------\n");
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

	public void setRut(String rut) {
		this.rut = Integer.parseInt(rut);
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