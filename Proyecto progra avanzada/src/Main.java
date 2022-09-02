import java.io.*;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)throws IOException 
	{
		Persona p = new Persona();
		Ministerios m = new Ministerios();
		String linea;
		ArrayList<Ministerios> arrMin = new ArrayList<Ministerios>();
		Lector l = new Lector();
		BufferedReader LeerLinea = new BufferedReader(new InputStreamReader (System.in));
		int opcion;
		boolean a;
		int j;
		
		l.openFile("Ministerios");

		linea = l.firstLine();
		
		// ciclo para crear los nodos del arreglo ministerios
		while(linea != null) 
		{
			a = m.llenadoPorLinea(linea);
			if(a == true) 
			{
				a = arrMin.add(m);
			}
			m = new Ministerios();
			linea = l.nextLine();
		}	
		
		
		l.openFile("personas");
		
		linea = l.firstLine();
		
		// Ciclo para crear los nodos tipo personas y agregarlos al arraylist perteneciente al ministerio que pertenece la persona
		while(linea != null) 
		{
			a = p.llenado(linea);
			for(j = 0; j < arrMin.size() ; j++) 
			{
				m = arrMin.get(j);
				if (p.getsCargo().compareTo(m.getNombreMinisterio()) == 0) 
				{
					break;
				}
			}
			if(a == true) 
			{
				m.addMapPersona(p);
				p = new Persona();
			}
			linea = l.nextLine();
		}
		/*m = arrMin.get(2);
		m.mostrarDatos();
		p = m.getNombrePersona(106);
		p.imprimirDatos();*/
		
		do {//mostramos las diferentes opciones a escoger
            System.out.println("Opcion 1 : Agregar Funcionario");
            System.out.println("Opcion 2 : Listar Ministerios Disponibles");
            System.out.println("Opcion 3 : Listar Todos Funcionarios");
            System.out.println("Opcion 4 : Listar Funcionarios de un ministerio");
            opcion = Integer.parseInt(LeerLinea.readLine());
            switch (opcion) {
                case 1 -> {//Agregar Funcionario
                	System.out.println("Ingrese los datos del funcionario con el formato");
                	System.out.println("claveFuncionario,Nombre,mail,Salud,profecion,rut,sueldo en utm: \n");
                	linea= LeerLinea.readLine();
                	a = p.llenado(linea);
        			for(j = 0; j < arrMin.size() ; j++) 
        			{
        				m = arrMin.get(j);
        				if (p.getsCargo().compareTo(m.getNombreMinisterio()) == 0) 
        				{
        					break;
        				}
        			}
        			if(a == true) 
        			{
        				m.addMapPersona(p);
        				p = new Persona();
        			}
        			linea = l.nextLine();
                }
                case 2 -> 
                {
                	for(j = 0; j < arrMin.size() ; j++) 
        			{
        				m = arrMin.get(j);
        				m.mostrarDatos();
        			}
                }
                case 3 -> 
                {
                	for(j = 0; j < arrMin.size() ; j++) 
        			{
        				m = arrMin.get(j);
        				m.mostrarFuncionarios();
        			}
                }
                case 4 -> 
                {
                	System.out.println("Ingrese el ministerio que desea listar");
                	linea = LeerLinea.readLine();
                	for(j = 0; j < arrMin.size() ; j++) 
        			{
                		m = arrMin.get(j);
                		if (linea.compareTo(m.getNombreMinisterio()) == 0) 
        				{
                			m.mostrarFuncionarios();
                			break;
        				}
        			}
                	if(j == arrMin.size()) 
                	{
                		System.out.println("El ministerio que ingreso no se encuentra");
                	}
                	
                }
                case 0 ->
                        System.out.println("Bye <3");
                default -> System.out.println("Opcion ingresada no es valida");//pa los que no saben poner un numero
            }
        }while( opcion != 0 );//
		
	}

}
