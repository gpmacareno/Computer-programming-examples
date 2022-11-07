package es.studium.ejercicio8;

import java.util.Scanner;

public class Ejercicio8
{

	public static void main(String[] args)
	{
		int i;
		int b;
		int ex;
		int resultado = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme una base");
		b = teclado.nextInt();
		System.out.println("Dáme un exponente");
		ex = teclado.nextInt();
		teclado.close();
		
		for (i=1; i <= ex; i++) {
			resultado = resultado * b;
			
		}
		
		System.out.println("El resultado es " + resultado);
		
		
	}

}
