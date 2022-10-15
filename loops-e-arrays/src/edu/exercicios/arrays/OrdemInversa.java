package edu.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    
    public static void main(String[] args) {
        
        int [] vetor = {1 ,4 ,56, 12 , 99};

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i]+" ");
        }
    }
}
