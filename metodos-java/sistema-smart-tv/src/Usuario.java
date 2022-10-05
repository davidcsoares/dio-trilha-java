public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.escolherCanal(73);
        System.out.println("O seu canal é o "+smartTv.canal);


        System.out.println("Tv ligada ? "+smartTv.ligada);
        System.out.println("Canal atual ? "+smartTv.canal);
        System.out.println("Volume atual ? "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status: ligada");

        smartTv.desligar();
        System.out.println("Novo status: desligada");

        smartTv.mudarCanal();
        System.out.println("O seu canal atual é "+smartTv.canal);

        smartTv.voltarCanal();
        System.out.println("O seu canal atual é "+smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.diminuirVolume();
        System.err.println("Volume atual: "+smartTv.volume);

    }
}
