import java.util.Scanner;

public class ChamadaRecursiva {

    /*
     * O objetivo do código é mostar a soma de um numero com os seus antecessores.
     * O valor será inserido ao usuário,será feito um laço de repetição contando 
     * do numero escolhido até zero e feito a soma, e ao final exibindo o resultado.
     */
    
    int numero;

    /*
     * O método somatorio dentro da classe ChamadaRecursiva
     * irá fazer a soma do numeros antecessores ao numero 
     * escolhido a cada contagem pelo contado i que tem o mesmo 
     * valor do numero inserido e vai diminuindo a cada repetição
     * no laço for. E ao final do loop exibirá o resultado do somatório.
     */
    public void somatorio() {

        int somaRecursiva = 0;
        
        for (int i = numero; i > 0; i--) {
            
            somaRecursiva = somaRecursiva + i;
            numero--;
            
        }

    System.out.println(somaRecursiva);

}
    public static void main(String[] args) {
        
        //É criado um novo objeto da classe ChamadaRecursiva
        ChamadaRecursiva recursivo = new ChamadaRecursiva();

        //scan irá ler o numero digitado pelo usuário
        Scanner scan = new Scanner(System.in);

        //Agora o número é lido pelo scan
        recursivo.numero = scan.nextInt();

        //E o método somatorio é chamaddo para  ser executado
        recursivo.somatorio();

    }
}
