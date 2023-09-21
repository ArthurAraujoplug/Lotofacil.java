import java.util.Random;
import java.util.Scanner;

public class Lotofacil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcao;
        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int numeroApostado;
                    System.out.print("Digite um número de 0 a 100: ");
                    numeroApostado = scanner.nextInt();

                    if (numeroApostado < 0 || numeroApostado > 100) {
                        System.out.println("Aposta inválida.");
                    } else {
                        int numeroSorteado = random.nextInt(101);
                        if (numeroApostado == numeroSorteado) {
                            System.out.println("Você ganhou R$ 1.000,00 reais.");
                        } else {
                            System.out.println("Que pena! O número sorteado foi: " + numeroSorteado + ".");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Digite uma letra de A a Z: ");
                    char letraApostada = scanner.next().toUpperCase().charAt(0);

                    if (Character.isLetter(letraApostada)) {
                        char letraPremiada = 'A'; // Substitua pela sua inicial
                        if (letraApostada == letraPremiada) {
                            System.out.println("Você ganhou R$ 500,00 reais.");
                        } else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                        }
                    } else {
                        System.out.println("Aposta inválida.");
                    }
                    break;

                case 3:
                    System.out.print("Digite um número inteiro: ");
                    int numeroParaVerificar = scanner.nextInt();

                    if (numeroParaVerificar % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do jogo LOTOFÁCIL. Obrigado por jogar!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
