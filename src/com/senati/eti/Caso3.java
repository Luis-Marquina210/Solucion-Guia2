package com.senati.eti;
import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer n�mero....: ");
		int num1 = sc.nextInt();
		System.out.print("Segundo n�mero....: ");
		int num2 = sc.nextInt();
		
		String resultado = "";
		
		if (num1 == num2)
			resultado = "Los n�mero son iguales";
		else if (num1 > num2)
			resultado = "El primer n�mero es el mayor";
		else
			resultado = "El segundo n�mero es el mayor";
		
		System.out.println("\nR E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Respuesta.........: " + resultado);
		
		
		
	}

}
