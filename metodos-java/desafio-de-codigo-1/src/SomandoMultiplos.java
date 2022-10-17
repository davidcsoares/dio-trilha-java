import java.util.Scanner;

public class SomandoMultiplos {

    /*
     * O objetivo do código é descobrir os numeros multiplos de "a" que será o numero desejado
     * até "n" que é o onde termina a procura. E esses numeros multiplos serão somados, assim
     * terá um resultado da soma desses valores.
     */
    
    public static void main(String[] args) {
        
        //leitor será utilizado para ler o valor inserido de a e n
        Scanner leitor = new Scanner(System.in);

        //a é o numero escolhido
        int a;
        //n é o limite aonde vai ser encontrado os multiplos
        int n;

        //agora o leitor vai ler o valor de a
        a = leitor.nextInt();

        //e o valor de n
        n = leitor.nextInt();
        
        //soma vai receber o valor da soma de cada multiplo de a;
        int soma = 0;

        //i vai começar a contar a partir do valor de a;
        int i = a;

        //enquanto i tiver o valor menor ou igual ao de n, o laço será repetido;
        while (i <= n) {

            /*
                Para saber se o valor a cada contagem é multiplo, utilizarei o operador (%)
                que é o resto da divisão. Se o resto for igual a 0 ele é multiplo de a e 
                irá somar o multiplo com o valor da soma, se não ele vai aumentar o valor 
                de i para verificar novamente.
            */ 
            if (i % a == 0) {
                soma = soma + i;
                i++;
            } else {
                i++;
            }
        }

        //Ao final do laço ele irá exibir o valor obtido da soma dos multiplos entre a e n.
        System.out.println(soma);

    }
}
