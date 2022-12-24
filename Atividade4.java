package atividade4;

import java.util.Scanner;

public class Atividade4 {

    String quebraTextoAoMeio (String str){

        int pos = str.length() / 2;

        String hal1 = str.substring(0, pos);
        String hal2 = str.substring(pos, str.length());
        StringBuilder result;

        StringBuilder stringBuilder1 = new StringBuilder(hal1);
        StringBuilder stringBuilder2 = new StringBuilder(hal2);

        result = new StringBuilder(stringBuilder1.reverse());
        result.append("");
        result.append(stringBuilder2.reverse());
        return result.toString();
    }
    public static void main(String[] args) {
        Atividade4 atividade4 = new Atividade4();
        Scanner scanner = new Scanner(System.in);
        String opcaoGlobal = "s";

        do {

            System.out.print("Texto:");
            String entrada = scanner.nextLine();        
            String result = atividade4.quebraTextoAoMeio(entrada);
            System.out.println("TEXTO DECRIPTOGRAFADO : "+ result);
            System.out.print("Deseja continuar adicionando mais textos? (s) sim, (n) não?: ");

            opcaoGlobal = scanner.next();
        } while (opcaoGlobal.equals("s") || opcaoGlobal.equals("S"));
    }


}
