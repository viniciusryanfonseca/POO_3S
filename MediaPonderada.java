/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media.ponderada;

import java.util.Scanner;

/**
 *
 * @author vynyc
 */
public class MediaPonderada {

    public static void main(String[] args) {
       
         Scanner myScanner = new Scanner(System.in);
        System.out.println("operacoes matematicas");
        
        System.out.print("digite a n1: ");
        double n1 = myScanner.nextInt();
       
        System.out.print("digite a n2: ");
        double n2 = myScanner.nextInt();
       
        System.out.print("digite a n3: ");
        double n3 = myScanner.nextInt();
        /* recebi todas as notas */ 
        double media = (n1 * 1 + n2 * 2 + n3 * 3) / 5;
        /* realizei a operação */
        System.out.println("\n--- Resultado---");
        System.out.println("A media aritmetica e: " + media);    
        /* mostrei o resultado ao usuário */
        myScanner.close();
        
        
        
    }
}
