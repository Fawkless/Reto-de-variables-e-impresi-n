package Variables;


import java.util.Scanner;

public class ejercicio1{

	 public static void main(String[] args) {
	        
		    Scanner datos=new Scanner(System.in);
	        String nombre, apellido;
	       


	        System.out.println("Ingrese su nombre");
	        nombre = datos.nextLine();
	        
	        System.out.println("Ingrese su apellido");
	        apellido = datos.nextLine();

	        System.out.println(nombre+" "+apellido);

	    }
	}



