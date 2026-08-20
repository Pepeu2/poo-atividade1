package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q10 {

         static void main() {

            Scanner sc = new Scanner(System.in);

            String senha;
            boolean senhaValida = false;

            while (!senhaValida) {

                System.out.print("Digite uma senha forte: ");
                senha = sc.nextLine();

                boolean temNumero = false;
                boolean temMaiuscula = false;

                for (int i = 0; i < senha.length(); i++) {

                    char caractere = senha.charAt(i);

                    if (Character.isDigit(caractere)) {
                        temNumero = true;
                    }

                    if (Character.isUpperCase(caractere)) {
                        temMaiuscula = true;
                    }
                }

                if (senha.length() < 8) {
                    System.out.println("A senha deve ter no mínimo 8 caracteres.");
                }

                if (!temNumero) {
                    System.out.println("A senha deve conter pelo menos 1 número.");
                }

                if (!temMaiuscula) {
                    System.out.println("A senha deve conter pelo menos 1 letra maiúscula.");
                }

                if (senha.length() >= 8 && temNumero && temMaiuscula) {
                    senhaValida = true;
                    System.out.println("Senha válida!");
                }
            }

            sc.close();
        }
    }

