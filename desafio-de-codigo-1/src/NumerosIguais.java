import java.util.Scanner;

public class NumerosIguais {

    /*
     * O objetivo do código é descobrir se dois valores do tipo inteiro 
     * inseridos pelo usuário se são iguais ou não.
     */
    
    public static void main(String[] args) {
        
        //leitor será utilizado para ler o valor inserido de a e b
        Scanner leitor = new Scanner(System.in);

        // "a" é o primeiro numero e "b" o segundo numero
        int a;
        int b;

        //agora o leitor vai ler o valor de a e b
        a = leitor.nextInt();

        b = leitor.nextInt();

        /*
         * A condição é que se o valor de "a" for igual ao de "b"
         * será exibida a mensagem "São iguais!" se os valores forem
         * iguais, se não será exibida a mensagem "Não são iguais!"
         */
        if (a == b) {
            System.out.println("Sao iguais! ");
        } else {
            System.out.println("Nao sao iguais! ");
        }
    }
}
