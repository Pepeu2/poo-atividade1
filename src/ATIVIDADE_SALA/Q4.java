package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q4 {

    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("QUAL SEU PESO: ");
        int peso = sc.nextInt();

        System.out.println("QUAL SUA ALTURA: ");
        int altura = sc.nextInt();

        int imc = peso / (altura * altura);


        if (imc < 18.5) {
            System.out.println("ABAIXO DO PESO!");
        }

        else if (imc > 18.5 & imc < 25) {
            System.out.println("PESO NORMAL!");
        }

        else if (imc > 25 & imc < 30) {
            System.out.println("SOBREPESO");
        }
        else {
            System.out.println("OBESO");
        }
    }


}
