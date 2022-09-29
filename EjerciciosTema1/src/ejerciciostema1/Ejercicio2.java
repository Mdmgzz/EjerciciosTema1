package ejerciciostema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//bloque de variables
		int numero; 					// variable que cogera el numero entero
		int op;							// aqui calculamos lo que le necesitamos sumar 
		// creamos el scanner e importamos el sisrtema US
		Scanner sc=new Scanner (System.in);								
		sc.useLocale(Locale.US);
		// solicitamos al usuario un numero entero
		System.out.print("Introduzca un numero entero: ");				//solicitamos el numero entero
		numero = sc.nextInt();											//leemos el nuemero entero 
		op =(7-numero%7);												//realizamos la operacion para saber cuanto hay que sumar
		op = op==7 ? 0 : op;											// indicamos que si el numero es 7 no haya que sumarle nada
		System.out.print("habrá que sumarle: "+op);						// mostramos el resultado
		sc.close();														//cerramos el scanner
	}

}
