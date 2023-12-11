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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        String password = "";
        String var1 = "efhijkgabwxyzklmnñcdoprstuv";
        String var2 = "ABGFHICDJWXÑOPNKEYZKLMRSTUV";
        String var3 = "!@#$%^&*";
        String var4 = "139768425";
        
        
        System.out.println("Ingrese la cantidad de caracteres de la contraseña entre 8 y 16");
        Scanner scanner = new Scanner(System.in);
        
        int cantidad = scanner.nextInt();
        int contador = 1;
        
        
        while ( contador <= cantidad ){
            
            
        
            if (contador <= var1.length()){
                password = password.concat(var1.substring(var1.length() - contador ,  var1.length() - contador  +1 )  );
            }
            if (contador <= var2.length()){
                password = password.concat( var2.substring(var2.length() - contador  , var2.length() - contador + 1)  );
            }
            if(contador <= var3.length()){
                password = password.concat( var3.substring(var3.length() - contador  , var3.length() - contador + 1)  );
            }
            if(contador <= var4.length()){
                password = password.concat(var4.substring(var4.length() - contador  , var4.length() - contador + 1) ) ;
            }
            
            
            
            
            contador = contador +1; 
        }
        
        
        System.out.println("tu contraseña es : " + password.substring(0,14));
        
    }
    
}
