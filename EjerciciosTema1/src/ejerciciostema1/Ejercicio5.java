package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//bloque de variables
		int a, b, c, x,y ;		//aqui se guardaran los numeros para realizar la formula
		//creamos el scanner y le pedimos los numero
		Scanner sc= new Scanner(System.in);
		System.out.print("introduzca el valor de a: ");
		a= sc.nextInt();
		System.out.print("introduzca el valor de b: ");
		b= sc.nextInt();
		System.out.print("introduzca el valor de c: ");
		c= sc.nextInt();
		System.out.print("introduzca el valor de x: ");
		x= sc.nextInt();
		// realizamos la operacion en la variable area y la mostramos al cliente
		y= (a*(x*x))+(b*x)+c;
		System.out.print("El valor de y es: "+ y );
		sc.close();
	}

}
