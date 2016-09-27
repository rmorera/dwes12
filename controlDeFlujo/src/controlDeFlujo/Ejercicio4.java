package controlDeFlujo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		/* Pedir al usuario un n�mero del 1 al 10. 
		Si se equivoca o introduce un valor inv�lido (por ejemplo una letra), 
		se le volver� a solicitar que introduzca el n�mero. */
		
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("Introduzca un n�mero entre 1 y 10");
			try{
				num=sc.nextInt();
				if(num>10 || num<1){
					System.out.println("Fuera de Rango");
				}
			}
			
			catch(InputMismatchException e){
				System.out.println("El valor introducido no es un n�mero entero");
				sc=new Scanner(System.in);
			}
			
		}while(num<1 || num>10);
		
		System.out.println("Fin");
		sc.close();
	}

}
