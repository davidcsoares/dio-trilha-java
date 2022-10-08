package edu.exercicios.loops;

import java.util.Scanner;

public class CadastroAlunos {

    
    public static void main(String[] args) throws Exception{
        
        String nome = " ";
        int idade;

        Scanner scan = new Scanner(System.in);

        while (nome.equals("0")) {
            break;
        }

        System.out.println("Digite o nome: ");
        nome = scan.next();

        System.out.println("Digite a idade: ");
        idade = scan.nextInt();

        System.out.println("Aluno(a) cadastrado com sucesso: ");
        System.out.println("Nome: "+nome+" "+"Idade: "+idade);
    }
}
