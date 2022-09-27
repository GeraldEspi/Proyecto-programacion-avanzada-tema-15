import java.io.*;


public class Main 
{
	public static void main(String[] args)throws IOException 
	{
		String linea, linea2;
		Gobierno gober = new Gobierno();
		Lector l = new Lector();
		BufferedReader LeerLinea = new BufferedReader(new InputStreamReader (System.in));
		int opcion, opcion2, opcion3;
		
		l.openFile("Ministerios");

		linea = l.firstLine();
		// Ciclo para crear los nodos del arreglo ministerios
		while(linea != null) 
		{
			gober.llenadoArray(linea);
			linea = l.nextLine();
		}	
		
		l.openFile("personas");
		
		linea = l.firstLine();
		// Ciclo para crear los nodos tipo personas y agregarlos al arraylist perteneciente al ministerio que pertenece la persona
		while(linea != null) 
		{
			gober.llenadoTablaMinisterio(linea);
			linea = l.nextLine();
		}
		
		do {//mostramos las diferentes opciones a escoger
            System.out.println("Opcion 1 : Agregar Funcionario");
            System.out.println("Opcion 2 : Listar");
            System.out.println("Opcion 3 : Buscar Funcionario");
            System.out.println("Opcion 0 : Para finalizar el programa");
            opcion = Integer.parseInt(LeerLinea.readLine());
            switch (opcion) {
                case 1 -> //Agregar Funcionario
                {
                	System.out.println("Ingrese los datos del funcionario con el formato");
                	System.out.println("claveFuncionario,Nombre,mail,ministerio,profesion,rut,sueldo en utm: \n");
                	linea= LeerLinea.readLine();
                	gober.llenadoTablaMinisterio(linea);
                	break;
                }
                case 2 -> //Listar Ministerios
                {
                	do 
                	{
                		System.out.println("Opcion 1 : Listar Ministerios Disponibles");
                        System.out.println("Opcion 2 : Listar Todos Funcionarios");
                        System.out.println("Opcion 3 : Listar Funcionarios de un ministerio");
                        System.out.println("Opcion 0 : Para salir de este menu");
                		opcion2 = Integer.parseInt(LeerLinea.readLine());
                		
                		switch(opcion2) 
                		{
                			case 1 ->
                			{
                				gober.listarMinisterios();
                				break;
                			}
                			case 2 ->
                			{
                				gober.listarTodosFuncio();
                				break;
                			}
                			case 3 ->
                			{
                				System.out.println("Ingrese el ministerio que desea listar");
                            	linea = LeerLinea.readLine();
                            	gober.listarFuncionariosMini(linea);
                				break;
                			}
                			case 0 ->
                			{
                				System.out.println("Cerrando menu listar");
                			}
                			default -> System.out.println("Opcion ingresada no es valida");
                		}
                		
                	}while(opcion2 != 0);
                	break;
                }
                case 3 -> 
                {
                	do 
                	{
                		System.out.println("Opcion 1 : Buscar por nombre y ministerio");
                        System.out.println("Opcion 2 : Buscar por rut y ministerio");
                        System.out.println("Opcion 0 : Para salir de este menu");
                		opcion2 = Integer.parseInt(LeerLinea.readLine());
                		switch(opcion2) 
                		{
                			case 1 ->
                			{
                				System.out.println("Ingrese el ministerio al que pertenece la persona");
                				linea2 = LeerLinea.readLine();
                				System.out.println("Ingrese el nombre del funcionario");
                				linea = LeerLinea.readLine();
                				Persona p = gober.buscarPersona(linea, linea2);
                				if(p == null) break;
                				do 
                				{
                					System.out.println("Opcion 1 : Editar datos del funcionario");
                                    System.out.println("Opcion 2 : Eliminar funcionario");
                                    System.out.println("Opcion 0 : Para salir de este menu");
                					opcion3 = Integer.parseInt(LeerLinea.readLine());
                					switch(opcion3) 
                					{
                						case 1 ->
                						{
                							System.out.println("a");
                						}
                						case 2 ->
                						{
                							p.imprimirDatos();
                							gober.eliminarFuncionario(p);
                							System.out.println("El funcionario ha sido eliminado");
                							break;
                							
                						}
                						case 0 ->
                						{
                							System.out.println("b");
                						}
                					}
                					
                				}while(opcion3 != 0);
                				break;
                			}
                			
                			case 2 ->
                			{
                				System.out.println("Ingrese el ministerio al que pertenece la persona");
                				linea2 = LeerLinea.readLine();
                				System.out.println("Ingrese el rut del funcionario");
                				linea = LeerLinea.readLine();
                				Persona p = gober.buscarPersona(linea, linea2);
                				if(p == null) break;
                				p.imprimirDatos();
                				
                				break;
                			}
                			
                			case 0 ->
                			{
                				System.out.println("Cerrando menu buscar");
                			}
                			default -> System.out.println("Opcion ingresada no es valida");
                			
                		}
                		
                	}while(opcion2 != 0);
                	
                }
                case 0 ->
                {
                        System.out.println("Bye <3");
                        break;
                }
                default -> System.out.println("Opcion ingresada no es valida");//pa los que no saben poner un numero
            }
        }while( opcion != 0 );
	}
}