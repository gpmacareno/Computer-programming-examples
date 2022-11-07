package es.studium.ejercicio24;

public class Ejercicio24
{
	// Cuadrados Pares- Realizar un programa que muestre por pantalla la suma de los
	// cuadrados de los pares entre 1 y 100 mediante una función. Par x%2==0 es uno
	// menos.
	public static void main(String[] args)
	{
		int r;

		r = sumacuadrado();

		System.out.println("La suma de los 100 primeros nº naturales pares es " + r);

	}

	private static int sumacuadrado()
	{

		int i, r = 0;
		for (i = 1; i <= 100; i++)
		{
			if (i % 2 == 0)
			{

				r = (i * i + r);
			}
		}
		return r;
	}

}
