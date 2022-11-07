package es.studium.ejercicio12;

import java.util.Scanner;

public class Ejercicio12
{

	public static void main(String[] args)
	{

		int numero1;
		int numero2;
		int resultado; 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un numero");
		numero1 = teclado.nextInt();
		System.out.println("Dáme un segundo numero");
		numero2= teclado.nextInt();
		teclado.close();
		resultado = suma(numero1, numero2);
		System.out.println(resultado);
		
	}

	private static int suma(int numero1, int numero2)
	{
		int r;
		r=numero1+numero2;
		return r;
	}

}
