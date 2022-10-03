package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// bloque de variables
		double milimetros;		//se guarda la distancia en mm
		double centimetros;		//se guarda la distancia en cm
		double metros;			//se guarda la distancia en m
		double op;				// aqui se realizara la operacion 
		// creamos el scanner y solicitamos al usuario las distancias
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca el nº de mm: ");
		milimetros= sc.nextDouble();
		System.out.print("Introduzca el nº de cm: ");
		centimetros= sc.nextDouble();
		System.out.print("Introduzca el nº de m: ");
		metros= sc.nextDouble();
		// vamos a pasar los valores a un denominador comun
		milimetros = milimetros /10;
		metros= metros*100;
		// ahora vamos a sumar las tres cantidades y las mostramos al cliente
		op= milimetros+centimetros+metros;
		System.out.print("Las tres distancias sumadas dan: "+op+(" cm"));
		sc.close();
		
	}

}
