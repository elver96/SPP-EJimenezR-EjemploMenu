/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.ejemplomenu;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezREjemploMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int opEntrada;
        Scanner kb = new Scanner (System.in);
        double lado,resultado;
        
        //Desplegamos menu
        System.out.println("Calculadora de áreas, perimetros y volumenes");
        System.out.println("Introduzca la opcion deseada");
        System.out.println("1.Calcular áreas");
        System.out.println("2. Calcular perimetros");
        System.out.println("3. Calcular volumenes");
        System.out.println("Salir");
        opEntrada = kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de areas");
                System.out.println("Introduce el lado del cuadrado");
                lado=kb.nextDouble();
                resultado=Math.pow(lado,2);
                System.out.println("El area del cuadrado es "+resultado);
                break;
            case 2:
                System.out.println("Bienvenido al calculo de perimetros");
                System.out.println("Introduce el lado del cuadrado");
                lado=kb.nextDouble();
                resultado=4*lado;
                System.out.println("El perimetro del cuadrado es "+resultado);
                break;
            case 3:
                System.out.println("Bienvenido al calculo de volumenes");
                System.out.println("Introduce el lado del cubo");
                lado=kb.nextDouble();
                resultado=Math.pow(lado,3);
                break;
            default:
                System.out.println("Adios");
                
                
        }
    }
    
}
