package Ejerciccios;

import java.util.Scanner;

public class Ejercicio_19 {
	public static void main(String[] args) {
		
		double perímetro, altura, area;
		int lado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la longitud de un lado :");
		lado = entrada.nextInt();
		
		area = (Math.pow(lado, 2)*Math.sqrt(3))/4;
		altura = (lado*Math.sqrt(3))/2;
		perímetro = 3*lado;
		
		System.out.println("Perimetro :" +perímetro);
		System.out.println("Altura :" +altura);
		System.out.println("Area :" +area);
	}
}
