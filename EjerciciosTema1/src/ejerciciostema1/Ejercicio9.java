package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Bloque de variables
		int numero1,numero2;		//guardaremos los numeros introducidos para luego compararlos
		boolean comprobacion;		//decidimos si los numero son iguales o no 
		// creamos el scanner y comprobamos solicitamos al usuario
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca el primer numero: ");
		numero1= sc.nextInt();
		System.out.print("Introduzca el segundo numero: " );
		numero2= sc.nextInt();
		//comprobamos si los dos numeros son iguales
		comprobacion= numero1==numero2 ;
		//mostramos si los numeros son iguales
		System.out.print("?Los numeros son iguales? "+comprobacion);
		sc.close();
		
	}

}
