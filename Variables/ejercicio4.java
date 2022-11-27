package Variables;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		   
		    Scanner datos=new Scanner(System.in);
	        String ciudad, pais;
	       


	        System.out.println("Ingrese el nombre de la ciudad");
	        ciudad = datos.nextLine();
	        
	        System.out.println("Ingrese el nombre del pais");
	        pais = datos.nextLine();

	        System.out.println("La ciudad " +ciudad+" "+ "es la capital de "+pais);

	    

	}

}
