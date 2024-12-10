package Ejercicios_propuestos;

import java.util.Scanner;

public class Ejercicio_23 {
    public static void main(String[] args){
    //Parametros A,B,C, Soluciones 1 y 2
        double A,B,C,s1,s2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Parametro A: ");
        A=entrada.nextDouble();
        System.out.print("Parametro B: ");
        B=entrada.nextDouble();
        System.out.print("Parametro C: ");
        C=entrada.nextDouble();    
        
        s1=(-B+Math.sqrt((Math.pow(B,2)-4*A*C)))/2*A;
        s2=(-B-Math.sqrt((Math.pow(B,2)-4*A*C)))/2*A;
        
        System.out.println("Solucion 1: "+s1);
        System.out.println("Solucion 2: "+s2);
    }
}
