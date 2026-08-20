package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q2 {

    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("QUAL NUMERO DESEJA SABER SE E PAR OU IMPAR: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {

            System.out.println("NUMERO PAR!");

        }

        else {

            System.out.println("NUMERO IMPAR!");
        }

    }
}
