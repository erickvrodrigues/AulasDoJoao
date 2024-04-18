import meuapp.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> agendaPessoas = new ArrayList<Pessoa>();
        Scanner scn = new Scanner(System.in);
        int opcao= -1;

        do{
            System.out.println("1 - Cadastrar pessoa na agenda.");
            System.out.println("2 - Listar pessoas da agenda.");
            System.out.println("0 - Sair.");
            System.out.println("Digite a opção desejada: ");
            opcao = scn.nextInt();
            if (opcao == 1){
                cadastrar(agendaPessoas);
            } else if (opcao == 0) {
                listar(agendaPessoas);

            }
        }while (opcao!=0);

    }

    private static void listar(ArrayList<Pessoa> agendaPessoas) {
        for (Pessoa obj : agendaPessoas){
            System.out.println(obj.toString());
        }
    }

    private static void cadastrar(ArrayList<Pessoa> agendaPessoas) {
        Scanner scn = new Scanner(System.in);
        String nome = "";
        String endereco = "";
        String telefone = "";

        System.out.println("Digite o nome: ");
        nome = scn.nextLine();
        System.out.println("Digite seu endereço: ");
        endereco = scn.nextLine();
        System.out.println("Digite seu telefone: ");
        telefone = scn.nextLine();

        Pessoa objPessoa = new Pessoa(nome, endereco, telefone);
        agendaPessoas.add(objPessoa);
    }
}