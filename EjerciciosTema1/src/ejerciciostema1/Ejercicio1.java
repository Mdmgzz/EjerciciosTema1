package ejerciciostema1;

import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {

	public static void main(String[] args) {
		// bloque de variables
		double numero; 													// varible para recoger el numero
		// solicitamos el numero al cliente y lo leemos
		Scanner sc=new Scanner (System.in);								//creamos el scanner
		sc.useLocale(Locale.US);										//utilizamos el sistema de US para no poner los decimales con comas
		System.out.print("Introduzca un número con decimales: ");		//preguntamos al cliente por un numero en decimal
		numero = sc.nextDouble();										//leemos el numero
		numero = (int)(numero + 0.5);									//le sumamos 0,5 al numero introducido  y lo truncamos
		System.out.print("El numero escrito redondeado es : "+ numero );// mostramos el resultado 
		
		sc.close();														//cerramos el scanner
	}

}
