package controlDeFlujo;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
			
		String dia;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un d�a de la semana");
		
		dia=sc.nextLine().toLowerCase();
		System.out.println("Has introducido "+dia);
		
		sc.close();
		
		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Laborable");
			break;
			
		case "sabado":
		case "domingo":
			System.out.println("No Laborable");
			break;

		default:
			System.out.println("El d�a introducido no es v�lido");
			break;
		}

	}

}
