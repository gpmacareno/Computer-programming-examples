package es.studium.ejercicio22;

import java.util.Scanner;

public class Ejercicio22{	
	public static void main(String[] args)
	{
	int a,b,c,d,e,resultado;
	// double resultado;
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduce 1ºdigito:");
	a=teclado.nextInt();
	System.out.println("Introduce 2ºdigito:");
	b=teclado.nextInt();
	System.out.println("Introduce 3ºdigito:");
	c=teclado.nextInt();
	System.out.println("Introduce 4ºdigito:");
	d=teclado.nextInt();
	System.out.println("Introduce 5ºdigito:");
	e=teclado.nextInt();
	teclado.close();
	// resultado=(a*Math.pow(2.00, 4.00))+(b*Math.pow(2.00, 3.00))+(c*Math.pow(2.00, 2.00))+(d*Math.pow(2.00, 1.00))+(e*Math.pow(2.00, 0.00));
	// System.out.println("El numero en decimal: "+ resultado);
	resultado=((a*potencia(4))+(b*potencia(3))+(c*potencia(2))+(d*potencia(1))+(e*potencia(0)));
	System.out.println("El numero en decimal: "+ resultado);
	}

	private static int potencia(int i)
	{
	int r=1;
	for (int j = 1; j <=i; j++)
	{
	r=r*2;
	}
	return r;
	}

	}
	
	
	
	
	

