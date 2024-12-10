package package001;

import java.util.Scanner;

public class EjercicioR10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el número de inscripción: ");
		int ni = scanner.nextInt();
		
			scanner.nextLine(); 
			
		System.out.print("Ingrese el nombre completo del estudiante: ");
		String nom = scanner.nextLine();
			
		System.out.print("Ingrese el patrimonio del estudiante: ");
		double pat = scanner.nextDouble();
		
		System.out.print("Ingrese el estrato social del estudiante: ");
		int est = scanner.nextInt();
		
		Estudiante estudiante = new Estudiante(ni, nom, pat, est);
		
		obtenerInfo(estudiante);
		
		scanner.close();
	}
	public static void obtenerInfo(Estudiante estudiante) {
		System.out.println("El estudiante con número de inscripción " + estudiante.getNi() + " y nombre " + estudiante.getNom() + 
						" debe pagar: $" + estudiante.getPagmat());
	}
	

}


//Ahora aqui va la clase estudiante

package package001;

public class Estudiante {
	
	private int ni; 				//numero de inscripción
	private String nom; 			//Nombres
	private double pat; 			// patrimonio
	private int est; 				//Estrato social
	private double pagmat; 			//pago de matrícula
	
	public Estudiante (int ni, String nom, double pat, int est) {
		this.ni = ni;
		this.nom = nom;
		this.pat = pat;
		this.est = est;
		this.pagmat = obtenerPagmat();
	}
	
	private double obtenerPagmat() {
		double pagobase = 50000;
		if (pat > 2000000 && est > 3) {	
			pagobase += 0.03 * pat;
		}	
		return pagobase;
	}
	
	public int getNi() {
		return ni;
	}
	public String getNom() {
		return nom;
	}
	public double grtPat() {
		return pat;
	}
	public int getEst() {
		return est;
	}
	public double getPagmat() {
		return pagmat;
	}			
}
