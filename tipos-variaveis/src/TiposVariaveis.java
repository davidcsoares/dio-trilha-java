public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        /*Os tipos primitivos são int, byte, short, long, float e double.
        Sendo int, byte, shorte long para numeros inteiros.
        E float e double para numeros reais*/

        //Exemplos de da estrutura da variavel:

        //O valor da variavel pode mudar depois de declarado.

        int idade;
        int anoDeEstudo = 2022;
        double salarioMinimo = 2500.00;
        byte quantidadeSalas = 70;
        int quantidadeEpisodiosTwd = 177;

        /*Declarando a palavra "final" no inicio e com letra maiuscula 
        a variavel nunca írá mudar de valor*/

        final double PI = 3.14;

        //Outros exemplos de variaveis e seus tipos:
  

        //coordenadas de lisboa - portugal
        double latitude = 38.7166700;
        double longitute =  -9.1333300;

        //quantidade de brasileiros em 2022
        double quantidadePopulacaoBrasil = 215194.264;

        //Exibindo os valores das variaveis:

        System.out.println("Resultados:");
        System.out.println("Ano de estudo: "+anoDeEstudo);
        System.out.println("Salario Minimo: "+salarioMinimo);
        System.out.println("Quantidade de salas: "+quantidadeSalas);
        System.out.println("Quantos episodios tem The Walking Dead?: "+quantidadeEpisodiosTwd);
        System.out.println("Quantidade de pessoas no Brasil em 2022, segundo o IBGE: "+quantidadePopulacaoBrasil);
        System.out.println("Latitude de Lisboa: "+latitude+"°");
        System.out.println("Longitude de Lisboa: "+longitute+"°");
        System.out.println("Valor de PI: "+PI);

        

    }
}
