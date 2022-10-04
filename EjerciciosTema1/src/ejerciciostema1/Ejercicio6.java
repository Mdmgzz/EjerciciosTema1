package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// bloque de variables
		int segundosintroducidos; //se guardaran los segundos introducidos
		int minutos,horas; // se guardaran las horas y los minutos que resulten esos segundos
		int restoh,restom;
		// creamos el scanner y solicitamos los segundos
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca la cantidad de segundos: ");
		segundosintroducidos=sc.nextInt();
		// calculamos la cantidad de minutos y horas que son esos segundos
		horas= (segundosintroducidos/3600);
		restoh=segundosintroducidos%3600;
		minutos = (restoh/60);
		restom=restoh%60;
		// mostgramos al cliente el resultado
		System.out.println(segundosintroducidos+" segundos son : ");
		System.out.println((int)horas+"horas");
		System.out.println((int) minutos+" minutos");
		System.out.println( restom+" segundos");
		sc.close();
	}

}
