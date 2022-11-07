package es.studium.ejercicio26;

import java.util.Scanner;

public class Ejercicio26
{

	public static void main(String[] args)
	{
		int hoy;
		hoy = 2030;
		int nacimiento;
		String nombre;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime tu nombre"); 
		nombre = teclado.nextLine();
		System.out.println("Dime tu año de nacimiento");
		nacimiento = teclado.nextInt();
		teclado.close();
		System.out.println("Tu nombre es " + nombre + " " + " y en el año 2030 tendras " + (hoy - nacimiento) + " " + "años.");
		
		
	}

}
