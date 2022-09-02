import java.util.Hashtable;

public class Ministerios 
{
	private String nombreMinisterio;
	private String nombreMinistro;
	private int limFuncionarios;
	private int funcionariosActivos;
	private Hashtable<Integer,Persona> empleados;
	
	public Ministerios() 
	{
		this.limFuncionarios = 0;
		this.funcionariosActivos = 0;
		this.empleados = new Hashtable<Integer,Persona>();
	}
	
	public boolean llenadoPorLinea(String linea)
    {
        if(linea == null) 
        {
        	return false;
        }
	
		String[] datosLinea = linea.split(",");
		
		nombreMinisterio = datosLinea[0];
		nombreMinistro = datosLinea[1];
		limFuncionarios = Integer.parseInt(datosLinea[2]);
		
		return true;
    }
	
	
	//Getters
	public String getNombreMinisterio() 
	{
		return nombreMinisterio;
	}
	public String getMinistro() 
	{
		return nombreMinistro;
	}
	public int getLimFuncionarios() 
	{
		return limFuncionarios;
	}
	public int getFuncionariosActivos() 
	{
		return funcionariosActivos;
	}
	public int getSizeArray() 
	{
		return empleados.size();
	}
	public Persona getNombrePersona(int key) 
	{
		Persona p = empleados.get(key);
		return p;
	}
	
	//Setters
	public void setNombreMinisterio(String nombre) 
	{
        this.nombreMinisterio = nombre;
    }
	public void setNombreMinistro(String nombre) 
	{
		this.nombreMinistro = nombre;
	}
	public void setLimFuncionarios(int lim) 
	{
		this.limFuncionarios = lim;
	}
	
	
	public void addMapPersona(Persona p) 
	{
		empleados.put(p.getsKey(),p);
		this.funcionariosActivos++;
	}
	
	public void mostrarDatos() 
	{
		System.out.print("ministerio:"+ nombreMinisterio +"/ministro:"+ nombreMinistro + "/limite de Funcionarios:"+ limFuncionarios +"\n");
	}
}
