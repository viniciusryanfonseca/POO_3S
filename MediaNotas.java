/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media.notas;

import java.util.Scanner;

/**
 *
 * @author vynyc
 */
public class MediaNotas {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("operacoes matematicas");
        
        System.out.print("digite a n1: ");
        double n1 = myScanner.nextInt();
       
        System.out.print("digite a n2: ");
        double n2 = myScanner.nextInt();
       
        System.out.print("digite a n3: ");
        double n3 = myScanner.nextInt();
       /* peguei os valores das notas com o usuário*/
        
        double media = (n1 + n2 + n3) / 3;
        /* realizei as operações*/
        System.out.println("\n--- Resultado---");
        System.out.println("A media aritmetica e: " + media);    
        /* apresentei os resultados*/
        myScanner.close();
    }
}
