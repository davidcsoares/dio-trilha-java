public class SmartTv {

    //atributos da classe SmartTv
    boolean ligada = false;
    int canal = 12;
    int volume = 34;

    //metodos
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void mudarCanal() {
        canal++;
    }

    public void voltarCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }
}
