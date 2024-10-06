package Questao4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double faturamentoTotal = 0;

        List<FaturamentoEstado> estados = new ArrayList<>();

        estados.add(new FaturamentoEstado("SP", 67836.43));
        estados.add(new FaturamentoEstado("RJ", 36678.66));
        estados.add(new FaturamentoEstado("MG", 29229.88));
        estados.add(new FaturamentoEstado("ES", 27165.48));
        estados.add(new FaturamentoEstado("Outros", 19849.53));

        for (FaturamentoEstado faturamento : estados) {
            faturamentoTotal += faturamento.getValor();
        }

        for (FaturamentoEstado faturamento : estados) {
            double percentual = (faturamento.getValor() / faturamentoTotal) * 100;
            faturamento.setPercentual(percentual);
        }

        System.out.println("Percentual de representação que cada estado teve dentro do valor total mensal da distribuidora:");
        for (FaturamentoEstado faturamento : estados) {
            System.out.println(faturamento);
        }
    }
}
