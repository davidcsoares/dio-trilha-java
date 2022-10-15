package edu.exercicios.arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
            
                default:

                consoantes[count] = letra; 
                quantidadeConsoantes++;

            }

            count++;


        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                
                System.out.print(consoante+" ");

            }
        }

        System.out.println("Quantidade de consoantes: "+quantidadeConsoantes);


    }
}
