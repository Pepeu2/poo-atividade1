package atividade;

import java.util.Scanner;

public class ATIVIDADE_01 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE O PRIMEIRO NUMERO: ");
        int num1 = sc.nextInt();

        String menu = """
            1 - ADIÇÃO
            2 - SUBTRAÇÃO
            3 - DIVISÃO
            4 - MULTIPLICAÇÃO
            """;

        System.out.print(menu);
        System.out.print("DIGITE UMA OPÇÃO: ");
        int opcao = sc.nextInt();

        System.out.print("DIGITE O SEGUNDO NUMERO: ");
        int num2 = sc.nextInt();

        switch (opcao) {

            case 1 -> {
                int soma1 = num1 + num2;
                System.out.println("A soma de " + num1 + " + " + num2 + " = " + soma1);
            }

            case 2 -> {
                int soma2 = num1 - num2;
                System.out.println("A subtração de " +  num1 + " - " + num2 + " = " + soma2);
            }

            case 3 -> {
                if (num2 != 0) {
                    int soma3 = num1 / num2;
                    System.out.println("A divisão de " + num1 + " / " + num2 + " = " + soma3);
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
            }
            case 4 -> {
                int soma4 = num1 * num2;
                System.out.println("A multiplição de " + num1 + " x " + num2 + " = " + soma4);

            }
            default -> System.out.println("OPÇÃO INVÁLIDA!");
        }

            sc.close();
        }

            ;
    }