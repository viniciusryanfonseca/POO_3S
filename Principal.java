package com.mycompany.mavenproject2;

public class Principal { 
    public static void main (String [] args){
        
    Pessoa p1 = new Pessoa(" Vinicius Ryan ", 19, " vynycyusryan@gmail.com");
    Pessoa p2 = new Pessoa(" francisco beleza neto", 20, " xicobelezaneto@gmail.com");
    Pessoa p3 = new Pessoa(" luana dutra correa", 19, "luadutcorrea@gmail.com");
    
    p1.apresentar();
    
    p2.apresentar();
    
    p3.apresentar();
    
    }
}