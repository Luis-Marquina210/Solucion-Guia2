package com.senati.eti;
import java.util.Scanner;
public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Datos DEL EMPLEADO");
		System.out.print("\n================");
		System.out.print("\nNombre.............:");
		String nombre = sc.nextLine();
		System.out.print("\nNivel[1-4].........: ");
		int nivel = sc.nextInt();
		System.out.print("\nIngrese sueldo.....: ");
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		
		switch (nivel) {
		case 1:
			incremento = 0.045f;
			break;
		case 2:
			incremento = 0.06f;
			break;
		case 3:
			incremento = 0.085f;
			break;
		case 4:
			incremento = 0.11f;
			break;
		default:
			incremento = 0f;
		
		}
		
		System.out.println("\n-----------------------");
		System.out.println("R E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Empleado.............: " + nombre);
        System.out.println("Nivel................: " + nivel);
        System.out.println("Incremento...........: " + (incremento* 100) + " %");
		System.out.println("Nuevo Sueldo.........: " + (sueldo + (sueldo * incremento)));
		
		
		
		
		
	}

}
