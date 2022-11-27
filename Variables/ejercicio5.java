package Variables;

import java.util.Scanner;

public class ejercicio5 {
	
	public static void main(String[] args) {

	Scanner datos=new Scanner(System.in);
	
    String  nombreMascota, tipoMascota, nombre, apellido;
    int edadMascota;
    
    System.out.println("Ingrese su nombre");
    nombre = datos.nextLine();
    
    System.out.println("Ingrese su apellido");
    apellido = datos.nextLine();   
    
    System.out.println("Ingrese el nombre de su mascota");
    nombreMascota = datos.nextLine();
    
    System.out.println("Ingrese el tipo de mascota que tiene");
    tipoMascota = datos.nextLine();
    
    System.out.println("Ingrese la edad de su mascota");
    edadMascota = datos.nextInt();
    
    
    
    
    
  
   
    
    System.out.println(nombreMascota+ " es un(a) "+ tipoMascota + " el cual, tiene "+ edadMascota+ " años y "+ nombre + " " +apellido+ " es actualmente su dueño(a)" );


}
}
	    
	