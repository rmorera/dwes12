package controlDeFlujo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*Basándote en la estructura `do-while`, diseña un menú de dos niveles, 
		es decir: en un primer momento se pedirá escoger entre varias opciones, 
		y en cada una de ellas se pedirá de nuevo escoger entre un nuevo conjunto. 
		La temática es libre (cálculo de áreas, enciclopedia, etc). Es importante 
		que tu programa reaccione correctamente ante entradas erróneas del usuario, 
		y que en todos los menús haya una opción para volver.

		Ten en cuenta que codificar un menú correctamente no es trivial, conviene 
		que pienses lo que vas a hacer antes de empezar a codificar.*/

		String jugador;
		int opcion = 0;
		Scanner sc=new Scanner(System.in);
		boolean error = false;

		do{
			System.out.println("Inscripción de jugadores:");
			System.out.println("1.-Futbol ");
			System.out.println("2.-Baloncesto ");
			System.out.println("3.- Fin");


			System.out.println();

			do{
				try{

					System.out.println("Eliga una opción:");
					opcion=sc.nextInt();
					error = false;

				}catch(InputMismatchException E){
					System.out.println("¡Error! El valor introducido no es válido");
					error = true;				
					sc=new Scanner(System.in);
				}

			}while(opcion<1 || opcion>3 || error);

			switch(opcion){
			case 1: 
				
				System.out.println("Ha inscrito al jugador en Futbol");
				int posicion=0;
				sc=new Scanner(System.in);

				System.out.println("1.-portero ");
				System.out.println("2.-defensa ");
				System.out.println("3.- medio");
				System.out.println("4.- delantero");

				do{
					try{

						System.out.println("Seleccione una posicion para el jugador:");
						posicion=sc.nextInt();
						error = false;

					}catch(InputMismatchException E){
						System.out.println("¡Error! El valor introducido no es válido");
						error = true;				
						sc=new Scanner(System.in);
					}

				}while(posicion<1 || posicion>4 || error);
				
				
				switch(posicion){
				case 1:
					System.out.println("Su jugador ha sido inscrito como portero");

					break;
				case 2:
					System.out.println("Su jugador ha sido inscrito como defensa");

					break;
				case 3:
					System.out.println("Su jugador ha sido inscrito como medio");

					break;
				case 4:
					System.out.println("Su jugador ha sido inscrito como delantero");

					break;
				}

				break;

			case 2:			
				System.out.println("Ha inscrito al jugador en Baloncesto");
				int posicionB=0;
				sc=new Scanner(System.in);

				System.out.println("1.-base ");
				System.out.println("2.-escolta ");
				System.out.println("3.- alero");
				System.out.println("4.- pivot");

				do{
					try{

						System.out.println("Seleccione una posicion para el jugador:");
						posicionB=sc.nextInt();
						error = false;

					}catch(InputMismatchException E){
						System.out.println("¡Error! El valor introducido no es válido");
						error = true;				
						sc=new Scanner(System.in);
					}

				}while(posicionB<1 || posicionB>4 || error);
				
				
				switch(posicionB){
				case 1:
					System.out.println("Su jugador ha sido inscrito como base");

					break;
				case 2:
					System.out.println("Su jugador ha sido inscrito como escolta");

					break;
				case 3:
					System.out.println("Su jugador ha sido inscrito como alero");

					break;
				case 4:
					System.out.println("Su jugador ha sido inscrito como pivot");

					break;
				}

				break;

			case 3: 
				System.out.println("Adios");

				break;


			}

		}while(opcion!=3);

		sc.close();
		
	}

}

