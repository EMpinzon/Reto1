/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el  numero hasta el cual se debe hacer el calculo" );
        int sumaTotal = 0;
        
        int N = scanner.nextInt();
        
        for(int i = 1; i < N ; i++){
        
            if ( (i % 3 == 0 ) && (i % 5 == 0))  {
                continue;
            }
            else if ( (i % 3) == 0  ){
                
                sumaTotal = sumaTotal + i;
            
            }else if ( (i % 5) == 0  ){
            
                sumaTotal = sumaTotal + i;
            }
        
        }
        
        System.out.println("la suma total es : "+ sumaTotal);
        
        
        
    }
    
}
