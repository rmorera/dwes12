package controlDeFlujo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {


		/* 5) Preguntar al usuario un n�mero de mes (del 1 al 12)
		y preguntar si el a�o es bisiesto (s� o no).
		Escribir su n�mero de d�as. Si los datos no est�n bien introducidos 
		se volver�n a pedir. Utilizar estructura `switch`.*/

		int mes=0 ;
		String bisiesto;
		Scanner sc = new Scanner(System.in);
		
		while(mes<1 || mes>12){
			
			try{
				System.out.println("Introduce el n�mero de mes:");

				mes= sc.nextInt();
				System.out.println("Ha introducido el mes n�mero: "+mes);

				switch(mes){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println("Este mes tiene 31 d�as");
					break;

				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("Este mes tiene 30 d�as");
					break;

				case 2:
					
					do{
						sc=new Scanner(System.in);
						System.out.println("�El a�o es bisiesto? [si/no]");
						bisiesto=sc.nextLine().toLowerCase();
					}while(!(bisiesto.equals("si")) && !(bisiesto.equals("no")));

					if(bisiesto.equals("si"))
						System.out.println("Este mes tiene 29 d�as");

					else
						System.out.println("Este mes tiene 28 d�as");

					break;

				default: System.out.println("El n�mero de mes introducido no es v�lido");
				break;

				}
			}catch(InputMismatchException E){
				System.out.println("�ERROR! El valor introducido no es correcto");
				sc= new Scanner(System.in);
			}
		}
		sc.close();
	}
		
}
