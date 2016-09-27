package controlDeFlujo;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String cadena,union="";
	
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<5; i++){
			
			System.out.println("introduzca una cadena de Strings");
			cadena=sc.nextLine();
			System.out.println("has introducido: "+ cadena);
			
			union=union+cadena;
		
		}
		
		System.out.println(union);
		sc.close();
	}

}
