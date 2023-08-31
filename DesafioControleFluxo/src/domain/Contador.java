package domain;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // TODO: 31/08/2023 O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros,
        //  com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console
        //  (System.out.print) dos números incrementados, exemplo: Se você passar os números 12 e 30,
        //  logo teremos uma interação (for) com 18 ocorrências para imprimir os números,
        //  exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
        //  Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada
        //  chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro."
        Scanner input = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int paramentro1 = input.nextInt();

        System.out.println("Valor 2: ");
        int paramentro2 = input.nextInt();

        int diferenca = paramentro2 - paramentro1;

        for (int i = 1; i <= diferenca; ++i){
            System.out.println("Imprimindo o número " + i);
        }

    }
}
