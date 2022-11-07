package es.studium.ejercicio7;

import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un numero");
		num1 = teclado.nextInt();
		System.out.println("Dáme otro numero");
		num2 = teclado.nextInt();
		teclado.close();
		
		if (num1 == num2){
			System.out.println("Los dos numeros son iguales");
		} else {
			if (num1<num2){
				System.out.println("El primer numero es menor al segundo");
			} else {
				System.out.println("El primer numero es mayor al segundo");
			}
		}
	}
}
