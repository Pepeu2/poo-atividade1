package atividade;

import java.util.Scanner;

public class ATIVIDADE_03 {

    static void main() {

        //ATIVIDADE DO BOLETIM

        Scanner sc = new Scanner(System.in);

        System.out.print("DIGITE SUA PRIMEIRA NOTA: ");
        double nota1 = sc.nextDouble();

        System.out.print("DIGITE SUA SEGUNDA NOTA: ");
        double nota2 = sc.nextDouble();

        System.out.print("DIGITE SUA TERCEIRA NOTA: ");
        double nota3 = sc.nextDouble();

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        if (media >= 7) {
            System.out.print("APROVADO COM MEDIA " + media);
        }
        else if (media < 5) {
            System.out.print("REPROVADO COM MEDIA " + media);
        }
        else {
            System.out.print("RECUPERAÇÃO COM MEDIA " + media);
        }

    }
}
