package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// bloque de variables
		int infantiles,adultos;			// seran el nº de entradas que el cliente querrá
		double precio;					// importe total de las entradas
		double descuento;				// comprobaremos si el precio es superior a 100€ para aplicar el descuento				
		//creamos el scanner y solicitamos al cliente el numero de entradas
		Scanner sc=new Scanner(System.in);
		System.out.print("¿Cuantas entradas infantiles desea? ");
		infantiles= sc.nextInt();
		System.out.print("¿Cuantas entradas para adultos desea? ");
		adultos= sc.nextInt();
		//calculamos el precio total y si es superior a 100€ aplicamos el descuento del 5%
		precio= (infantiles*15.5)+(adultos*20);
		descuento= precio>=100 ? precio*0.05 : 0 ;
		precio = precio - descuento;
		// una vez hecho mostramos al cliente el importe total a pagar
		System.out.print("El importe total es de: "+ precio+"€");
		sc.close();
		
		

	}

}
