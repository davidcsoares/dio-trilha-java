package edu.exercicios.loops;

import java.util.Scanner;

public class ParEImpar {
    
        /*
    Faça um programa que peça N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares.
    */

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int numero = 0;
        int c = 0;
        int ni = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Digite quantos numeros você quer calcular: ");
        ni = s.nextInt();

        while (ni > c) {
            System.out.println("Digite o numero: ");
            numero = s.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            c++;

        }

        System.out.println("Numeros pares: "+par);
        System.out.println("Numeros impares: "+impar);

    }

}
