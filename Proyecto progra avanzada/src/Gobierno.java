import java.util.ArrayList;

public class Gobierno {
	
	private ArrayList<Ministerio> arrMin;
	
	public Gobierno () 
	{
		arrMin = new ArrayList<Ministerio>();
	}
	
	/*Metodo para generar nodos de tipo ministerio mediante una liena he insertarlos en el 
	 arrayList de esta misma clase*/
	public void llenadoArray(String linea) 
	{
		Ministerio minis = new Ministerio();
		boolean ToF;
		
		ToF = minis.llenadoPorLinea(linea);
		if(ToF == true) 
		{
			ToF = arrMin.add(minis);
		}
	}
	
	/*Metodo para generar un nodo de tipo persona mediante una liena
	 he insertarlo a el mapa del ministerio correspondiente*/
	public void llenadoTablaMinisterio(String linea) 
	{
		Persona perso = new Persona();
		Ministerio minis = new Ministerio();
		boolean ToF;
		int j = 0;
		
		ToF = perso.llenado(linea);
		for(j = 0; j < arrMin.size() ; j++) 
		{
			minis = arrMin.get(j);
			if (perso.getsCargo().compareTo(minis.getNombreMinisterio()) == 0) 
			{
				break;
			}
		}
		if(ToF == true) 
		{
			minis.addMapPersona(perso);
		}
	}
	
	public void listarMinisterios() 
	{
		Ministerio minis = new Ministerio();
		int j = 0; 
		
		for(j = 0; j < arrMin.size() ; j++) 
		{
			minis = arrMin.get(j);
			minis.mostrarDatos();
		}
	}
	
	public void listarTodosFuncio() 
	{
		Ministerio minis = new Ministerio();
		int j = 0;
		
		for(j = 0; j < arrMin.size() ; j++) 
		{
			minis = arrMin.get(j);
			minis.mostrarFuncionarios();
		}
	}
	
	public void listarFuncionariosMini(String linea) 
	{
		Ministerio minis = new Ministerio();
		int j = 0;
		
		for(j = 0; j < arrMin.size() ; j++) 
		{
    		minis = arrMin.get(j);
    		if (linea.compareTo(minis.getNombreMinisterio()) == 0) 
			{
    			minis.mostrarFuncionarios();
    			break;
			}
		}
		if(j == arrMin.size()) 
    	{
    		System.out.println("El ministerio que ingreso no se encuentra");
    	}
	}
	
	
}
