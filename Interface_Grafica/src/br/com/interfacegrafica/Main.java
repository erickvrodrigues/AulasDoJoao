package br.com.interfacegrafica;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = -1;
        int sair = -1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\nProjeto lotofácil");
            System.out.println("Opção 1 - Aposta de 0 a 100");
            System.out.println("Opção 2 - Aposta de A a Z");
            System.out.println("Opção 3 - Aposta Par ou Impar");
            System.out.println("Opção 0 - Sair");
            int jogo  = in.nextInt();

            switch (jogo) {
                case 1:
                    do{
                        try{
                            Random random = new Random();
                            int numero = random.nextInt() * 100;

                            System.out.print("Digite um número de 0 a 100");
                            int valor  = in.nextInt();
                            if(valor > 100 || valor < 0){
                                while(valor > 100 || valor < 0){
                                    System.out.println("Somente números entre 0 e 100");
                                    System.out.println("Digite novamente por favor:");
                                    valor = in.nextInt();
                                }
                            }
                            if(valor == numero){
                                System.out.println("Parabéns você ganhou R$1.000,00 ");



                            }else{
                                System.out.println("Não foi dessa vez jogador");
                            }
                            System.out.print("Jogar novamente - 0");
                            System.out.print("Sair - 1");
                            sair = in.nextInt();

                        }catch(RuntimeException e){
                            e.printStackTrace();
                        }


                    }while(sair != 1);

                    break;
                case 2:
                    try{
                        do{
                            Random random = new Random();
                            char randomizedCharacter = (char) (random.nextInt(26) + 'a');
                            Integer teste = 1;

                            System.out.print("Digite uma letra  de A a Z: ");
                            char letra = in.next().charAt(0);

                            boolean isDigito =  Character.isDigit(letra);
                            while(isDigito){
                                System.out.print("É permitido somente letras meu jovem ");
                                System.out.print("Digite novamente ");
                                letra = in.next().charAt(0);
                                isDigito =  Character.isDigit(letra);
                            }
                            if(letra == randomizedCharacter){
                                System.out.print("Parabéns você ganhou");
                            }else{
                                System.out.print("Infelizmente não foi dessa vez meu jovem, porque não tenta jogar novamente?\n");
                            }
                            System.out.println("Sair - 1");
                            System.out.println("Jogar novamente - 0");
                            sair = in.nextInt();
                        }while(sair != 1);

                    }catch(Exception e){
                      e.printStackTrace();
                    }
                case 3:
                    try{
                        do{
                            System.out.print("Digite um número");
                            int valor  = in.nextInt();
                            if(valor % 2 == 0){
                                System.out.print("Ganhou R$100.00");
                            }else{
                                System.out.print("Perdeu");
                            }
                            System.out.println("Sair - 1");
                            System.out.println("Jogar novamente - 0");
                            sair = in.nextInt();
                        }while(sair != 1);

                    }catch(Exception e){
                       e.printStackTrace();
                    }
                case 0:
                    System.out.println("AI ZEW DA MANGA");
                    opcao = 0;
                default:
                    System.out.println("AI ZEW DA MANGA");
                    opcao = 0;
            }

        }while(opcao != 0 );
    }
}