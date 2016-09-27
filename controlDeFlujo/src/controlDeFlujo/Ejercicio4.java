package controlDeFlujo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		/* Pedir al usuario un número del 1 al 10. 
		Si se equivoca o introduce un valor inválido (por ejemplo una letra), 
		se le volverá a solicitar que introduzca el número. */
		
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("Introduzca un número entre 1 y 10");
			try{
				num=sc.nextInt();
				if(num>10 || num<1){
					System.out.println("Fuera de Rango");
				}
			}
			
			catch(InputMismatchException e){
				System.out.println("El valor introducido no es un número entero");
				sc=new Scanner(System.in);
			}
			
		}while(num<1 || num>10);
		
		System.out.println("Fin");
		sc.close();
	}

}
