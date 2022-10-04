package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//bloque de variables
		double metros;					// la distancia inicial en m 
		double centimetrosfinales;		//sera el resultado final del lanzamiento
		
		//creamos el scanner y el solicitamos al cliente la cantidad de m lanzados
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca la distacia del lanzamiento en m");
		metros=sc.nextDouble();
		centimetrosfinales=metros*100;
		// una vez pasado los m a cm mostramos al cliente su lanzamiento en numeros enteros
		System.out.print("Su lanzamiento ha sido de: "+(int)centimetrosfinales+"cm");
		sc.close();
	}

}
