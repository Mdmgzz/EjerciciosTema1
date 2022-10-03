package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// bloque de variables
		int segundos,segundosintroducidos; //se guardaran los segundos introducidos
		int minutos,horas; // se guardaran las horas y los minutos que resulten esos segundos
		// creamos el scanner y solicitamos los segundos
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca la cantidad de segundos: ");
		segundosintroducidos=sc.nextInt();
		// calculamos la cantidad de minutos y horas que son esos segundos
		horas= segundosintroducidos/3600;
		minutos = horas/60;
		segundos = minutos/60;
		// mostgramos al cliente el resultado
		System.out.println(segundosintroducidos+" segundos son : ");
		System.out.println((int)horas+"horas");
		System.out.println((int) minutos+" minutos");
		System.out.println( segundos+" segundos");

	}

}
