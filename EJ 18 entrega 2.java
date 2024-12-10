package Ejerciccios;

import java.util.Scanner;

public class Ejercicio_18 {
	public static void main(String[] args) {
		
		//codigo empleado, valor hora trabajada
		int ce, vh;
		//horas trabajadas al mes, porcentaje de retencion en la fuente
		float htm, prf;
		String nombres;
		
		Scanner entrada=new Scanner(System.in); 
		
		System.out.print("Ingrese el nombre del empleado: ");
		nombres = entrada.next();
		System.out.print("Codigo del empleado: ");
		ce = entrada.nextInt();
		System.out.print("Horas trabajadas al mes: ");
		htm = entrada.nextInt();
		System.out.print("Porcentaje de retencion de la fuente: ");
		prf = entrada.nextFloat();
		System.out.print("Ingrese el costo por hora de trabajo: ");
		vh = entrada.nextInt();
		
		float Salario_Bruto = htm*vh;
		float Salario_neto = Salario_Bruto - prf*Salario_Bruto/100;
		
		System.out.println();
		System.out.println("Codigo del empleado: "+ce);
		System.out.println("Nombre del empleado: "+nombres);
		System.out.println("Salario Bruto: " +Salario_Bruto);
		System.out.println("Salario Neto :" +Salario_neto);
	}
}
