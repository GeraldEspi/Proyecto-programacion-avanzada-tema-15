import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException {
    Ministerio obj = new Ministerio();
    int pLibre = 0;
    Ministerio[] arr = new Ministerio[15];
    int opcion;
    BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    do
    {
      System.out.println("Menu \n 1. Para agregar empleado.\n  2. Para mostrar los ministerios. \n 3. Para mostrar los empleados de un ministerio. \n 4. Para buscar por rut. \n 0. para salir.");

      opcion = Integer.parseInt(lector.readLine());
      
    }while(opcion != 0);

    opcion = Integer.parseInt(lector.readLine());

    switch (opcion) {
      case 1:
        
        break;
      case 2:
        while (i < pLibre) {

        }

      case 3:
        break;
    }

  }
}