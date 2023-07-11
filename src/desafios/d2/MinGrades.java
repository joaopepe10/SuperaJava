package desafios.d2;

import java.text.DecimalFormat;

public class MinGrades {
    //CLASSE PARA OBTER A QUANTIDADE MINIMA DE NOTAS e MOEDAS NECESSARIAS PARA UM DETERMINADO VALOR
    private int[] grades = {100, 50, 20, 10, 5, 2};

    //CADA INDICE DE COUNT SEGUE A ORDEM DE GRADES
    private int[] countGrades = new int[grades.length];
    private Double[] coins = {1.0, 0.5, 0.25, 0.1, 0.05, 0.01};
    private int[] countCoins = new int[coins.length];


    public void calculateGradesCoins(){
        Double value = 576.73;
        //CALCULAR QUANTIDADE DE NOTAS
        for (int i = 0; i < grades.length; ++i){
            //VERIFICACAO PARA EVITAR ERROS AO LONGO DA APLICACAO, POIS SE O VALUE E MAIOR QUE AS NOTAS ELE PODE FAZER A DIVISAO E SABER A QUANTIDADE NECESSARIA DE NOTAS USADAS
            if (value > grades[i]){
                //CASTING PARA ATRIBUIR A QUANTIDADE DE NOTAS NECESSARIAS DE ACORDO COM SEU INDICE
                double x = value / grades[i];
                countGrades[i] = (int)x;
                //ATUALIZACAO DO VALOR DE VALUE PARA A PROXIMA ITERACAO DO FOR
                value = value - (countGrades[i] * grades[i]);
            }
        }

        for(int i = 0; i < coins.length; ++i){
            if (value > coins[i]){
                double result = value / coins[i];
                //CASTING PARA OBTER O VALOR INTEIRO DA QUANTIDADE DE MOEDAS DE DETERMINADO TIPO DE ACORDO COM O INDICE
                countCoins[i] = (int) result;
                value = value - (countCoins[i] * coins[i]);
            }
        }
        System.out.println("Notas: ");
        System.out.println("\tQuantidade de notas de R$100: " + countGrades[0]);
        System.out.println("\tQuantidade de notas de R$50: " + countGrades[1]);
        System.out.println("\tQuantidade de notas de R$20: " + countGrades[2]);
        System.out.println("\tQuantidade de notas de R$10: " + countGrades[3]);
        System.out.println("\tQuantidade de notas de R$5: " + countGrades[4]);
        System.out.println("\tQuantidade de notas de R$2: " + countGrades[5]);
        System.out.println("Moedas: ");
        System.out.println("\tQuantidade de moedas de R$1.00: " + countCoins[0]);
        System.out.println("\tQuantidade de moedas de R$0.50: " + countCoins[1]);
        System.out.println("\tQuantidade de moedas de R$0.25: " + countCoins[2]);
        System.out.println("\tQuantidade de moedas de R$0.10: " + countCoins[3]);
        System.out.println("\tQuantidade de moedas de R$0.05: " + countCoins[4]);
        System.out.println("\tQuantidade de moedas de R$0.01: " + countCoins[5]);

    }
    public void calculateGradesCoins(Double value){
        //CALCULAR QUANTIDADE DE NOTAS
        for (int i = 0; i < grades.length; ++i){
            //VERIFICACAO PARA EVITAR ERROS AO LONGO DA APLICACAO, POIS SE O VALUE E MAIOR QUE AS NOTAS ELE PODE FAZER A DIVISAO E SABER A QUANTIDADE NECESSARIA DE NOTAS USADAS
            if (value > grades[i]){
                //CASTING PARA ATRIBUIR A QUANTIDADE DE NOTAS NECESSARIAS DE ACORDO COM SEU INDICE
                double x = value / grades[i];
                countGrades[i] = (int)x;
                //ATUALIZACAO DO VALOR DE VALUE PARA A PROXIMA ITERACAO DO FOR
                value = value - (countGrades[i] * grades[i]);
            }
        }
        //CALCULANDO QUANTIDADE DE MOEDAS USADAS
        for(int i = 0; i < coins.length; ++i){
            if (value > coins[i]){
                value = Math.round(value * 100.0) / 100.0;
                double result = value / coins[i];
                //CASTING PARA OBTER O VALOR INTEIRO DA QUANTIDADE DE MOEDAS DE DETERMINADO TIPO DE ACORDO COM O INDICE
                countCoins[i] = (int) result;
                value = value - (countCoins[i] * coins[i]);
            }
        }
        System.out.println("Notas: ");
        System.out.println("\tQuantidade de notas de R$100: " + countGrades[0]);
        System.out.println("\tQuantidade de notas de R$50: " + countGrades[1]);
        System.out.println("\tQuantidade de notas de R$20: " + countGrades[2]);
        System.out.println("\tQuantidade de notas de R$10: " + countGrades[3]);
        System.out.println("\tQuantidade de notas de R$5: " + countGrades[4]);
        System.out.println("\tQuantidade de notas de R$2: " + countGrades[5]);
        System.out.println("Moedas: ");
        System.out.println("\tQuantidade de moedas de R$1.00: " + countCoins[0]);
        System.out.println("\tQuantidade de moedas de R$0.50: " + countCoins[1]);
        System.out.println("\tQuantidade de moedas de R$0.25: " + countCoins[2]);
        System.out.println("\tQuantidade de moedas de R$0.10: " + countCoins[3]);
        System.out.println("\tQuantidade de moedas de R$0.05: " + countCoins[4]);
        System.out.println("\tQuantidade de moedas de R$0.01: " + countCoins[5]);

    }
}
