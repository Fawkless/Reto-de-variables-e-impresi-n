package Variables;

import java.util.Scanner;

public class ejercicio2 {

	 public static void main(String[] args) {
	        
		    Scanner datos=new Scanner(System.in);
	        String nombre, apellido;
	        int edad, estatura;
	        
	       


	        System.out.println("Ingrese su nombre");
	        nombre = datos.nextLine();
	        
	        System.out.println("Ingrese su apellido");
	        apellido = datos.nextLine();

	        System.out.println("Ingrese su edad");
	        edad = datos.nextInt();
	        
	        System.out.println("Ingrese su altura");
	        estatura = datos.nextInt();

	        System.out.println(nombre+ " "+ apellido +", gui"+edad+" años, "+ estatura + " cm");
	    }
		
	}


