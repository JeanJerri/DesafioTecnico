package Questao3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int menorValor;
        int maiorValor = 0;
        double media = 0;
        int qtd = 0;
        int qtdSuperiorAMedia = 0;

        ObjectMapper objectMapper = new ObjectMapper();

        List<FaturamentoMensal> faturamentoDiario = objectMapper.readValue(new File("dados.json"),
                new TypeReference<List<FaturamentoMensal>>() {});

//        for (FaturamentoMensal faturamentoDia : faturamentoDiario) {
//            System.out.println(faturamentoDia);
//        }

        for (FaturamentoMensal faturamentoDia : faturamentoDiario) {
            if (maiorValor < faturamentoDia.getValor()) {
                maiorValor = faturamentoDia.getValor();
            }

            if (faturamentoDia.getValor() > 0) {
                media += faturamentoDia.getValor();
                qtd++;
            }
        }

        media = media/qtd;
        menorValor = maiorValor;

        for (FaturamentoMensal faturamentoDia : faturamentoDiario) {
            if (menorValor > faturamentoDia.getValor()) {
                menorValor = faturamentoDia.getValor();
            }

            if (faturamentoDia.getValor() > media) {
                qtdSuperiorAMedia++;
            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi de " + menorValor + ".");
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês foi de " + maiorValor + ".");
//        System.out.println(media);
//        System.out.println(qtd);
        System.out.println("Em " + qtdSuperiorAMedia + " dias o valor de faturamento diário foi superior à média " +
                "mensal (" + media + ").");
    }
}
