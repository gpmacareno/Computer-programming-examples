package es.studium.ejercicio9;

import java.util.Scanner;

public class Ejercicio9
{
	public static void main(String[] args)
	{
		int n1;
		int n2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("D�me un n�mero");
		n1 = teclado.nextInt();
		System.out.println("D�me otro n�mero");
		n2 = teclado.nextInt();
		teclado.close();
		
		if (n1<n2) {
			System.out.println("La suma de los numeros es " + (n1+n2));
		}
		else {
			System.out.println("La multiplicaci�n de los numeros "+ (n1*n2));
		}
	}
}
