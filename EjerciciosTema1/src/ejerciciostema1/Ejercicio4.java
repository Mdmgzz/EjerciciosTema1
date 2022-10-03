package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//bloque de variables
		double base;			//servira para guardar la base del triangulo
		double altura;			//se guardara la altura del triangulo
		double area;			//se guardara el resultado de la operacion
		//creamos el scanner y le pedimos la base  y la altura
		Scanner sc= new Scanner(System.in);
		System.out.print("introduzca la base: ");
		base= sc.nextDouble();
		System.out.print("introduzca la altura: ");
		altura= sc.nextDouble();
		// realizamos la operacion en la variable area y la mostramos al cliente
		area= base*altura/2;
		System.out.print("El area del triangulo es de: "+ area + "cm");
		sc.close();
		
	}

}
