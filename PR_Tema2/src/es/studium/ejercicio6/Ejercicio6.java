package es.studium.ejercicio6; //Programa pseudocodigo que lea dos numeros mediante una funcion calcule la divison de ambos

import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		int numerador;
		int denominador;
		double resultado; //Reales con Double
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un numerador");
		numerador = teclado.nextInt();
		System.out.println("Dáme un denominador");
		denominador = teclado.nextInt();
		teclado.close();
		resultado = dividir(numerador, denominador);
		System.out.println(resultado);
		
		
	}

	private static double dividir(int num, int den)
	{
		double r;       //Le damos valor a real
		r= (double) num/ (double) den;	//Variables, con (doubles hemos cambiado el entero a un real en esa sola operacion)
		return r;		//Lo que te devuelve
	}

	
	
	
	
}
