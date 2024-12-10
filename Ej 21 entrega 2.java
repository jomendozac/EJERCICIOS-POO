package Ejerciccios;

public class Ejercicio_21 {
	public static void main(String[] args) {
		int a, b, c, perimetro;
		double semi,area;
		
		a=4;
		b=3;
		c=5;
		
		perimetro = a+b+c;
		semi = (a+b+c)/2;
		area = Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
		
		System.out.println("perimetro: "+perimetro);
		System.out.println("semiperimetro: "+semi);
		System.out.println("area: "+area);
	}
}
