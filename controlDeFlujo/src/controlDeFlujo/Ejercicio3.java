package controlDeFlujo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		//Ir pidiendo por teclado una serie de números enteros e irlos sumando.
		//Se deja de pedir números al usuario cuando la cantidad supera el valor 50. 
		//Escribir por pantalla la suma de todos los números introducidos.

		int num,sum=0;

		Scanner sc= new Scanner(System.in);
		while(sum<50){
			System.out.println("Introduzca un número entero");
			try
			{
				num=sc.nextInt();

				System.out.println("has introducido "+num);

				sum=sum+num;

				System.out.println("la suma es " +sum);

			}
			
			
			
			catch(InputMismatchException e){
				System.out.println("El valor introducido no es un número entero");
				sc=new Scanner(System.in);
			}
		}

		System.out.println("Fin");
		sc.close();

	}

}
