import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lotofácil");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Botão para apostar de 0 a 100
        JButton button1 = new JButton("Apostar de 0 a 100");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100:");
                try {
                    int numeroApostado = Integer.parseInt(input);
                    int numeroSorteado = new Random().nextInt(101);

                    if (numeroApostado < 0 || numeroApostado > 100) {
                        JOptionPane.showMessageDialog(null, "Aposta inválida.");
                    } else if (numeroApostado == numeroSorteado) {
                        JOptionPane.showMessageDialog(null, "Você ganhou R$ 1.000,00 reais.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: " + numeroSorteado + ".");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.");
                }
            }
        });

        // Botão para apostar de A à Z
        JButton button2 = new JButton("Apostar de A à Z");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z:");
                if (input != null && input.length() == 1) {
                    char letraApostada = input.toUpperCase().charAt(0);
                    char letraPremiada = 'A'; // Substitua pela sua inicial

                    if (Character.isLetter(letraApostada)) {
                        if (letraApostada == letraPremiada) {
                            JOptionPane.showMessageDialog(null, "Você ganhou R$ 500,00 reais.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi: " + letraPremiada + ".");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Aposta inválida.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Digite uma letra válida.");
                }
            }
        });

        // Botão para apostar em par ou ímpar
        JButton button3 = new JButton("Apostar em par ou ímpar");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(null, "Digite um número inteiro:");
                try {
                    int numeroParaVerificar = Integer.parseInt(input);

                    if (numeroParaVerificar % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Você ganhou R$ 100,00 reais.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.");
                }
            }
        });

        // Botão para sair do jogo
        JButton button4 = new JButton("Sair");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Saindo do jogo Lotofácil. Obrigado por jogar!");
                System.exit(0);
            }
        });

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.pack();
        frame.setVisible(true);
    }
}
