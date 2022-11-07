package es.studium.ejercicio25;

import java.util.Scanner;

public class Ejercicio25
{

	public static void main(String[] args)
	{
		int yy;
		int xx;
		int y;
		int x;
		double m; 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un punto");
		x = teclado.nextInt();
		System.out.println("Dáme un punto");
		y= teclado.nextInt();
		System.out.println("Dáme un punto");
		xx= teclado.nextInt();
		System.out.println("Dáme un punto");
		yy= teclado.nextInt();
		teclado.close();
		m = pendiente(yy, xx, y, x);
		System.out.println("El resultado de la pendiente es " + m);

	}

	private static double pendiente(int yy, int xx, int y, int x)
	{
		double m;
		m = (double) ((double)(yy - y) / (double)(xx - x));
		return m;
	}

}
