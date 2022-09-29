package Basicos2;

import java.util.Scanner;

public class Basicos2ej5 {
	public static void main(String[] args) {
		//Doy el scanner 
		Scanner all = new Scanner(System.in);
		//Creo las variables
		final int a, b, c;
		double media2;
		int media1;
		//Lo que escriba el usuario en las siguientes preguntas serán las notas.
		System.out.print("¿Cuanta nota sacaste en el primer trimestre?");
		a = all.nextInt();
		System.out.print("¿Cuanta nota sacaste en el segundo trimestre?");
		b = all.nextInt();
		System.out.print("¿Cuanta nota sacaste en el tercer trimestre?");
		c = all.nextInt();
		//Muestro el resultado convirtiendo el del boletín en int y el del expediente en double
		media1= (int) ((a + b + c)/3);
		media2= (double) ((a+b+c)/3);
		System.out.print("Tu media en el boletín es " + media1);
		System.out.print(" Y tu media en el expediente es " +media2);
		}
}
