package clases;
import java.io.*;

import java.util.*;
import javax.swing.JOptionPane;

public class Lector {
	
	private Scanner archivo;
    private String linea;
	
	
	public Lector() 
	{
		
	}
	
	public void openFile(String txt) throws FileNotFoundException
	{
		this.archivo = new Scanner(new File(txt +".txt"));
	}
	
	public String firstLine()
    {
        return nextLine();
    }
	
	public String nextLine() 
    {
		if(this.archivo.hasNext() == false) 
		{
			return null;
		}
		this.linea = this.archivo.nextLine();
        return(this.linea);
    }
	
	public void guardarDatos(Gobierno gober) throws IOException
	{
		FileWriter w = null;
		PrintWriter wr = null;
		
		try 
		{
			
			w = new FileWriter("personasPrueba.txt");
			wr = new PrintWriter(w);
			Ministerio mini;
			Funcionario funcio;
			Enumeration<Integer> e;
			int i;
			
			
			for(i = 0; i < gober.getsSize(); i++) 
			{
				mini = gober.getsMinisterio(i);
				e = mini.getsEnumeration();
				while(e.hasMoreElements()) 
				{
					funcio = mini.getFuncionarioKey(e.nextElement());
					wr.println(funcio.getsNombre()+","+funcio.getsMail()+","+funcio.getsMinisterio()+","+funcio.getsProfesion()+","+funcio.getsRut()+","+funcio.getsSueldo());
				}
			}
		}
		catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null, "ha sucesido un error");
		}
		finally
		{
			w.close();
		}
	}

}
