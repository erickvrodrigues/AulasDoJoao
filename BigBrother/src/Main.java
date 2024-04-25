import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogador> participantesBigBrother = new ArrayList<Jogador>();
        Scanner scn = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("1- Adicionar participante.");
            System.out.println("2- Registrar voto.");
            System.out.println("0- Encerrar votação e exibir resultado.");
            System.out.println("Digite uma opção: ");
            opcao = scn.nextInt();

            if (opcao == 1) {
                adicionarParticipante(participantesBigBrother);
            } else if (opcao == 2) {
                registrarVoto(participantesBigBrother);
            }
        } while (opcao != 0);

        exibirResultado(participantesBigBrother);
    }

    private static void adicionarParticipante(ArrayList<Jogador> participantesBigBrother) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o nome do participante: ");
        String nome = scn.nextLine();
        Jogador jogador = new Jogador(nome);
        participantesBigBrother.add(jogador);
    }

    private static void registrarVoto(ArrayList<Jogador> participantesBigBrother) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o nome do participante que deseja votar: ");
        String nomeVotado = scn.nextLine();

        for (Jogador jogador : participantesBigBrother) {
            if (jogador.getNome().equalsIgnoreCase(nomeVotado)) {
                jogador.incrementaUmVoto();
                System.out.println("Voto registrado para " + jogador.getNome());
                return;
            }
        }
        System.out.println("Participante não encontrado.");
    }

    private static void exibirResultado(ArrayList<Jogador> participantesBigBrother) {
        Jogador eliminado = encontrarEliminado(participantesBigBrother);
        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar,"
                + " se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou conseguir te eliminar com alegria. Com "
                + eliminado.getVotos() + " votos, é você quem sai "
                + eliminado.getNome() + ".");
    }



    private static Jogador encontrarEliminado(ArrayList<Jogador> participantes) {
        Jogador eliminado = participantes.get(0);
        for (Jogador jogador : participantes) {
            if (jogador.getVotos() > eliminado.getVotos()) {
                eliminado = jogador;
            }
        }
        return eliminado;
    }
}