import java.util.Enumeration;
import java.util.Hashtable;

public class ListaFuncionarios 
{
	private Hashtable<Integer,Persona> empleados;
	
	public ListaFuncionarios() 
	{
		this.empleados = new Hashtable<Integer,Persona>();
	}
	
	public void setNewFuncio(Persona auxPerso) 
	{
		Enumeration<Integer> e = empleados.keys();
		
		if(empleados.size() == 0) 
		{
			empleados.put(auxPerso.getsRut(), auxPerso);
		}
		
		while(e.hasMoreElements()) 
		{
			int key = e.nextElement();
			Persona perso = empleados.get(key);
			
			if(auxPerso.compararPersonas(perso) == false) 
			{
				empleados.put(auxPerso.getsRut(), auxPerso);
			}
		}
	}
	
	public Persona getFuncionario(int key) 
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
	
}
