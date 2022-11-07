package es.studium.ejercicio11;

import java.util.Scanner;

public class Ejercicio11
{

	public static void main(String[] args)
	{
		
		int num1;
		int num2;
		int auxiliar;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero");
		num2 = teclado.nextInt();
		teclado.close();
	
		
		auxiliar=num1;
		num1=num2;
		num2=auxiliar;
		
		System.out.println("El nuevo valor del primer numero es "+num1);
		System.out.println("El nuevo valor del segundo numero es "+num2);
		
		 
		
	}

}
