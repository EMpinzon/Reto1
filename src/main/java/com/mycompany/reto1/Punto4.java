/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto1;

/**
 *
 * @author user
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 0;
        int b = 1;
        
        for(int i = 0 ; i< 10 ; i++){
            
            System.out.print(a);
            System.out.print(" ");
            a = b;
            b = a + b;
        }
        
        
    }
    
    
    // con este programa generamos la variable a y la variable b, que seran utilizadas en un cilo for, que se repite diez veces, desde cero hasta 9.
    // Por cada iteracion se imprime el valor de a,se deja un espacio a la derecha, y luego añadimos dentro de a el valor de b, y dentro de b el valor de a + b 
    // Esta genera el efecto de que a se actualiza cada iteracion, con el valor de b , que es el doble de a, y b tambien se actualiza para tener el b anterior mas el nuevo a, que es como tener a a duplicado, pues el nuevo a es el mismo b anterior
}
