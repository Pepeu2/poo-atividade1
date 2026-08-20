package atividade;

import java.util.Scanner;

public class ATIVIDADE_06 {

    static void main() {

        //SISTEMA DE SALARIO

        Scanner sc = new Scanner(System.in);
        System.out.println("QUAL SEU SALARIO: ");
        double salario = sc.nextDouble();

        if (salario <= 1500) {

            double porcentagem = salario * 0.15;
            double somaPorcentagem = salario + porcentagem;
            System.out.println("1 - SEU NOVO SAALRIO É DE: " + somaPorcentagem);

        }

        else if (salario >= 1501 & salario <= 3000) {

            double porcentagem2 = salario * 0.10;
            double somaPorcentagem2 = salario + porcentagem2;
            System.out.println("2 - SEU NOVO SALARIO É: " + somaPorcentagem2);

        }

        else if (salario > 3000) {

            double porcentagem3 = salario * 0.05;
            double somaPorcentagem = salario + porcentagem3;
            System.out.println("3 - SEU NOVO SALARIO É: " + somaPorcentagem);
        }

        else {
            System.out.println("ERRO!!!");
        }
    }
}
