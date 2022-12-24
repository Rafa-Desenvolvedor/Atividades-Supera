package atividade2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

    ArrayList<String> calcularTroco(double valor){
        int nota100 = 100;
        int nota50 = 50;
        int nota20 = 20;
        int nota10 = 10;
        int nota5 = 5;
        int nota2 = 2;

        float moeda1 = 1;
        float moeda050 = (float) 0.5;
        float moeda025 = (float) 0.25;
        float moeda010 = (float) 0.10;
        float moeda005 = (float) 0.05;
        float moeda001 = (float) 0.01;

        ArrayList<String> valoresMoedas = new ArrayList<String>();
        ArrayList<String> valoresNotas = new ArrayList<String>();
        ArrayList<String> unirArray = new ArrayList<String>();

        valoresMoedas.add("MOEDAS\n");
        valoresNotas.add("NOTAS\n");

        if (valor >= nota100) {
            int intPart = (int) (valor / nota100);
            valoresNotas.add(intPart + " nota(s) de R$ 100.00\n");
            valor = valor % nota100;
        }else{
            valoresNotas.add(" 0 nota(s) de R$ 100.00\n");
        }

        if (valor <= nota100 && valor >= nota50) {
            int intPart = (int) (valor / nota50);
            valoresNotas.add(intPart + " nota(s) de R$ 50.00\n");
            valor = valor % nota50;
        }else{
            valoresNotas.add(" 0 nota(s) de R$ 50.00\n");
        }

        if (valor < nota50 && valor >= nota20) {
            int intPart = (int) valor / nota20;
            valoresNotas.add(intPart + " nota(s) de R$ 20.00\n");
            valor = valor % nota20;
        }else{
            valoresNotas.add(" 0 nota(s) de R$ 20.00\n");
        }

        if (valor < nota20 && valor >=nota10){
            int intPart = (int) (valor /nota10);
            valoresNotas.add(intPart +" nota(s) de R$ 10.00\n" );
            valor = valor % nota10;
        }else{
            valoresNotas.add(" 0 nota(s) de R$ 10.00\n");
        }

        if (valor < nota10 && valor >=nota5){
            int intPart = (int) (valor /nota5);
            valoresNotas.add(intPart +" nota(s) de R$ 5.00\n" );
            valor = valor % nota5;
        }else{
            valoresNotas.add(" 0 nota(s) de R$ 5.00\n");
        }

        if (valor < nota5 && valor >=nota2){
            int intPart = (int) (valor /nota2);
            valoresNotas.add(intPart +" nota(s) de R$ 2.00\n" );
            valor = valor % nota2;
        } else{
            valoresNotas.add(" 0 nota(s) de R$ 2.00\n");
        }   

        if (valor < nota2){
            
            if (valor >= moeda1){                    
                int intPart =  (int)(valor);
                valoresMoedas.add(intPart +" moedas(s) de R$ 1.00\n" );
                valor = valor % moeda1;
            } else{
                valoresNotas.add(" 0 moedas(s) de R$ 1.00\n");
            }   
            if (valor < moeda1 && valor >= moeda050){
                int intPart =  (int) (valor / moeda050);
                valoresMoedas.add(intPart +" moedas(s) de R$ 0.50\n" );
                valor = valor % moeda050;
            }else{
                valoresMoedas.add(" 0 moedas(s) de R$ 0.50\n");
            }   

            if (valor < moeda050 && valor >= moeda025){
                int intPart =  (int) Math.round(valor / moeda025);
                valoresMoedas.add(intPart +" moedas(s) de R$ 0.25\n" );
                valor = valor % moeda025;
            }else{
                valoresMoedas.add(" 0 moedas(s) de R$ 0.25\n");
            }   
            if (valor < moeda025 && valor >= moeda010){
                int intPart =  (int) Math.round(valor / moeda010);
                valoresMoedas.add(intPart +" moedas(s) de R$ 0.10\n" );
                valor = valor % moeda010;
            }else{
                valoresNotas.add(" 0 moedas(s) de R$ 0.10\n");
            }   
            if (valor < moeda010 && valor >= moeda005){
                int intPart =  (int) Math.round(valor / moeda005);
                valoresMoedas.add(intPart +" moedas(s) de R$ 0.05\n" );
                valor = valor % moeda005;
            }else{
                valoresMoedas.add(" 0 moedas(s) de R$ 0.05\n");
            }   

            if (valor < moeda005 && valor >= moeda001){
                int intPart =  (int) Math.round(valor / moeda001);
                valoresMoedas.add(intPart +" moedas(s) de R$ 0.01\n" );
                valor = valor % moeda001;
            }else{
                valoresNotas.add(" 0 moedas(s) de R$ 0.01\n");
            }   

        }
            
        unirArray.addAll(valoresNotas);
        unirArray.addAll(valoresMoedas);

        return unirArray;
    }
    public static void main(String[] args) {
        Atividade2 atividade2 = new Atividade2();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double valor;
        System.out.println("Adicione o valor no ponto flutuante  N (0 ≤ N ≤ 1000000.00).: ");
        valor = scanner.nextFloat();   
        System.out.println(atividade2.calcularTroco(valor).toString());
    }
}
