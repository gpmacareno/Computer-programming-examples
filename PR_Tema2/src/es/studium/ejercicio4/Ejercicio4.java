package es.studium.ejercicio4;

import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	{
		
		int n1, n2, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dáme un número");
		n1 = teclado.nextInt();
		System.out.println("Dáme otro número");
		n2 = teclado.nextInt();
		teclado.close();
		for(i=n1; i<=n2; i++) {       //1º iteracion es igual al primer numero, luego si el segundo numero es menor al primero entonces me saca los pares en un bucle. Incremento 1
			
			if(i%2==0) {				//i+=3 para aumentar la iteración 
				System.out.println(i);
			}
		}
		

	}

}
