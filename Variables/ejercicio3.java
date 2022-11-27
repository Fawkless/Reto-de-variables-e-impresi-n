package Variables;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
        
		Scanner datos=new Scanner(System.in);
        String nombre, apellido, nombrePadre, apellidoPadre, nombreMadre, apellidoMadre;
        
        
        
       


        System.out.println("Ingrese su nombre");
        nombre = datos.nextLine();
        
        System.out.println("Ingrese su apellido");
        apellido = datos.nextLine();
        
        System.out.println("Ingrese el nombre de su padre");
        nombrePadre = datos.nextLine();
        
        System.out.println("Ingrese el apellido de su padre");
        apellidoPadre = datos.nextLine();
        
        System.out.println("Ingrese el nombre de su madre");
        nombreMadre = datos.nextLine();
        
        System.out.println("Ingrese el apellido de su madre");
        apellidoMadre = datos.nextLine();
        
        System.out.println("Yo "+ nombre + " " + apellido+ ", soy hijo de "+ nombreMadre +" "+ apellidoMadre +" y " + nombrePadre + " " + apellidoPadre);

       

       
    }
}
		