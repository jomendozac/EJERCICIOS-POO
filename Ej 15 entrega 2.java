package package001;

import java.util.Scanner;

public class EjercicioR15 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ingrese el peso de la esfera A: ");
	double pesoA = scanner.nextDouble();
	
	System.out.println("Ingrese el peso de la esfera B: ");
	double pesoB = scanner.nextDouble();
		
	System.out.println("Ingrese el peso de la esfera C: ");
	double pesoC = scanner.nextDouble();	
		
	System.out.println("Ingrese el peso de la esfera D: ");
	double pesoD = scanner.nextDouble();
	
		if(pesoA == pesoB && pesoA == pesoC) {
			if(pesoD > pesoA) {
				System.out.println("La esfera D es la diferente y es de mayor peso");
			}
			else {
				System.out.println("La esfera D es la diferente y es de menor peso");
			}
		}
		else if(pesoA == pesoB && pesoA == pesoD) {
			if(pesoC > pesoA) {
				System.out.println("La esfera C es la diferente y es de mayor peso");
			}
			else {
				System.out.println("La esfera C es la diferente y es de menor peso");
			}
		}
		else if(pesoA == pesoC && pesoA == pesoD) {
			if(pesoB > pesoA) {
				System.out.println("La esfera B es la diferente y es de mayor peso");
			}
			else {
				System.out.println("La esfera B es la diferente y es de menor peso");
			}
		}
		else if(pesoB == pesoC && pesoB == pesoD){
			if(pesoA > pesoB) {
				System.out.println("La esfera A es la diferente y es de mayor peso");
			}
			else {
				System.out.println("La esfera A es la diferente y es de menor peso");
			}
		
		}
	
	}

}
