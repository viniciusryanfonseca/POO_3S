/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salario.funcionario;
import java.util.Scanner;
/**
 *
 * @author vynyc
 */
public class SalarioFuncionario {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("salario do funcionario: ");
        double sal_fun = myScanner.nextInt();
        /* obtive o valor do salario do usuário */
        double novo_salario = (sal_fun + sal_fun * 25/100 );
        /* realizei a operação */
         System.out.println("\n--- Resultado---");
        System.out.println("O novo salario e: " + novo_salario);    
        /* mostrei o resultado ao usuário */
        myScanner.close();
        
    }
}
