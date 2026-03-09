/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salario.funcionario2;

import java.util.Scanner;

/**
 *
 * @author vynyc
 */
public class SalarioFuncionario2 {

    public static void main(String[] args) {
       Scanner myScanner = new Scanner(System.in);
        
        System.out.println("salario do funcionario: ");
        double sal_fun = myScanner.nextInt();
        
        System.out.println("qual foi o percentual de aumento?(sem %)  ");
        double percentual_de_aumento = myScanner.nextInt();
        /* peguei tanto o valor do salario do usuario quanto a porcentagem de aumento do salario dele */
        double valor_de_aumento = sal_fun * (percentual_de_aumento /100);
        double novo_salario = sal_fun + valor_de_aumento;
        /* realizei a operação */
         System.out.println("\n--- Resultado---");
        System.out.println("O valor de aumento e: " + valor_de_aumento);  
        System.out.println("O novo salario e: " + novo_salario);
        /* apresentei os resultados ao usuário */
        myScanner.close();
    }
}
