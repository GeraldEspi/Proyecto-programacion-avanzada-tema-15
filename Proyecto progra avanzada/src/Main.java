import java.io.IOException;

public class Main 
{
	public static void main(String[] args)throws IOException 
	{
		Persona p = new Persona();
		String linea;
		String nombre;
		boolean a;
		
		p.openFile( );

		linea = p.firstLine();
		
		a = p.llenado(linea);;
		
		if(a == true) 
		{
			nombre = p.getsNombre();
			
			System.out.print(nombre);
			
		}
		
	}

}
