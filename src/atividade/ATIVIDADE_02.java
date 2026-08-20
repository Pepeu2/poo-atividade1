package atividade;

import java.util.Scanner;

public class ATIVIDADE_02 {

    static void main() {

        //ATIVIDADE DE MAIOR OU MENOR

        Scanner sc = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NUMERO: ");
        int num1 = sc.nextInt();


        System.out.print("DIGITE O SEGUNDO NUMERO: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.print("MAIOR NUMERO É O " + num1);

        }
        else if (num1 < num2) {
            System.out.println("MAIOR NUMERO É O " +  num2);
        }
        else {
            System.out.println("SÃO IGUAIS");
        }

    }
}

