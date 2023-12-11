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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la contraseña a validar");
        
        String password = scanner.nextLine();
        
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false; 
        
        if ( password.length() >= 8){
        
            for(int i = 0; i < password.length() ; i ++ ){
                if (  password.charAt(i) == 'a' || password.charAt(i) == 'b' ||
                password.charAt(i) == 'c' || password.charAt(i) == 'd' ||
                 password.charAt(i) == 'd' || password.charAt(i) == 'e' ||       
                password.charAt(i) == 'f' || password.charAt(i) == 'g' ||
                password.charAt(i) == 'h' || password.charAt(i) == 'i' || 
                password.charAt(i) == 'j' || password.charAt(i) == 'k' ||        
                password.charAt(i) == 'l' || password.charAt(i) == 'm' ||  
                password.charAt(i) == 'n' || password.charAt(i) == 'ñ' ||    
                password.charAt(i) == 'o' || password.charAt(i) == 'p' ||   
                password.charAt(i) == 'k' || password.charAt(i) == 'r' ||    
                password.charAt(i) == 's' || password.charAt(i) == 't' ||   
                 password.charAt(i) == 'u' || password.charAt(i) == 'v' ||  
                password.charAt(i) == 'w' || password.charAt(i) == 'x' ||
                password.charAt(i) == 'y' || password.charAt(i) == 'z'        ){
                
                var1 = true;
                }
                
                if (  password.charAt(i) == 'A' || password.charAt(i) == 'B' ||
                password.charAt(i) == 'C' || password.charAt(i) == 'D' ||
                 password.charAt(i) == 'D' || password.charAt(i) == 'E' ||       
                password.charAt(i) == 'F' || password.charAt(i) == 'G' ||
                password.charAt(i) == 'H' || password.charAt(i) == 'I' || 
                password.charAt(i) == 'J' || password.charAt(i) == 'K' ||        
                password.charAt(i) == 'L' || password.charAt(i) == 'M' ||  
                password.charAt(i) == 'N' || password.charAt(i) == 'Ñ' ||    
                password.charAt(i) == 'O' || password.charAt(i) == 'P' ||   
                password.charAt(i) == 'K' || password.charAt(i) == 'R' ||    
                password.charAt(i) == 'S' || password.charAt(i) == 'T'|   
                 password.charAt(i) == 'U' || password.charAt(i) == 'V' ||  
                password.charAt(i) == 'W' || password.charAt(i) == 'X' ||
                password.charAt(i) == 'Y' || password.charAt(i) == 'Z'        ){
                
                var2 = true;
                }
                
                if (  password.charAt(i) == '1' || password.charAt(i) == '2' ||
                password.charAt(i) == '3' || password.charAt(i) == '4' ||
                 password.charAt(i) == '5' || password.charAt(i) == '6' ||       
                password.charAt(i) == '7' || password.charAt(i) == '8' ||
                password.charAt(i) == '9' || password.charAt(i) == '0'         ){
                
                var3 = true;
                }
                
                if (  password.charAt(i) == '!' || password.charAt(i) == '@' ||
                password.charAt(i) == '#' || password.charAt(i) == '$' ||
                 password.charAt(i) == '%' || password.charAt(i) == '^' ||
                password.charAt(i) == '&' || password.charAt(i) == '*'         ){
                
                var4 = true;
                }
                
            }
        }
        
        if( var1 == true && var2 == true && var3 == true && var4 == true  ){
            System.out.println("Tu contraseña si cumple con lo requerido");
        }else{
            System.out.println("Tu contraseña no cumple con lo requerido");
        }
    }
    
}
