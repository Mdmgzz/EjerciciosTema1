package ejerciciostema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//bloque de variables
		int numero; 					// variable que cogera el numero entero
		int numero2;					//creamos la 2 variable para que el entero sea divisible entre esta 
		int op;							// aqui calculamos lo que le necesitamos sumar 
		// creamos el scanner e importamos el sisrtema US
		Scanner sc=new Scanner (System.in);								
		sc.useLocale(Locale.US);
		// solicitamos al usuario un numero entero
		System.out.print("Introduzca un numero entero: ");				//solicitamos el numero entero
		numero = sc.nextInt();											//leemos el nuemero entero 
		System.out.print("Introduzca un divisor entero: ");				//solicitamos el numero entero
		numero2 = sc.nextInt();	
		op =(numero2-numero%numero2);									//realizamos la operacion para saber cuanto hay que sumar
		op = op==numero2 ? 0 : op;										//comprobamos que si es multiplo de 7 devuelva 0
		System.out.print("habrá que sumarle: "+op);						// mostramos el resultado
		sc.close();														//cerramos el scanner
	}

}
