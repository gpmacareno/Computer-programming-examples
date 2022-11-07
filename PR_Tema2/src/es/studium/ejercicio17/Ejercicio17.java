package es.studium.ejercicio17;

import java.util.Scanner;

public class Ejercicio17
{

	public static void main(String[] args)
	{
		// Realizar un programa que lea tres números enteros y los ordene de mayor a
		// menor.
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

		if (n1 > n2 && n2 > n3)
		{

			System.out.println(n1 + " " + n2 + " " + n3);

		} else if (n1 >= n3 && n3 >= n2)
		{

			System.out.println(n1 + " " + n3 + " " + n2);

		} else if (n2 >= n1 && n1 >= n3) // Excluyente
		{
			System.out.println(n2 + " " + n1 + " " + n3);

		} else if (n2 >= n3 && n3 >= n1)
		{
			System.out.println(n2 + " " + n3 + " " + n1);

		} else if (n3 >= n1 && n1 >= n2)
		{
			System.out.println(n3 + " " + n1 + " " + n2);

		} else if (n3 >= n2 && n2 >= n1)
			
		{
			System.out.println(n3 + " " + n2 + " " + n1);
		}

	}
}
