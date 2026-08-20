package atividade;

import java.util.Scanner;

public class ATVIDADE_08 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO: ");
        double num1 = sc.nextDouble();

        String menu = """
                
                1 - ADICAO
                2 - SUBTRACAO
                3 - MULTIPLICAO
                4 - DIVISAO
                
                """;

        System.out.println(menu);

        System.out.println("QUAL OPCAO VOCE DESEJA ESCOLHER: ");
        int opcao = sc.nextInt();

        System.out.println("DIGITE OUTRO NUMERO: ");
        double num2 = sc.nextDouble();


        switch (opcao) {

            case 1 -> {

                double soma = num1 + num2;
                System.out.println("A SOMA DE: " + num1 + " + " + num2 + " = " + soma);

            }

            case 2 -> {

            }







        }






    }
}
