package es.studium.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		
		int numero1, numero2, suma;
		Scanner teclado = new Scanner(System.in);     //Para leer el teclado
		System.out.println("D�me un n�mero");         // ESCRIBIR "D�me un n�mero"
		numero1 = teclado.nextInt();				  //LEER numero1
		System.out.println("D�me otro n�mero");
		numero2 = teclado.nextInt();
		teclado.close(); 							  //Para cerrar el teclado
		suma=numero1+numero2; 
		System.out.println("La suma es "+suma);
		
		
		

	}

}
