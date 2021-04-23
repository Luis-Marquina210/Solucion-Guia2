package com.senati.eti;
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número....: ");
		int num = sc.nextInt();
		
		
		if (num % 2 == 0)
			System.out.println("El número "+ num + " es par");
		else
			System.out.println("El número "+ num + " es impar");
		
		
		
		
		
	}

}
