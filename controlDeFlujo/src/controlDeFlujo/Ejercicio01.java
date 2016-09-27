package controlDeFlujo;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
			
		String dia;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un día de la semana");
		
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
			System.out.println("El día introducido no es válido");
			break;
		}

	}

}
