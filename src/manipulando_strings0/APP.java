package manipulando_strings0;

public class APP {

    static void main () {

        //String a = "Joao";
        //String b = "Joao";
        //System.out.println(a == b);

        //PARA SABER SE UMA VARIAVEL É IGUAL A OUTRA,
        //System.out.println(a.equals((b)));

        //System.out.println(a.length());

        //PARA VERIFICAR A LETRA OU NUMERO NUMA POSICAO ESPECIFICA.
        //System.out.println(a.charAt(0));

        //PARA SABER SE CONTEM TAIS CARACTERES.
        //System.out.println(a.contains("ao"));


        // =========================================================================================================

        //CONCATENAÇAO:

        String firstName = "Maria";
        String lastname = "Da Silva";

        //String mensage = "Ola" + " " + firstName + " " +lastname + "!";

        //String mensage = "Ola ".concat(firstName).concat("").concat(lastname).concat("!");
        // System.out.println(mensage);


        String mensagem = "";

        for (int i = 0; i < 1000; i++) {
            mensagem += i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);

            String resultado = sb.toString();
            System.out.println(resultado);
        }

    }
    }
