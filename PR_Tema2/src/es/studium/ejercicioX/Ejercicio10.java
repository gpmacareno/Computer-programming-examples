package es.studium.ejercicioX;

import java.util.Scanner;

public class Ejercicio10
{

	public static void main(String[] args)
	{
		int a;
		int b;
		int i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("D�me un n�mero de veces para repetir un numero");
		a = teclado.nextInt();
		System.out.println("D�me un n�mero");
		b = teclado.nextInt();
		teclado.close();

		for (i=1; i<=a; i++){

			System.out.println(b);
		}
	}

}
