package es.studium.ejercicio16;

import java.util.Scanner;

public class ejercicio16
{

	public static void main(String[] args)
	{

		int a;
		int b;
		int c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("D�me un numero");
		a = teclado.nextInt();
		System.out.println("D�me otro numero");
		b = teclado.nextInt();
		System.out.println("D�me otro numero");
		c = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de la expresi�n es: "+ expresion (a,b,c));

	}

	public static float expresion(int a, int b, int c)
	{
		
		return (((((float)b*(float)b)-(4*(float)a*(float)c))/(2*(float)a)));
	
	}

}
