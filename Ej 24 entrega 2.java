package Ejercicios_propuestos;

import java.util.Scanner;

public class Ejercicio_24 {
     public static void main(String[] args){
     ///Esferas A,B,C, mas pesada
     double A,B,C;
     
     Scanner entrada = new Scanner(System.in);
        
        System.out.print("Peso de A: ");
        A=entrada.nextDouble();
        System.out.print("Peso de B: ");
        B=entrada.nextDouble();
        System.out.print("Peso de C: ");
        C=entrada.nextDouble();
     
     if(A>B && A>C){System.out.println("La bola mas pesada es la A");}
     else if(B>A && B>C){System.out.println("La bola mas pesada es la B");}
     else{System.out.println("La bola mas pesada es la C");}
     }
}
