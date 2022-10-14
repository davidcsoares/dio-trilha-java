package edu.exercicios.loops;

import java.util.Scanner;

public class MaiorEMedia {

        /*
    Faça um programa que leia 5 números
    e informe o maior número
    e a média desses números.
    */
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;
        int maiorNumero = 0;
        int menorNumero = 0;
        int soma = 0;
        float media = 0;
        int c = 0;

        while (c < 5) {

            System.out.println("Digite o numero: ");
            numero = s.nextInt();

            soma = soma + numero;
            
            if (numero > maiorNumero) {
                maiorNumero = numero;
            } else {
                menorNumero = numero;
            }

            c++;
            
        }
            media = soma / 5;
        
        System.out.println("O Maior valor dos cinco numeros foi "+maiorNumero);
        System.out.println("O menor valor dos cinco numeros foi "+menorNumero);
        System.out.println("A média dos valores é "+media);

    }
}
