package com.senati.eti;
import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer número....: ");
		int num1 = sc.nextInt();
		System.out.print("Segundo número....: ");
		int num2 = sc.nextInt();
		
		String resultado = "";
		
		if (num1 == num2)
			resultado = "Los número son iguales";
		else if (num1 > num2)
			resultado = "El primer número es el mayor";
		else
			resultado = "El segundo número es el mayor";
		
		System.out.println("\nR E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Respuesta.........: " + resultado);
		
		
		
	}

}
