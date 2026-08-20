package estruturas_condicionais;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class APP {

    static void main() {
//        boolean estaChovendo = true;
//
//        if (estaChovendo) {
//            System.out.println("Leve um guarda-chuvas!");
//        }
//===================================================================================================================

//        int num1 = 1;
//        int num2 = 2;
//
//        boolean saoIguais = num1 == num2;
//
//        if (saoIguais) {
//            System.out.println("Sao iguais!");
//
//        }
//        else {
//            System.out.println("Sao diferentes!");
//        }

//=================================================================================================================

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um numero: ");
//        int nota = sc.nextInt();

//        if (num % 3 == 0) {
//            System.out.println("Multiplo de 3!");
//        }
//        else if (num % 5 == 0) {
//            System.out.println("multiplo de 5!");
//        }
//        else {
//            System.out.println("Numero invalido!");
//        }
//
//        String msg = (num > 18 ) ? "maior de idade" : "menor de idade";
//                ; (num % 5 == 0) ? "multiplo de 5"
//                ; "numero invalido";
//
//                System.out.println(msg);


//====================================================================================================================

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um numero: ");
//        int nota = sc.nextInt();
//
//        switch (nota) {
//            case 4:
//                System.out.println("Reprovado!");
//                break;
//            case 7:
//                System.out.println("Aporvado!");
//                break;
//            case 10:
//                System.out.println("Exelente!");
//                break;
//
//            default:
//                System.out.println("nota invalida!");


//=================================================================================================================


        String menu = """
                1 - entrar
                2 - cadastrar Produto
                3 - Listar produtos
                """;

        System.out.println(menu);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma opçao: ");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1 -> System.out.println("entrar no sistema");

            case 2 -> System.out.println("Cadastrar produto");

            case 3 -> System.out.println("Lista de produtos");


        }
    }














    }


