
public class Persona 
{
	private String nombre;
	private String mail;
	private String cargo;
	private String profecion;
	private int rut;
	private int sueldo;
    
    
	public Persona()
	{
		this.nombre = "";
		this.mail = "";
		this.cargo = "";
		this.profecion = "";
		this.rut = 0;
		this.sueldo = 0;
	}
	
	
	
	public boolean llenadoPorLinea(String linea)
    {
        if(linea == null) 
        {
        	return false;
        }
		
		String[] datosLinea = linea.split(",");
		
		nombre = datosLinea[0];
		mail = datosLinea[1];
		cargo = datosLinea[2];
		profecion = datosLinea[3];
		rut = Integer.parseInt(datosLinea[4]);
		sueldo = Integer.parseInt(datosLinea[5]);
		
		return true;
    }
	
	
	//Getters
	public String getsNombre()
    {
        return nombre;
    }
	public String getsMail()
    {
        return mail;
    }
	public String getsCargo()
    {
        return cargo;
    }
	public String getsProfecion()
    {
        return profecion;
    }
	public int getsRut()
    {
        return rut;
    }
	public int getSueldo()
    {
        return sueldo;
    }
	
	//Setters
	public void setNombre(String nombre) 
	{
        this.nombre = nombre;
    }
	public void setMail(String mail) 
	{
        this.mail = mail;
    }
	public void setCargo(String cargo) 
	{
        this.cargo = cargo;
    }
	public void setProfecion(String profecion) 
	{
        this.profecion = profecion;
    }
	public void setRut(int rut) 
	{
		this.rut = rut;
	}
	public void setSueldo(int sueldo) 
	{
		this.sueldo = sueldo;
	}
	
	
	public void mostrarDatos() 
	{
		System.out.print("Nombre:"+ nombre +"/Mail:"+ mail + "/Cargo:"+ cargo + "/Profecion:"+ profecion + "/Rut:"+ rut +"/Sueldo:"+ sueldo);
	}
	
	
	
	
	
	
}
