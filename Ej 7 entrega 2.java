package package001;

import java.util.Scanner;

public class EjercicioR7 {
	public static void main(String[] args) {

		double a, b;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de a");
		a = scanner.nextDouble ();
		
		System.out.println("Ingrese el valor de b");
		b = scanner.nextDouble();
		
			if (a>b) {
				System.out.println(a + " es mayor que "+ b);
			}
			else if (a==b) {
				System.out.println(a + " es igual a "+ b);
			}
			else {
				System.out.println(a + " es menor que "+ b);
			}
		
		}
