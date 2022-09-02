import java.io.*;
//import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)throws IOException 
	{
		String linea;
		Gobierno gober = new Gobierno();
		Lector l = new Lector();
		BufferedReader LeerLinea = new BufferedReader(new InputStreamReader (System.in));
		int opcion;
		
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
            System.out.println("Opcion 2 : Listar Ministerios Disponibles");
            System.out.println("Opcion 3 : Listar Todos Funcionarios");
            System.out.println("Opcion 4 : Listar Funcionarios de un ministerio");
            System.out.println("Opcion 0 : Para finalizar el programa");
            opcion = Integer.parseInt(LeerLinea.readLine());
            switch (opcion) {
                case 1 -> //Agregar Funcionario
                {
                	System.out.println("Ingrese los datos del funcionario con el formato");
                	System.out.println("claveFuncionario,Nombre,mail,ministerio,profesion,rut,sueldo en utm: \n");
                	linea= LeerLinea.readLine();
                	gober.llenadoTablaMinisterio(linea);	
                }
                case 2 -> //Listar Ministerios
                {
                	gober.listarMinisterios();
                }
                case 3 -> //Listar todos los funcionarios
                {
                	gober.listarTodosFuncio();
                }
                case 4 -> //Listar los funcionarios pertenecientes a un ministerio
                {
                	System.out.println("Ingrese el ministerio que desea listar");
                	linea = LeerLinea.readLine();
                	gober.listarFuncionariosMini(linea);
                	
                }
                case 0 ->
                        System.out.println("Bye <3");
                default -> System.out.println("Opcion ingresada no es valida");//pa los que no saben poner un numero
            }
        }while( opcion != 0 );
	}
}
