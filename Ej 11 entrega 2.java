package package001;

import java.util.Scanner;

public class EjercicioR11 {

	public double comparacion(double n1, double n2, double n3) {
		double mayor;
		
		if (n1 > n2 && n1 > n3) {
		 mayor = n1;
		}	
		else if (n2 > n3) { 
		 mayor = n2;
		}
		else {
		 mayor = n3;
		}
	return mayor;
	}
	
	 public static void main(String[] args) {
	     EjercicioR11 comparador = new EjercicioR11();
	     
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el primer número: ");
	        double n1 = scanner.nextDouble();
	        
	        System.out.print("Ingrese el segundo número: ");
	        double n2 = scanner.nextDouble();
	        
	        System.out.print("Ingrese el tercer número: ");
	        double n3 = scanner.nextDouble();
	        
	        double mayor = comparador.comparacion(n1, n2, n3);
	        System.out.println("El número mayor entre: "+n1+", "+n2+" y "+n3+" es: "+ mayor);
	           
	        scanner.close();
	    }
}
