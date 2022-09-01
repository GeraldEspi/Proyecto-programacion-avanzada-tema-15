import java.io.IOException;

public class Main 
{
	public static void main(String[] args)throws IOException 
	{
		Persona p = new Persona();;
		String linea;
		Ministerios[] m = new Ministerios[10];
		Lector l = new Lector();
		boolean a;
		int i, j;

		i = 0;
		
		l.openFile("Ministerios");

		linea = l.firstLine();
		
		
		while(linea != null) 
		{
			m[i] = new Ministerios();
			a = m[i].llenadoPorLinea(linea);
			linea = l.nextLine();
			m[i].mostrarDatos();
			i++;
		}	
		
		
		l.openFile("personas");
		
		linea = l.firstLine();
		
		while(linea != null) 
		{
			a = p.llenadoPorLinea(linea);
			for(j = 0; j <= i ; j++) 
			{
				if (p.getsCargo().compareTo(m[j].getNombreMinisterio()) == 0) 
				{
					break;
				}
			}
			if(a == true) 
			{
				m[j].addArrayPersona(p);
				p = new Persona();
			}
			linea = l.nextLine();
		}
		p = m[0].getNombrePersona(0);
		p.mostrarDatos();
	}

}
