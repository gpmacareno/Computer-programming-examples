package es.estudium.ejercicio142;

import java.util.Scanner;

public class Ejercicio142
{

	public static void main(String[] args)
	{
		int base;
		int exponente;
		int resultado; 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme una base");
		base = teclado.nextInt();
		System.out.println("Dáme un exponente");
		exponente= teclado.nextInt();
		teclado.close();
		resultado = potencia(base, exponente);
		System.out.println("El resultado de la potencia es " + resultado);
		
		
	}

	private static int potencia(int base, int exponente)
	{

		int i, resultado = 1;
		for(i=1;i<=exponente;i++) {
			resultado=resultado*base;
		}
		return (resultado) ;
	}

}
