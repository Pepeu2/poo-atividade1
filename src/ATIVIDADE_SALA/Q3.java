package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q3 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("QUAL O PRIMEIRO NUMERO: ");
        int num1 = sc.nextInt();

        System.out.println("QUAL O SEGUNDO NUMERO: ");
        int num2 = sc.nextInt();

        System.out.println("QUAL O TERCEIRO NUMERO: ");
        int num3 = sc.nextInt();


        if (num1 > num2 & num1 > num3) {

            System.out.println("MAIOR NUMERO É O UM!");
        }

        else if (num2 > num1 & num2 > num3) {

            System.out.println("MAIOR NUMERO É O DOIS!");
        }
        else {
            System.out.println("MAIOR NUMERO É O TRES!");
        }


    }
}
