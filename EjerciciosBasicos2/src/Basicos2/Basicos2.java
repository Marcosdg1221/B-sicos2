package Basicos2;

import java.util.*;

public class Basicos2 {

	public static void main(String[] args) {
		//Doy el scanner 
		Scanner all = new Scanner(System.in);
		//Creo las variables de peras y manzanas, junto a sus precios
		final double pm = 2.35;
		final double pp = 1.85;
		double manzanas;
		double peras;
		double total; 
		System.out.print("¿Cuantos kg de manzanas se ha vendido este trimestre? ");
		//Pregunto al usuario los kg de manzana y pera
		manzanas= all.nextDouble();
		System.out.print("¿Cuantos kg de peras se ha vendido este trimestre? ");
		peras= all.nextDouble();
		//Lo que ponga el usuario será el valor de las manzanas y peras
		total = manzanas*pm + peras*pp;
		//Muestro el resultado.
		System.out.println("la cuenta final es " + total);
}	
}	
