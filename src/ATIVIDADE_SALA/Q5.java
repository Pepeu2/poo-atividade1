package ATIVIDADE_SALA;

import java.util.Scanner;

public class Q5 {

    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("QUAL O USUARIO: ");
        String usuario = sc.nextLine();

        System.out.println("QUAL A SENHA: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {

            System.out.println("LOGUIN BEM SUCEDIDO!");
        }
        else {
            System.out.println("USUARIO OU SENHA INCORRETOS!");
        }

    }
}
