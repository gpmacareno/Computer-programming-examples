package es.studium.ejercicio18;

import java.util.Scanner;

public class Ejercicio18
{

	public static void main(String[] args)
	{
		int numero1;
		int numero2;
		int resultado; 
		int resultado2;
		int resultado3;
		double resultado4;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un número");
		numero1 = teclado.nextInt();
		System.out.println("Dám otro número");
		numero2= teclado.nextInt();
		teclado.close();
		resultado = suma(numero1, numero2);
		System.out.println("El resultado de la suma es " + resultado+"\n");
		resultado2 = resta(numero1, numero2);
		System.out.println("El resultado de la resta es " + resultado2 + "\n");
		resultado3 = producto(numero1, numero2);
		System.out.println("El resultado del producto es " + resultado3 + "\n");	
		resultado4 = cociente(numero1, numero2);
		System.out.println("El resultado del cociente es " + resultado4 + "\n");	
		
	}

	private static double cociente(int numero1, int numero2)
	{
		double r;
		r= (double) numero1/ numero2;
		return r;
	}

	private static int producto(int numero1, int numero2)
	{
		int r;
		r= numero1 * numero2;
		return r;
	}

	private static int resta(int numero1, int numero2)
	{
		int r;
		r= numero1 - numero2; 
		return r;
	}

	private static int suma(int numero1, int numero2)
	{
		int r;
		r= numero1 + numero2;
		return r;
	}

}
