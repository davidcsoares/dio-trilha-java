package edu.exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class NumerosAleatorios {
    
    public static void main(String[] args) {
        
        //Random é uma classe que gera numeros aleatorios
        Random random = new Random();

        //vetor onde vai ficar salvos os numeros
        int[] numerosAleatorios = new int [20];

        for (int i = 0; i < numerosAleatorios.length; i++) {

            //numero vai salvar o numero aleatorio dentro de numerosAleatorios
            int numero = random.nextInt();

            //a cada novo loop vai ser salvo um novo valor no vetor
            numerosAleatorios[i] = numero;
        }
        System.out.println("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero+" ");
        }

        System.out.println("Sucessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1)+" ");
        }
    }
}
