import java.util.Scanner;

public class ChamadaRecursiva {

    /*
     * Neste desafio, receba um número inteiro N, calcule e imprima 
     * o somatório de todos os números de N até 0.   
     */
    

    public static int somatorio(int n) {

        int soma = 0; 

        if (n == 0) {
            return n;
        } else {
            soma  = soma + (n - 1);
            return soma;
        }
     }
    
    

    public static void main(String[] args) {

        ChamadaRecursiva recursiva = new ChamadaRecursiva();
        
        Scanner scan = new Scanner(System.in);

    }
}
