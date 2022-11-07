package es.studium.ejercicioY;

import java.util.Scanner;

public class Ejercicio10
{

	public static void main(String[] args)
	{
		
		int a;
		int b;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un número");
		a = teclado.nextInt();
		System.out.println("Dáme un número de veces para repetir un numero");
		b = teclado.nextInt();
		teclado.close();

		while (b>0){     //Mientras que el numero a repetir sea mayor que 0 se producira el bucle.

			System.out.println(a);
			b = b -1;	//Cuenta atras para  que no sea un bucle infinito.
		}
		
	}

}
