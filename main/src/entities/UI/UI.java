
package entities.UI;

import entities.Aposta;
import entities.Jogador;
import entities.tipoDeAposta.PremioCentenaSeca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UI {

    public static Integer inicio() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        List<Aposta> aposta = new ArrayList<>();
        String nome;
        String cpf;
        Integer x = novoJogo();
        Jogador jogador;

        switch (x) {
            case 1:// código para x == 1 (centena seca)

                System.out.println("Centena Seca");
                //dados pessoais
                System.out.println();
                System.out.print("Nome: ");
                nome = sc.nextLine();
                System.out.print("CPF: ");
                cpf = sc.nextLine();

                jogador = new Jogador(nome, cpf);


                //Aposta

                System.out.print("Valor da aposta, aposta centena vale 1 x 600,00 : ");
                Double valorAposta = sc.nextDouble();
                sc.nextLine();

                //Tipo da aposta

                PremioCentenaSeca premio = new PremioCentenaSeca();
                premio.setValor(valorAposta);

                //Numeros
                System.out.print("Digite a centena: ");
                Integer numeros = sc.nextInt();
                Aposta novaAposta = new Aposta(valorAposta, jogador, premio, numeros);
                aposta.add(novaAposta);


                System.out.println("\n");
                System.out.print(novaAposta.detalhesCentena());

                break;
            case 2:
                // código para x == 2 (Dezena Seca)
                break;
            case 3:
                // código para x == 3 (Milhar Seca)

                System.out.println("Milhar Seca");
                //dados pessoais
                System.out.println();
                System.out.print("Nome: ");
                nome = sc.nextLine();
                System.out.print("CPF: ");
                cpf = sc.nextLine();

                jogador = new Jogador(nome, cpf);


                //Aposta

                System.out.print("Valor da aposta, aposta minhar vale 1 x 600,00 : ");
                valorAposta = sc.nextDouble();
                sc.nextLine();

                //Tipo da aposta

                premio = new PremioCentenaSeca();
                premio.setValor(valorAposta);

                //Numeros
                System.out.print("Digite a centena: ");
                numeros = sc.nextInt();
                novaAposta = new Aposta(valorAposta, jogador, premio, numeros);
                aposta.add(novaAposta);


                System.out.println("\n");
                System.out.print(novaAposta.detalhesCentena());

                break;
            case 4:
                // código para x == 4 (Grupo)
                break;
            case 5:
                // código para resultado
                break;
            default:
                System.out.println("erro - switch case X");
                break;
        }

        System.out.println("*************************************");
        System.out.println("************    debug    ************");
        System.out.println("*************************************");
        System.out.println();
        System.out.println(aposta);
        sc.close();

        return null;
    }

    public static int novoJogo() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int escolha = 0; // Move a declaração para fora do bloco try

        do {
            try {
                System.out.println("Bem-vindo ao Jogo do Bicho. Que tipo de aposta você deseja fazer?");
                System.out.println("1 - Centena Seca");
                System.out.println("2 - Dezena Seca");
                System.out.println("3 - Milhar Seca");
                System.out.println("4 - Grupo");
                System.out.println("5 - Resultado");
                System.out.print("-> ");
                escolha = sc.nextInt();
                if (escolha < 1 || escolha > 4) {
                    System.out.println("Opção inválida, a escolha deve ser entre 1 e 4\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida, só são permitidos números de 1 a 4");
                sc.nextLine(); // Limpa o buffer do scanner
            }
        } while (escolha < 1 || escolha > 4);

        System.out.println();

        sc.close();
        return escolha;
    }


}
