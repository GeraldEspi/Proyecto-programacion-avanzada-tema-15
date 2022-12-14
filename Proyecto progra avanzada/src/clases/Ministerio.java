package clases;
import java.util.Enumeration;

public class Ministerio 
{
	private String nombreMinisterio;
	private String nombreMinistro;
	private int limFuncionarios;
	private int funcionariosActivos;
	private ListaFuncionarios funcionarios;
	
	public Ministerio() 
	{
		this.limFuncionarios = 0;
		this.funcionariosActivos = 0;
		this.funcionarios = new ListaFuncionarios();
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
	public int getSizeMap() 
	{
		return funcionarios.getLargo();
	}
	public Funcionario getFuncionarioKey(int key) 
	{
		return funcionarios.getFuncionario(key);
	}
	public Enumeration<Integer> getsEnumeration()
	{
		return funcionarios.getEnumeration();
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
	
	
	public void addMapPersona(Funcionario funcio) 
	{
		funcionarios.setNewFuncio(funcio);
		this.funcionariosActivos++;
	}
	
	public String mostrarDatos() 
	{	
		String cadena;
		
		cadena = "\n---Ministerio de "+ getNombreMinisterio() +"---\n";
		cadena += "*Ministro: "+ getMinistro() +"\n";
		cadena += "*Limite de Funcionarios: "+ getLimFuncionarios() +"\n" ;
		cadena += "*Cantidad de Funcionarios: "+ getFuncionariosActivos() +"\n";
		cadena += "--------------------------\n";
		
		return cadena;
	}
	
	
	
	public String mostrarFuncionariosMinisterio() 
	{
		return funcionarios.mostrarFuncionarios();
	}
	
	public Funcionario buscarFuncionario(String nombreAux) 
	{
		Enumeration<Integer> e = funcionarios.getEnumeration();
		
		while(e.hasMoreElements()) 
		{
			int key = e.nextElement();
			Funcionario funcio = funcionarios.getFuncionario(key);
			
			if(nombreAux.equals(funcio.getsNombre())) 
			{
				return funcio;
			}
		}
		System.out.println("No se encontro al funcionario");
		return null;
	}
	
	public void eliminarPersona(Funcionario funcio) 
	{
		funcio.imprimirDatos();
		funcionarios.eliminarFuncionario(funcio);
	}
	
	public ListaFuncionarios listaParametro(int parametro1, int parametro2, ListaFuncionarios listaXparametro) 
	{
		Enumeration<Integer> e = funcionarios.getEnumeration();
		
		while(e.hasMoreElements()) 
		{
			int key = e.nextElement();
			Funcionario funcio = funcionarios.getFuncionario(key);
			
			if(funcio.getsSueldo() >= parametro1 && funcio.getsSueldo() <= parametro2) 
			{
				listaXparametro.setNewFuncio(funcio);
			}
		}
		return listaXparametro;
	}
	public ListaFuncionarios listaParametro(int parametro1, ListaFuncionarios listaXparametro) 
	{
		Enumeration<Integer> e = funcionarios.getEnumeration();
		
		while(e.hasMoreElements()) 
		{
			int key = e.nextElement();
			Funcionario funcio = funcionarios.getFuncionario(key);
			
			if(funcio.getsSueldo() >= 0 && funcio.getsSueldo() <= parametro1) 
			{
				listaXparametro.setNewFuncio(funcio);
			}
		}
		return listaXparametro;
	}
}