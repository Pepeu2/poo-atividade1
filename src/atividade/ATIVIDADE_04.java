package atividade;

import java.util.Scanner;

public class ATIVIDADE_04 {

    static void main() {

        //CONVERSOR METRICO

        Scanner sc = new Scanner(System.in);

        String menu = """
        1 - METROS PARA CENTÍMETROS
        2 - CENTÍMETROS PARA METROS
        3 - QUILOS PARA GRAMAS
        4 - GRAMAS PARA QUILO
        """;

        System.out.println(menu);

        System.out.println("DIGITE UMA OPÇÃO:");
        int opcao = sc.nextInt();

        switch (opcao) {

            case 1 -> {
                Scanner um = new Scanner(System.in);
                System.out.println("QUAL NUMERO EM METROS QUE DESEJA TRANSFORMAR EM CENTIMETROS: ");
                double metros = um.nextDouble();
                double resultadoMetros = metros * 100;
                System.out.println("O RESULTADO DE METROS PARA CENTIMETROS É: " + resultadoMetros);
            }

            case 2 -> {
                Scanner dois = new Scanner(System.in);
                System.out.println("QUAL NUMERO EM CENTIMETROS QUE DESEJA TRANSFORMAR EM METROS:");
                double centimetros = dois.nextDouble();
                double resultadoCentimetros = centimetros / 100;
                System.out.println("O RESULTADO DE CENTIMETROS PARA METROS É: " + resultadoCentimetros);

            }

            case 3 -> {
                Scanner tres = new Scanner(System.in);
                System.out.println("QUANTOS KILOS VOCE DESEJA TRANSFORMAR EM GRAMAS: ");
                int quilos = sc.nextInt();
                int resultadoKilos = quilos * 1000;
                System.out.println("O RESULTADO DE KILOS PARA GRAMAS É: " + resultadoKilos);

            }

            case 4 -> {
                Scanner quatro = new Scanner(System.in);
                System.out.println("QUANTAS GRAMAS VOCE DESEJA TRANSFORMAR EM KILOS: ");
                int gramas = quatro.nextInt();
                int resultadoGramas = gramas / 1000;
                System.out.println("O RESULTADO DE GRAMAS PARA KILOS É: " + resultadoGramas);


            }
        }

    }
}

