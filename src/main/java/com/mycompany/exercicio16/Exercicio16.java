package com.mycompany.exercicio16;

import java.util.*;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        String num1 = n1.nextLine();
        
        Scanner n2 = new Scanner(System.in);
        System.out.print("Segundo número: ");
        String num2 = n2.nextLine();
        
        Scanner equacao = new Scanner(System.in);
        System.out.print("Tipo de equação\nEscolha entre adição, subtração, multiplicação ou divisão: ");
        String conta = equacao.nextLine();
        
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        
        switch(conta) {
        
        case "adição":
            int totalMais = x + y;
            System.out.println("Resultado da soma: "+ totalMais);
            break;
        case "subtração":
            int totalMenos = x - y;
            System.out.println("Resultado da subtração: "+ totalMenos);
            break;
        case "multiplicação":
            int totalVezes = x * y;
            System.out.println("Resultado da multiplicação: "+ totalVezes);
            break;
        case "divisão":
            int totalDividir = x / y;
            System.out.println("Resultado da divisão: "+ totalDividir);
            break;
        default:
            System.out.println("Escolha entre adição, subtração, multiplicação ou divisão");
        }
    }
}
