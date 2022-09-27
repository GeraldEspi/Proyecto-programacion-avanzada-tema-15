

public class Persona 
{
  private int key;
  private String nombre;
  private String mail;
  private String ministerio;
  private String profesion;
  private int rut;
  private int sueldo;

  public Persona() {
    key = 0;
    nombre = "";
    mail = "";
    ministerio = "";
    profesion = "";
    rut = 0;
    sueldo = 0;
  }

  /*Funcion para generar un nodo de tipo persona mediante una linea de formato:
  	claveFuncionario,Nombre,mail,ministerio,profesion,rut,sueldo*/
  public boolean llenado(String linea) 
  {
    if (linea == null) {
      return false;
    }

    String[] datosLinea = linea.split(",");

    key = Integer.parseInt(datosLinea[0]);
    nombre = datosLinea[1];
    mail = datosLinea[2];
    ministerio = datosLinea[3];
    profesion = datosLinea[4];
    rut = Integer.parseInt(datosLinea[5]);
    sueldo = Integer.parseInt(datosLinea[6]);

    return true;

  }

  public void imprimirDatos() 
  {
		System.out.println("\n--------------------");
	    System.out.println("-key: " + key);
	    System.out.println("-Nombre: " + nombre);
	    System.out.println("-Mail: " + mail);
	    System.out.println("-Profesión: " + profesion);
	    System.out.println("-Rut: " + rut);
	    System.out.println("-Sueldo: " + sueldo + " UTM");
	    System.out.println("--------------------\n");
  }

  // Getters
  public Integer getsKey() {
    return key;
  }

  public String getsNombre() {
    return nombre;
  }

  public String getsMail() {
    return mail;
  }

  public String getsMinisterio() {
    return ministerio;
  }

  public String getsProfesion() {
    return profesion;
  }

  public int getsRut() {
    return rut;
  }

  public int getSueldo() {
    return sueldo;
  }

  // Setters

  public void setKey(Integer key) {
    this.key = key;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public void setCargo(String ministerio) {
    this.ministerio = ministerio;
  }

  public void setProfesion(String profesion) {
    this.profesion = profesion;
  }

  public void setRut(int rut) {
    this.rut = rut;
  }

  public void setSueldo(int sueldo) {
    this.sueldo = sueldo;

  }
  
  public boolean compararPersonas(String auxNombre) 
  {
	  if(nombre.equals(auxNombre))
	  {
		  return true;
	  }
	  
	  return false;
  }
}