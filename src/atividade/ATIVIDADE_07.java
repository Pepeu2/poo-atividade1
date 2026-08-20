package atividade;

import java.util.Scanner;

public class ATIVIDADE_07 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("QUAL SEU NOME: ");
        String nome = sc.nextLine();

        System.out.println("QUAL SUA IDADE: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("VOCE É DE MENOR AINDA! ");
        }

        else if (idade >= 18 & idade < 50) {
            System.out.println("VOCE AINDA É NOVO!");
        }

        else {
            System.out.println("VOCE É IDOSO!");
        }





    }


}
