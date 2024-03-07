package meuapp;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        menu();
    }
    private static void menu() {
        System.out.println("Exemplo do while");
        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("********** Sistema de Cadastro **********");
            System.out.println("Opção 1: Cadastrar cliente");
            System.out.println("Opção 2: Cadastrar produto");
            System.out.println("Opção 3: Cadastrar vendedor");
            System.out.println("Opção 0: Sair");
            System.out.println("*****************************************");
            System.out.print("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("*****************************************");
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 escolhida.");
                    // cadastrarCliente();
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida.");
                    // cadastrarProduto();
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida.");
                    // cadastrarVendedor();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida.");
                    // Sair
                    break;
                default:
                    System.out.println("O número escolhido é inválido!");
            }
        } while (opcao != 0);

    }

    private static void exercicio1(){
        //1) Faça um programa que receba quatro números inteiros,
        //calcule e mostre a soma desses números.
        Scanner scn = new Scanner(System.in);
        int soma = 0;
        for(int i = 1; i <=4; i++){
            System.out.println("Digite o " + i + "° número: ");
            soma += scn.nextInt();
        }
        System.out.println("A soma é: " + soma);
    }

    private static void exercicio2(){
        //2) Faça um programa que receba três notas,
        //calcule e mostre a média aritimética entre elas.
        Scanner notas = new Scanner(System.in);
        int soma = 0;
        for(int i = 1; i <=3; i++){
            System.out.println("Digite o " + i + "° número: ");
            soma += notas.nextInt();
        }
        System.out.println("A soma é: " + soma/3);
    }
    private static void exercicio3(){
        //3) Faça um programa que receba o salário de um funcionário,
        //calcule e mostre o novo salário, sabendo-se que este
        //sofreu um aumento de 25%

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário: ");
        double salarioAtual= scn.nextDouble();
        double aumento = salarioAtual * 0.25;
        double novoSalario = salarioAtual + aumento;
        System.out.println("Novo salário com aumento: " + novoSalario);
        System.out.println();
    }
}