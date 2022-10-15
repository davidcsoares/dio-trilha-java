package edu.exercicios.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class ArrayMultidimencional {
    
    public static void main(String[] args) {
        
        Random random = new Random();

        /*o primeiro [] siginifica a linha e o segundo [] a coluna como uma tabela de excel
        Veja o exemplo:


                        Linha
                       X X X X
      int[4][4] -->    X X X X Coluna
                       X X X X
                       X X X X
        */
        int[][] M = new int[4][4];

        //linha
        for (int i = 0; i < M.length; i++) {
            //coluna
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt();
            }

        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha ) {
                System.out.println(coluna+" ");
            }
        }
        System.out.println();


    }
}
