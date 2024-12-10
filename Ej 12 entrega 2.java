package package001;

import java.util.Scanner;

public class EjercicioR12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del trabajador: ");
		String nom = scanner.nextLine();
		
		System.out.println("Ingrese el numero de horas trabajadas: ");
		double nht = scanner.nextDouble();
		
		System.out.println("Ingrese el valor de la hora de trabajo: ");
		double vhn = scanner.nextDouble();
		
		Trabajador trabajador = new Trabajador(nom, nht, vhn);
		
		double salarioTotal = trabajador.calcularSalario();
		System.out.println("El trabajador " + nom + " devengó: $"+ salarioTotal);
		
	}

}


//ahora aqui va la clase trabajador

package package001;

public class Trabajador {
	
	private String nom;		//nombre completo
	private double nht;		//numero de horas trabajadas
	private double vhn;		//valor de hora normal trabajada
	
							//HET: Horas extras trabajadas.
							//HEE8: Horas extras que exceden de 8.
							//SALARIO: Pago total que recibe el trabajador. 
	
	public Trabajador (String nom, double nht, double vhn) {
		this.nom = nom;
		this.nht = nht;
		this.vhn = vhn;	
	}
	
	public double calcularSalario() {
		
		double salario = 0;
		double het;
		
		if(nht > 40) {
			 het = nht - 40;
			
			if(het > 8) {
				double hee8 = het - 8;
				salario = (40 * vhn) + (8 * vhn * 2) + (hee8 * vhn * 3);
			}
			
			else{
				double pago_het = vhn * 2 * het;
				salario = vhn * 40 + pago_het;
			}		
		}
		else {
			salario = nht * vhn;
		}
		
		return salario;
	}	
	
	
	
	public String getNom() {
		return nom;
	}
	
	public double getNht() {
		return nht;
	}
	
	public double getVhn() {
		return vhn;
	}
		
}
