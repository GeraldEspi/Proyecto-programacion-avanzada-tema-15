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
		BufferedReader usuario = new BufferedReader(new InputStreamReader (System.in));
		int opcion;
		boolean a;
		int i, j;

		i = 0;
		
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
			for(j = 0; j <= arrMin.size() ; j++) 
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
		m = arrMin.get(2);
		m.mostrarDatos();
		p = m.getNombrePersona(106);
		p.imprimirDatos();
		
		/*do {//mostramos las diferentes opciones a escoger
            System.out.println("Opcion 1 : Agregar Funcionario");
            System.out.println("Opcion 2 : Agregar Bus");
            System.out.println("Opcion 3 : Mostrar Buses");
            System.out.println("Opcion 4 : Mostrar Pasajeros");
            System.out.println("Opcion 5 : Asignar o cambiar bus a pasajero bus a pasajero");
            System.out.println("Opcion 6 : Eliminar Bus");
            System.out.println("Opcion 7 : Eliminar Pasajero");
            System.out.println("Opcion 8 : Buscar numero de bus Pasajero");
            System.out.println("Opcion 9 : Buscar al pasajero más joven");
            System.out.println("Opcion 10 : Mostrar lista de pasajeros con asientos impares");
            System.out.println("Opcion 11 : Mostras lista de pasajeros con asientos pares");
            System.out.println("Opcion 12 : Cambiar Conductor de bus");
            System.out.println("Opcion 0 : Finalizar");
            opcion = Integer.parseInt(usuario.readLine());
            switch (opcion) {
                case 1 -> {//Agregar Funcionario
                	System.out.println("Ingrese el nombre del funcionario");
                	
                }
                case 2 -> {
                    for
                }
                case 3 -> {
                	
                }
                case 4 -> {
                	
                }
                case 0 ->
                        System.out.println("Bye <3");
                default -> System.out.println("Opcion ingresada no es valida");//pa los que no saben poner un numero
            }
        }while( opcion != 0 );//*/
		
	}

}
