package Basicos2;

import java.util.Scanner;

public class Basicos2ej3 {

		public static void main(String[] args) {
			//Doy el scanner 
			Scanner all = new Scanner(System.in);
			//Creo la variable numero, par y un boolean
			int numero;
			int par;
			boolean bol;
			//Pido al usuario que introduzca un número
			System.out.print("Introduce un número, se mostrará si es par o impar ");
			//Guarda el número
			numero = all.nextInt();
			//Hago una división entre dos donde guarda el resto
			par = numero %2;
			//Si el resto de la anterior operación es 0, entonces el número es par.
			bol = par == 0;
			//Muestro el resultado
			System.out.print("El numero es par " + bol);
			}
	}