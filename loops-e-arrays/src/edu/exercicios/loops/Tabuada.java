package edu.exercicios.loops;

import java.util.Scanner;

public class Tabuada {
    
        /* 
    Desenvolva um gerador de tabuada,
    capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
    O usuário deve informar de qual numero ele deseja ver a tabuada.
    A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
    */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero;
        int multiplicador = 1;
        int resultado;
        
        System.out.println("Informe o numero que deseja ver a tabuada:  ");
        numero = s.nextInt();

        while (multiplicador <= 10) {
            resultado = numero * multiplicador;
            System.out.println(numero+" X "+multiplicador+" = "+resultado);
            multiplicador++;
        }
    }
}
