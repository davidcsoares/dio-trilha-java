package edu.exercicios.loops;

import java.util.Scanner;

public class Nota {

        /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido
    e continue pedindo
    até que o usuário informe um valor válido.
    */
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int nota;
        Boolean valorValido = false;
        
        System.out.println("Insira o valor da nota: ");
        nota = s.nextInt();
        
        while (valorValido == false) {
            if ((nota >= 0) && (nota <= 10)) {
                System.out.println("Valor válido!");
                valorValido = true;
                break;
            } else {
                System.out.println("Valor inválido! Tente novamente ...");
                nota = s.nextInt();
            }
        }
    }
}
