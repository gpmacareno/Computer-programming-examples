package es.studium.ejercicio23;

public class Ejercicio23
{								//Realizar un programa que calcule la suma de los cuadrados de los
								//100 primeros n�meros naturales mediante una funci�n.

	public static void main(String[] args)
	{
		
		int r;
			
			r=sumacuadrado();
			
			System.out.println("La suma de los 100 primeros n� naturales es " + r);
		
	}

private static int sumacuadrado()
{

	int i, r=0;
	for (i=1; i<=100; i++) {
		r=(i*i+r);
	}
	return r;
}
}
