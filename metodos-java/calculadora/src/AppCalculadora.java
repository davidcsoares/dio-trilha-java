import java.util.Scanner;

public class AppCalculadora {
    
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá seja bem vindo(a)!"+System.lineSeparator());

        System.out.println("Iniciando calculadora..."+System.lineSeparator());

        System.out.println("Digite o primeiro numero: "+System.lineSeparator());
        calculadora.num1 = scan.nextInt();
        System.lineSeparator();

        System.out.println("Escolha o operador: ");

        String operador = " ";

        System.out.println(System.lineSeparator()+" + -> SOMA");
        System.out.println(System.lineSeparator()+" - -> SUBTRAÇÃO");
        System.out.println(System.lineSeparator()+" * -> MULTIPLICAÇÃO");
        System.out.println(System.lineSeparator()+" / -> DIVISÃO"+System.lineSeparator());
        operador = scan.next();
        
        switch (operador) {
            case "+":
                System.out.println("Digite o segundo numero: ");
                calculadora.num2 = scan.nextInt();
                calculadora.somar();
                break;
            case "-":
                System.out.println("Digite o segundo numero: ");
                calculadora.num2 = scan.nextInt();
                calculadora.subtrair();
                break;
            case "*":
                System.out.println("Digite o segundo numero: ");
                calculadora.num2 = scan.nextInt();
                calculadora.multiplicar();
                break;
            case "/":
                System.out.println("Digite o segundo numero: ");
                calculadora.num2 = scan.nextInt();
                calculadora.dividir();
                break;
            default:
                System.out.println("Operação inválida! Tente novamente...");
                operador = scan.next();
        }

    }
}
