package atividade3;

import java.util.Arrays;

public class atividade3 {

    public static void main(String[] args) {
        int array[] = { 1,2,3,4 };
        int k = 1, ocorrencias = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                 System.out.println( Math.abs((int)array[i] - (int) array[j]));
                 System.out.println("operacao: " + array[i] + " - "+ array[j]+ " = "+ Math.abs(array[j]- array[i+1]));
                    if (k == Math.abs((int)array[i] - (int) array[j])) {
                        ocorrencias++;
                    }
                
            }


        }
        System.out.println("ocorrencias: " + ocorrencias);
    }

}
