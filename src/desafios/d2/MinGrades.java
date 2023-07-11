package desafios.d2;

public class MinGrades {
    //CLASSE PARA OBTER A QUANTIDADE MINIMA DE NOTAS NECESSARIAS PARA UM DETERMINADO VALOR
    private int[] grades = {100, 50, 20, 10, 5, 2};

    private int[] count = new int[grades.length];
    private float[] coins = {1.0f, 0.5f, 0.25f, 0.1f, 0.05f, 0.01f};


    public void calculateGradesCoins(){
        float value = 576.73f;
        float aux = 0f;

        for (int i = 0; i < grades.length; ++i){
            if (value > grades[i]){
                //CASTING PARA ATRIBUIR A QUANTIDADE DE NOTAS NECESSARIAS DE ACORDO COM SEU INDICE
                count[i] = (int) value / grades[i];
                //ATUALIZACAO DO VALOR DE VALUE PARA A PROXIMA ITERACAO DO FOR
                value = value - (count[i] * grades[i]);
            }
        }
        System.out.println("Quantidade de notas de R$100: " + count[0]);
        System.out.println("Quantidade de notas de R$50: " + count[1]);
        System.out.println("Quantidade de notas de R$20: " + count[2]);
        System.out.println("Quantidade de notas de R$10: " + count[3]);
        System.out.println("Quantidade de notas de R$5: " + count[4]);
        System.out.println("Quantidade de notas de R$2: " + count[5]);

    }
}
