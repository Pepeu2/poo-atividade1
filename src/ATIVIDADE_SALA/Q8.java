package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q8 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTO VOCÊ GANHA POR HORA: R$ ");
        double valorHora = sc.nextDouble();

        System.out.print("QUANTAS HORAS VOCÊ TRABALHOU NO MÊS: ");
        double horasTrabalhadas = sc.nextDouble();

        // Salário bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // Descontos
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        // Salário líquido
        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("\n+ Salário Bruto: R$ " + salarioBruto);
        System.out.println("- IR (11%): R$ " + ir);
        System.out.println("- INSS (8%): R$ " + inss);
        System.out.println("- Sindicato (5%): R$ " + sindicato);
        System.out.println("= Salário Líquido: R$ " + salarioLiquido);

        sc.close();
    }
}



