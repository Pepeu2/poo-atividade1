package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q9 {

    public static void main() {

        Scanner sc = new Scanner(System.in);

        int opcao;
        int quantidade = 0;
        double peso;
        double maiorPeso = 0;
        double menorPeso = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar Peso");
            System.out.println("2. Finalizar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o peso do animal: ");
                    peso = sc.nextDouble();

                    quantidade++;

                    if (quantidade == 1) {
                        maiorPeso = peso;
                        menorPeso = peso;
                    } else {
                        if (peso > maiorPeso) {
                            maiorPeso = peso;
                        }

                        if (peso < menorPeso) {
                            menorPeso = peso;
                        }
                    }

                    System.out.println("Peso cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n===== RESULTADO =====");
                    System.out.println("Quantidade de animais registrados: " + quantidade);

                    if (quantidade > 0) {
                        System.out.println("Maior peso registrado: " + maiorPeso + " kg");
                        System.out.println("Menor peso registrado: " + menorPeso + " kg");
                    } else {
                        System.out.println("Nenhum animal foi registrado.");
                    }

                    System.out.println("Sistema finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 2);

        sc.close();
    }
}
