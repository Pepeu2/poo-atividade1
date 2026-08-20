package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q1 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("QUAL SEU NOME: ");
        String nome = sc.nextLine();

        System.out.println("QUAL SUA IDADE: ");
        int idade = sc.nextInt();

        System.out.println("SEU NOME É: " + nome + " SUA IDADE É: " + idade);

    }

}
