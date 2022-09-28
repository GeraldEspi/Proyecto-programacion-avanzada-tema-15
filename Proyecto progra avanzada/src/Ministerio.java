import java.util.Enumeration;
import java.util.Hashtable;

public class Ministerio 
{
	private String nombreMinisterio;
	private String nombreMinistro;
	private int limFuncionarios;
	private int funcionariosActivos;
	private Hashtable<Integer,Persona> empleados;
	
	public Ministerio() 
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
	public Persona getFuncionarioKey(int key) 
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
		empleados.put(p.getsRut(),p);
		this.funcionariosActivos++;
	}
	
	public void mostrarDatos() 
	{	System.out.println("\n---Ministerio de "+nombreMinisterio+"---");
		System.out.println("*Ministro: "+ nombreMinistro+"");
		System.out.println("*Limite de Funcionarios: "+ limFuncionarios+""  );
		System.out.println("*Cantidad de Funcionarios: "+ funcionariosActivos+""  );
		System.out.println("--------------------------\n");
	}
	
	public void mostrarFuncionarios() 
	{
		Enumeration<Integer> e = empleados.keys();
		
		while(e.hasMoreElements()) 
		{
			int key = e.nextElement();
			Persona p = empleados.get(key);
			p.imprimirDatos();
		}
	}
	
	public Persona buscarFuncionario(String nombreAux) 
	{
		Enumeration<Integer> e = empleados.keys();
		
		while(e.hasMoreElements()) 
		{
			int key = e.nextElement();
			Persona perso = empleados.get(key);
			
			if(nombreAux.equals(perso.getsNombre())) 
			{
				return perso;
			}
		}
		System.out.println("No se encontro al funcionario");
		return null;
	}
	
	
	public void eliminarPersona(Persona auxPerso) 
	{
		auxPerso.imprimirDatos();
		int key = auxPerso.getsRut();
		boolean ToF = empleados.remove(key, auxPerso);
		
		System.out.println(ToF);
		
	}
}