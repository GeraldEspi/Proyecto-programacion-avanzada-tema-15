package clases;
import java.util.Enumeration;
import java.util.Hashtable;

public class ListaFuncionarios 
{
	private Hashtable<Integer,Funcionario> empleados;
	
	public ListaFuncionarios() 
	{
		this.empleados = new Hashtable<Integer,Funcionario>();
	}
	
	public void setNewFuncio(Funcionario auxFuncio) 
	{
		Enumeration<Integer> e = empleados.keys();
		
		if(empleados.size() == 0) 
		{
			empleados.put(auxFuncio.getsRut(), auxFuncio);
		}
		
		while(e.hasMoreElements()) 
		{
			int key = e.nextElement();
			Funcionario funcio = empleados.get(key);
			
			if(funcio.compararPersonas(auxFuncio) == false) 
			{
				empleados.put(auxFuncio.getsRut(), auxFuncio);
				break;
			}
		}
	}
	
	public Funcionario getFuncionario(int key) 
	{
		return empleados.get(key);
	}
	
	public int getLargo() 
	{
		return empleados.size();
	}
	
	public Enumeration<Integer> getEnumeration() 
	{
		return empleados.keys();
	}
	
	public void eliminarFuncionario(Persona auxPerso) 
	{
		empleados.remove((auxPerso.getsRut()), auxPerso);
	}
	
	public String mostrarFuncionarios() 
	{
		Enumeration<Integer> e = empleados.keys();
		String cadena ="";
		
		while(e.hasMoreElements()) 
		{
			int key = e.nextElement();
			Funcionario p = empleados.get(key);
			cadena+= p.imprimirDatos();
		}
		return cadena;
	}
	
}
