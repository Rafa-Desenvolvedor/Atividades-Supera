import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numerosEntradaPares = new ArrayList<Integer>();
        ArrayList<Integer> numerosEntradaImpares = new ArrayList<Integer>();
        String opcaoGlobal = "s";

        System.out.println("Adicione os números inteiros positivos maior que 1: ");

        do {

            System.out.print("Número:");
            int entrada = scanner.nextInt();
            /*
             * Condicional para selecionar os valores do range N (1 < N <= 105)
             * Preferi criar dois arrays para adicionar os números impares e pares. 
             * 
             */
            if (entrada > 1 && entrada <= Math.pow(10, 5)) {
                if (entrada % 2 == 0) {
                    numerosEntradaPares.add(entrada);
                } else {
                    numerosEntradaImpares.add(entrada);
                }

            } else {
                System.out.println("O número de entrada não satisfaz a condição N (1 < N <= 105)");
            }

            System.out.print("Deseja continuar adicionando mais números? (s) sim, (n) não?: ");

            opcaoGlobal = scanner.next();
        } while (opcaoGlobal.equals("s") || opcaoGlobal.equals("S"));

        System.out.println(exercicio1.unirArrays(numerosEntradaImpares, numerosEntradaPares).toString());

    }

    /*
     * Métodos para unir dois arrays
     */
    public ArrayList<Integer> unirArrays(ArrayList<Integer> numerosEntradaImpares,
            ArrayList<Integer> numerosEntradaPares) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        numerosEntradaImpares.sort(Comparator.naturalOrder());
        numerosEntradaImpares.sort(Comparator.reverseOrder());

        numerosEntradaPares.sort(Comparator.naturalOrder());
        numerosEntradaPares.sort(Comparator.reverseOrder());

        result.addAll(numerosEntradaPares);
        result.addAll(numerosEntradaImpares);

        return result;

    }

}
