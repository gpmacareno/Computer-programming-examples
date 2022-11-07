package es.studium.ejercicio3;

import java.util.Scanner;

//Par – Impar – Realizar un programa en PSEUDOCÓDIGO que lea un número y nos diga si el número es par o si es impar

public class Ejercicio3
{

	public static void main(String[] args)		
	
	{
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero"); 
		numero = teclado.nextInt();
		teclado.close();
		if(numero%2==0) {		
			System.out.println("El numero es PAR");
		}
		else {   //SINO
			System.out.println("El numero es IMPAR");
		}
		
	}

}
