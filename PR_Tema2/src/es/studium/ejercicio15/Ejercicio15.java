package es.studium.ejercicio15;

import java.util.Scanner;

public class Ejercicio15
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		int numero1 = 0;
		String mes = ""; // guardamos otra variable como cadena string

		System.out.println("Introduzca un numero");
		numero1 = teclado.nextInt();

		switch (numero1)
		{ // va cambiando entre casos

		case 1:
			mes = "Enero";
			break; // Break rompe el ciclo, no se ejecutara mas.

		case 2:
			mes = "Febrero";
			break;

		case 3:
			mes = "Marzo";
			break;

		case 4:
			mes = "Abril";
			break;

		case 5:
			mes = "Mayo";
			break;

		case 6:
			mes = "Junio";
			break;

		case 7:
			mes = "Julio";
			break;

		case 8:
			mes = "Agosto";
			break;

		case 9:
			mes = "Septiembre";
			break;

		case 10:
			mes = "Octubre";
			break;

		case 11:
			mes = "Noviembre";
			break;

		case 12:
			mes = "Diciembre";
			break;
		default:
			mes = "inexistente";
			break;
		}
					
		System.out.println("Este mes es " + mes);
		teclado.close();
	}
}
