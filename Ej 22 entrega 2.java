package Estructura_decisión_lógica;

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args){
        //Nombre
        String Nom;
        //Salario basico por hora, Numero de horas trabajadas, Salario mensual
        double SBH, NHT,SM;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nombre del Empleado: ");
        Nom=entrada.nextLine();
        System.out.print("Salario por hora: ");
        SBH=entrada.nextDouble();
        System.out.print("Numero de horas trabajadas: ");
        NHT=entrada.nextDouble();
        
        SM=SBH*NHT;
        if(SM>450000){
            System.out.print("");
            System.out.println("Nombre: "+Nom);
            System.out.println("Salario mensual: "+SM);
        }
        else{
            System.out.print("");
            System.out.print("Nombre: "+Nom);
        }
    }
}
