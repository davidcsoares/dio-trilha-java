public class Calculadora {

    int num1;
    int num2;
    int resultado;
    
    public void somar() {
        resultado = num1 + num2;
        System.out.print("Resultado: "+resultado+System.lineSeparator());
    }

    public void subtrair() {
        resultado = num1 - num2;
        System.out.print("Resultado: "+resultado+System.lineSeparator());
    }

    public void multiplicar() {
        resultado = num1 * num2;
        System.out.print("Resultado: "+resultado+System.lineSeparator());
    }

    public void dividir() {
        resultado = num1 / num2;
        System.out.print("Resultado: "+resultado+System.lineSeparator());
    }
}
