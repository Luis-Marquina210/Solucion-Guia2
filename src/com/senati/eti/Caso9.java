package com.senati.eti;
import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Datos del Alumno");
		System.out.println("================");
		System.out.println("Nombre.........:");
		String nombre = sc.nextLine();
		System.out.println("Nota 1.........: ");
		int nota1 = sc.nextInt();
		System.out.println("Nota 2.........: ");
		int nota2 = sc.nextInt();
		System.out.println("Asistencia[1-12].........: ");
		float na = sc.nextFloat();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float pa = na / 12 * 100;
		
		String estado = "";
		
		if (promedio >= 13 && pa >= 70)
			estado = "Aprobado";
		else 
			estado = "Desaprobado";
		
		System.out.println("\nR E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Alumno.........: " + nombre);
        System.out.println("Promedio.......: " + promedio);
        System.out.println("Asistencia.....: " + pa + " %");
        System.out.println("Estado.......: " + estado);
        
		
	}

}
