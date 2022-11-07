package es.studium.ejercicio19;

import java.util.Scanner;

public class Ejercicio19
{

	public static void main(String[] args)
	{

		int numero1;
		int numero2;
		int numero3;
		int resultado; 
		int resultado2;
		double resultado3;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un número");
		numero1 = teclado.nextInt();
		System.out.println("Dáme un otro número");
		numero2= teclado.nextInt();
		System.out.println("Dáme un tercer número");
		numero3= teclado.nextInt();
		teclado.close();
		resultado = suma(numero1, numero2, numero3);
		System.out.println("El resultado de la suma es " + resultado +"\n");
		resultado2 = producto(numero1, numero2, numero3);
		System.out.println("El resultado de la resta es " + resultado2 + "\n");
		resultado3 = media(numero1, numero2, numero3);
		System.out.println("El resultado de la media " + resultado3 + "\n");	
		
	}

	private static double media(int numero1, int numero2, int numero3)
	{
		double r;
		r= (double) (numero1+numero2+numero3)/ 3;
		return r;
	}

	private static int producto(int numero1, int numero2, int numero3)
	{
		int r;
		r= numero1 * numero2 * numero3;
		return r;
	}

	private static int suma(int numero1, int numero2, int numero3)
	{
	
		int r;
		r= numero1 + numero2+ numero3;
		return r;
	
	}

}
