package es.studium.ejercicio21;

import java.util.Scanner;

public class Ejercicio21
{									//Realizar un programa que lea tres números por teclado y nos diga si se tratan de los lados de un triángulo equilátero, escaleno o isósceles
									//escaleno= diferentes, tres lados iguales
									//isosceles= dos lados de igual , equilatero iguales.

	public static void main(String[] args)
	{
		int n1;
		int n2;
		int n3;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un numero");
		n1 = teclado.nextInt();
		System.out.println("Dáme otro numero");
		n2 = teclado.nextInt();
		System.out.println("Dáme otro numero");
		n3 = teclado.nextInt();
		teclado.close();
		
		if (n1 == n2 && n2 == n3){
		
			System.out.println("Este triangulo es equilatero.");
		} else if (n1 != n3 && n3 != n2 && n1 != n2)
		{
		  System.out.println("este triangulo es escaleno.");
		} else {
			System.out.println("Este triangulo es isosceles");
		}
	}
}
