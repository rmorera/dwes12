package controlDeFlujo;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {


		/* Pedir al usuario dos números “a” y “b” entre el 1 y el 10. 
		 Mientras uno de ellos sea menor que el otro, escribir un símbolo “*” 
		 en la pantalla e incrementar en una unidad el número menor. */

		int a, b;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("Introduzca el primer número entre 1 y 10:");
			a= sc.nextInt();
			sc= new Scanner(System.in);
			System.out.println("ha introducido: " +a);
		}while(a<1 || a>10);

		do{
			System.out.println("Introduzca el segundo número entre 1 y 10:");
			b= sc.nextInt();
			System.out.println("ha introducido: " +b);
		}while (b<1 || b>10);
		
		do{
			
			if (a==b){
				System.out.println("los dos numeros son iguales");
			}
			else{
				System.out.println("*");
				if(a<b)
					a++;
				else
					b++;
			}
			
		}
		while(a!=b);
		sc.close();

	}

}
