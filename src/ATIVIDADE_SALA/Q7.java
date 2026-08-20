package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q7 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("QUAL TABUADA DESEJA VER: ");
        int numero = sc.nextInt();

        for (int i = 1; i < 11; i++) {

            System.out.println(numero + "X" + i + "=" + (numero*i));
        }

    }

}
