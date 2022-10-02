package clases;
import java.io.*;

public class Main 
{
	public static void main(String[] args)throws IOException 
	{
		Relaciones r = new Relaciones();
	
		r.inicioPrograma();
		
		
		/*presentarVentana();
		
		do {//mostramos las diferentes opciones a escoger
			System.out.println("Ingrese los datos del funcionario con el formato");
			
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
                				Funcionario funcio = gober.buscarPersona(linea, linea2);
                				if(funcio == null) break;
                				funcio.imprimirDatos();
                				do 
                				{
                					System.out.println("Opcion 1 : Editar datos del funcionario");
                                    System.out.println("Opcion 2 : Eliminar funcionario");
                                    System.out.println("Opcion 0 : Para salir de este menu");
                					opcion2 = Integer.parseInt(LeerLinea.readLine());
                					switch(opcion2) 
                					{
                						case 1 ->
                						{
                							do 
                							{
                								System.out.println("Opcion 1 : Modificar el nombre");
                                                System.out.println("Opcion 2 : Modificar el mail");
                                                System.out.println("Opcion 3 : Modificar el ministerio");
                                                System.out.println("Opcion 4 : Modificar la profesion");
                                                System.out.println("Opcion 5 : Modificar el rut");
                                                System.out.println("Opcion 6 : Modificar el sueldo ");
                                                System.out.println("Opcion 0 : Para salir al menu principal");
                                                opcion2 = Integer.parseInt(LeerLinea.readLine());
                                                switch(opcion2) 
                                                {
                                                	case 1 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo nombre");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setNombre(linea);
                                                		break;
                                                	}
                                                	case 2 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo mail");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setMail(linea);
                                                		break;
                                                	}
                                                	case 3 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo ministerio");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setMinisterio(linea);
                                                		break;
                                                	}
                                                	case 4 ->
                                                	{
                                                		System.out.println("Ingrese la nueva profesion");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setProfesion(linea);
                                                		break;
                                                	}
                                                	case 5 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo rut");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setRut(linea);
                                                		break;
                                                	}
                                                	case 6 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo sueldo");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setSueldo(linea);
                                                		break;
                                                	}
                                                	case 0 ->
                                                	{
                                                		System.out.println("Cerrando menu buscar");
                                                		break;
                                                	}
                                                }

                							}while(opcion2 != 0);
                							break;
                						}
                						case 2 ->
                						{
                							gober.eliminarFuncionario(funcio);
                							System.out.println("El funcionario ha sido eliminado");
                							break;
                							
                						}
                						case 0 ->
                						{
                							break;
                						}
                					}
                					
                				}while(opcion2 != 0);
                				break;
                			}
                			
                			case 2 ->
                			{
                				System.out.println("Ingrese el ministerio al que pertenece la persona");
                				linea2 = LeerLinea.readLine();
                				System.out.println("Ingrese el rut del funcionario");
                				linea = LeerLinea.readLine();
                				Funcionario funcio = gober.buscarPersona(Integer.parseInt(linea), linea2);
                				if(funcio == null) break;
                				funcio.imprimirDatos();
                				do 
                				{
                					System.out.println("Opcion 1 : Editar datos del funcionario");
                                    System.out.println("Opcion 2 : Eliminar funcionario");
                                    System.out.println("Opcion 0 : Para salir de este menu");
                					opcion2 = Integer.parseInt(LeerLinea.readLine());
                					switch(opcion2) 
                					{
                						case 1 ->
                						{
                							do 
                							{
                								System.out.println("Opcion 1 : Modificar el nombre");
                                                System.out.println("Opcion 2 : Modificar el mail");
                                                System.out.println("Opcion 3 : Modificar el ministerio");
                                                System.out.println("Opcion 4 : Modificar la profesion");
                                                System.out.println("Opcion 5 : Modificar el rut");
                                                System.out.println("Opcion 6 : Modificar el sueldo ");
                                                System.out.println("Opcion 0 : Para salir al menu principal");
                                                opcion2 = Integer.parseInt(LeerLinea.readLine());
                                                switch(opcion2) 
                                                {
                                                	case 1 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo nombre");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setNombre(linea);
                                                		break;
                                                	}
                                                	case 2 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo mail");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setMail(linea);
                                                		break;
                                                	}
                                                	case 3 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo ministerio");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setMinisterio(linea);
                                                		break;
                                                	}
                                                	case 4 ->
                                                	{
                                                		System.out.println("Ingrese la nueva profesion");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setProfesion(linea);
                                                		break;
                                                	}
                                                	case 5 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo rut");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setRut(linea);
                                                		break;
                                                	}
                                                	case 6 ->
                                                	{
                                                		System.out.println("Ingrese el nuevo sueldo");
                                                		linea = LeerLinea.readLine();
                                                		funcio.setSueldo(linea);
                                                		break;
                                                	}
                                                	case 0 ->
                                                	{
                                                		System.out.println("Cerrando menu buscar");
                                                		break;
                                                	}
                                                }

                							}while(opcion2 != 0);
                							break;
                						}
                						case 2 ->
                						{
                							gober.eliminarFuncionario(funcio);
                							System.out.println("El funcionario ha sido eliminado");
                							break;
                							
                						}
                						case 0 ->
                						{
                							System.out.println("Cerrando menu buscar");
                							break;
                						}
                					}
                					
                				}while(opcion2 != 0);
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
                case 4 ->
                {
                	do 
                	{
                		System.out.println("Opcion 1 : Listar con rango entre dos numero que ingrese");
                        System.out.println("Opcion 2 : Listar con rango de 0 al que ingrese");
                        System.out.println("Opcion 0 : Para salir al menu principal");
                        opcion2 = Integer.parseInt(LeerLinea.readLine());
                		switch(opcion2) 
                		{
                			case 1 ->
                			{
                				System.out.println("Ingrese el numero mas pequenyo del parametro");
                            	linea = LeerLinea.readLine();
                            	System.out.println("Ingrese el numero mas grande del parametro");
                            	linea2 = LeerLinea.readLine();
                            	ListaFuncionarios lista =gober.listaRango(Integer.parseInt(linea), Integer.parseInt(linea2));
                            	lista.mostrarFuncionarios();
                			}
                			case 2 ->
                			{
                				System.out.println("Ingrese el numero");
                            	linea = LeerLinea.readLine();
                            	ListaFuncionarios lista =gober.listaRango(Integer.parseInt(linea));
                            	lista.mostrarFuncionarios();
                            	break;
                			}
                			case 0 ->
                			{
                				System.out.println("Saliendo al menu principal");
                				break;
                			}
                		}
                		
                	}while(opcion2 != 0);
                }
                case 0 ->
                {
                		cerrarVentana();
                        break;
                }
                default -> System.out.println("Opcion ingresada no es valida");//pa los que no saben poner un numero
            }
        }while( opcion != 0 );*/
	}
}