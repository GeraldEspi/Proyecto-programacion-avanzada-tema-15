import java.io.*;
import java.util.*;

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
	
	public String firstLine() throws IOException
    {
        return nextLine();
    }
	
	public String nextLine() throws IOException
    {
		if(this.archivo.hasNext() == false) 
		{
			return null;
		}
		this.linea = this.archivo.nextLine();
        return(this.linea);
    }

}
