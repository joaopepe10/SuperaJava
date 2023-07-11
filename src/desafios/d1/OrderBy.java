package desafios.d1;

import java.util.*;

public class OrderBy {
    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> pair = new ArrayList<>();
    private List<Integer> odd = new ArrayList<>();
    private List<Integer> finalList = new ArrayList<>();


    public OrderBy(){
    }

    public OrderBy(List<Integer> n){
        this.numbers = n;
    }

    public OrderBy(Integer i){
        this.numbers.add(i);
    }

    //Ordenacao atraves da classe ArrayList
    public List<Integer> orderBy(){
        //Fazendo a separacao dos numeros pares e impares
        for (Integer i: this.numbers){
            if(i % 2 == 0){
                this.pair.add(i);
            }else if (i % 2 == 1){
                this.odd.add(i);
            }
        }
        //Metodos de ordenacao que ja vem prontos na classe ArrayList
        pair.sort(Comparator.naturalOrder());
        odd.sort(Comparator.reverseOrder());

        this.finalList.addAll(this.pair);
        this.finalList.addAll(this.odd);
        return this.finalList;
    }

    public void bubbleSort(){
        //CRIANDO UMA ARRAY E ADICIONANDO NUMEROS ENTRE 1 E 100 NELE PARA FAZER A ORDENACAO
        int[] x = new int[10];
        int[] pares = new int[5];
        int[] impares = new int[5];
        Random random = new Random();
        for (int i = 0; i < x.length; i++){
            x[i] = random.nextInt(100 - 1 +1)+1;
        }
        //SEPARANDO PARES DE IMPARES
        for(int i = 0;i< x.length; i++){
            if (x[i] % 2 == 0){
                pares[i] = x[i];
            }else if (x[i] % 2 ==1){
                impares[i] = x[i];
            }
        }

    }
}
