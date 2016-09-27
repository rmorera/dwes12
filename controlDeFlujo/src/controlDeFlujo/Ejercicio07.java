package controlDeFlujo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		int num;
		double fact=1;

		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Introdzca un número entero:");
			num=sc.nextInt();

			//7.1 do-while
			
			do{

				if(num!=0){
					fact=fact*num;
					num--;
				}

			//7.2 while

			}while(num>0);

			System.out.println("Factorial con do while: "+fact);
			 

			while(num>0){
				fact=fact*num;
				num--;
			}

			System.out.println("Factorial con while: "+fact);
			
			//7.3 for
			
			for(int i=1; i<=num; i++){
				fact=fact*i;
			}

			System.out.println("Factorial con for: "+fact);
			sc.close();

		}catch(InputMismatchException E){
			System.out.println("Error debe introducir un Numero entero");
			Scanner sc=new Scanner(System.in);
		}
	}
}
