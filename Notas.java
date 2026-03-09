/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;

import java.util.Scanner;

/**
 *
 * @author vynyc
 */
public class Notas {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("operacoes matematicas");
        
        System.out.print("digite o primeiro numero: ");
        int n1 = myScanner.nextInt();
       
        System.out.print("digite o segundo numero: ");
        int n2 = myScanner.nextInt();
       
        System.out.print("digite o terceiro numero: ");
        int n3 = myScanner.nextInt();
       
        System.out.print("digite o quarto numero: ");
        int n4 = myScanner.nextInt();
        
        int soma = n1 + n2 + n3 + n4;
        System.out.println("\n--- Resultado---");
    
        System.out.println("A soma total e: " + soma);    
        myScanner.close();
        
        
        
    }
}
