/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salario.com.gratificacao.e.imposto;

import java.util.Scanner;

/**
 *
 * @author vynyc
 */
public class SalarioComGratificacaoEImposto {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("salario do funcionario: ");
        double sal_fun = myScanner.nextInt();
        /* obtive o salario do usuário */ 
        double sal_grat = (sal_fun * 5/100) + sal_fun;
        double sal_imposto = sal_grat - (sal_fun * 7/100);
        /* fiz as operações */
       
        
         System.out.println("\n--- Resultado---");
        System.out.println("O seu salario e: " + sal_imposto);
        /* apresentei os resultados */ 
        myScanner.close();
    }
}
