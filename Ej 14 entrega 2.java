package package001;

import java.util.Scanner;

public class EjercicioR14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese las ventas del departamento 1: ");
		double ventasD1 = scanner.nextDouble();
		
		System.out.println("Ingrese las ventas del departamento 2: ");
		double ventasD2 = scanner.nextDouble();
		
		System.out.println("Ingrese las ventas del departamento 3: ");
		double ventasD3 = scanner.nextDouble();
		
		System.out.println("Ingrese el valor del salario de los trabajadores: ");
		double salario = scanner.nextDouble();
		
		double totalVentas = ventasD1 + ventasD2 + ventasD3;
		
		double porceVentas = totalVentas * 0.33;
		
		double salario1;
		double salario2;
		double salario3;
		
			if(ventasD1 > porceVentas) {
				salario1 = salario + 0.2 * salario;
		}
			else {
				salario1 = salario;
			}
			
			if(ventasD2 > porceVentas) {
				salario2 = salario + 0.2 * salario;
		}
			else {
				salario2 = salario;
			}
			
			if(ventasD3 > porceVentas) {
				salario3 = salario + 0.2 * salario;
			}
			else {
				salario3 = salario;
			}
		
		System.out.println("Salario de los vendedores del departamento 1: $" + salario1);
		System.out.println("Salario de los vendedores del departamento 2: $" + salario2);
		System.out.println("Salario de los vendedores del departamento 3: $" + salario3);
	}

}
