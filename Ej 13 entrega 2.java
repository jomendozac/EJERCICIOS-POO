package package001;

import java.util.Scanner;

public class EjercicioR13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la compra: ");
		double valComp = scanner.nextDouble();
		
		System.out.println("Ingrese el color de la bolita (blanca, verde, amarilla, azul o roja): ");
		String color = scanner.next().toLowerCase();
		
		double pdes;
		
		if(color.equals("blanca")) {
			pdes = 0;
		}
		else if(color.equals("verde")) {
			pdes = 10;
		}
		else if(color.equals("amarila")) {
			pdes = 25;
		}
		else if(color.equals("azul")) {
			pdes = 50;
		}
		else {
			pdes = 100;
		}
		
		double valPag = valComp - (pdes * valComp/100);
		
		System.out.println("El cliente debe pagar: $" + valPag);
		
	}

}
