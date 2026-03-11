package com.mycompany.mavenproject2;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    
    public Pessoa(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade; 
        this.email = email;
    }
        public void apresentar() {
        System.out.println(" Ola, seu nome e " + nome);
        System.out.println(" sua idade e " + idade);
        System.out.println(" seu email e " + email);
        int prox_aniv = idade + 1;
        System.out.println(" seu proximo aniversario sera de " + prox_aniv);
    }
        
}
