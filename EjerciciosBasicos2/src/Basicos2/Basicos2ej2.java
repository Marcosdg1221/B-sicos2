package Basicos2;

import java.lang.ProcessHandle.Info;
import java.util.Scanner;

public class Basicos2ej2 {

		public static void main(String[] args) {
			//Doy el scanner 
			Scanner all = new Scanner(System.in);
			//Creo la variable edad y el boolean Mayor edad (ME) y pregunto al usuario su edad.
			int edad;
			boolean ME;
			System.out.print("¿Qué edad tienes? ");
			edad = all.nextInt();
			//Lo que escriba el usuario será su valor.
			ME = edad > 17;
			//Si su edad es mayor a 18, devolverá true, si no, false.
			System.out.print("¿Eres mayor de edad? " + ME);
			}
	}