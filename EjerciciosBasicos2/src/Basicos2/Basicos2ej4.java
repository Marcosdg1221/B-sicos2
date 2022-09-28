package Basicos2;

import java.util.Scanner;

public class Basicos2ej4 {
	public static void main(String[] args) {
	Scanner all = new Scanner(System.in);
	//Creo las variables
	boolean salida1;
	boolean salida2;
	boolean biblio;
	boolean tareas;
	//Pregunto si no llueve, esperando una respuesta de true o false
	System.out.print("¿Actualmente no llueve? solo puedes responder con true o false");
	//Guarda el resultado
	boolean llueve = all.nextBoolean();
	//Pregunto si hay tareas, esperando una respuesta de true o false
	System.out.print("¿No tienes tareas? solo puedes responder con true o false");
	//Guarda el resultado
	tareas = all.nextBoolean();
	//Pregunto si hay que ir a la biblioteca, esperando una respuesta de true o false
	System.out.print("¿Vas a la biblioteca? solo puedes responder con true o false");
	//Guarda el resultado
	biblio = all.nextBoolean();
	//Hago una operación AND, solo si las dos condiciones son true, devolverá true
	salida1 = llueve && tareas;
	//Hago una operación OR, si una de las dos condiciones son true, devolverá true
	salida2 = salida1 | biblio;
	System.out.print("Puedes salir " + salida2);

}
}