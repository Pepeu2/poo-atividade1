package atividade;

import java.util.Scanner;

public class ATIVIDADE_05 {

    static void main() {

        //SISTEMA DAS CEDULAS


        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O VALOR QUE DESEJA SACAR: ");
        int valor = sc.nextInt();

        int notaCem = valor / 100;
        int restoDeCem = valor % 100;

        int notaCinquenta = restoDeCem / 50;
        int restoDeCinquenta = restoDeCem % 50;

        int notaDeDez = restoDeCinquenta / 10;
        int restoDeDez = restoDeCinquenta % 10;

        int notaDeCinco = restoDeDez / 5;
        int restoDeCinco = restoDeDez % 5;

        System.out.println("VOCE TERA " + notaCem + " cedulas de 100");
        System.out.println("VOCE TERA " + notaCinquenta + " cedulas de 50");
        System.out.println("VOCE TERA " + notaDeDez + " cedulas de 10");
        System.out.println("VOCE TERA " + notaDeCinco + " cedulas de 5");

    }


}