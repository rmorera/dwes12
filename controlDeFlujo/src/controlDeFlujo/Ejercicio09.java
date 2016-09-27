package controlDeFlujo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		int n=0, acum, i, j, suma=0;
		Scanner sc=new Scanner(System.in);
		boolean primo=true, error=false;

		do{
			
			try{
				System.out.println("introduzca un número");
				n=sc.nextInt();
				error=false;
			}
			catch(InputMismatchException E){
				System.out.println("¡Error! El valor introducido no es válido");
				sc=new Scanner(System.in);
				error=true;
			}

		}while (n<=0 || error);

		acum=0;

		i=2;

		while (acum<n){

			j=2;

			primo=true;

			while (j<=i/2 && primo==true){

				if(i%j==0)

					primo=false;

				j=j+1;	

			}

			if(primo==true){

				System.out.println(i);

				acum=acum+1;

				suma=suma+i;

			}

			i=i+1;

		}

		System.out.println("La suma es "+suma);
		sc.close();

	}

}
