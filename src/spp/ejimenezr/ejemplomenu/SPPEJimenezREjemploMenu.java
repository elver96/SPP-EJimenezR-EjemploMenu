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
                break;
            case 2:
                System.out.println("Bienvenido al calculo de perimetros");
                break;
            case 3:
                System.out.println("Bienvenido al calculo de volumenes");
                break;
            default:
                System.out.println("Adios");
                
                
        }
    }
    
}
