package es.studium.ejercicio13;
//Tabla Multiplicar- Realizar un programa que lea un número por teclado y escriba su tabla de multiplicar del 0 al 10.

import java.util.Scanner;

public class Ejercicio13
{
	public static void main(String[] args)
	{
		
	int num1;
	int i;
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Dáme un numero");
	num1 = teclado.nextInt();
	System.out.println("Tabla del " + num1);
	teclado.close();
	
	for (i = 0; i<=10; i++) {
		
		System.out.println(num1 + "*"+ i + "="+ num1*i);
	}
	
	}
}

