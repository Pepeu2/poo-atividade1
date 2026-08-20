package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q6 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O TIPO DE COMBUSTIVEL: A - ALCOOL / G - GASOSA: " );
        String tipoGas = sc.nextLine();
        System.out.println("DIGITE A QUANTIDADE DE LITROS QUE VOCE IRA COLOCAR: ");
        double quantidade = sc.nextDouble();

        if (tipoGas.equals("A")) {

            double preco1 = 4 * quantidade;
            System.out.println("O PRECO QUE VOCE DEVERA PAGAR É: " + preco1);

        }

        else if (tipoGas.equals("G")) {

            double preco2 = 5.5 * quantidade;
            System.out.println("O PRECO QUE VOCE DEVERA PAGAR É: " + preco2);
        }
        else {
            System.out.println("ERRO!");
        }

    }


}
