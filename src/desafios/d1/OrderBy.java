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
        int[] x = {9, 7, 6, 5, 3 ,2 , 1, 8, 4};
        int aux = 0;
        int tamanhoPar = 0;
        int tamanhoImpar = 0;
        Random random = new Random();
        /*for (int i = 0; i < x.length; i++){
            x[i] = random.nextInt(100 - 1 + 1)+1;
        }*/
        //OBTENDO O TAMANHO DO ARRAY DE PARES E DE IMPARES
        for(int i = 0;i < x.length; ++i){
            if (x[i] % 2 == 0){
                tamanhoPar+=1;
            }else if (x[i] % 2 == 1){
                tamanhoImpar+=1;
            }
        }
        int pares[] = new int[tamanhoPar];
        int impares[] = new int[tamanhoImpar];

        //ADCIONANDO OS IMPARES E PARES EM SUAS DEVIDAS LISTAS
        int indexPar = 0;
        int indexImpar = 0;
        for(int i = 0;i < x.length; ++i){
            if (x[i] % 2 == 0){
                pares[indexPar] = x[i];
                indexPar++;
            }else {
                impares[indexImpar] = x[i];
                indexImpar++;
            }
        }

        for (int i = 0;i < pares.length;++i){
            for (int j = 0;j < pares.length - 1;++j){
                if (pares[j] > pares[j + 1]){
                    aux = pares[j];
                    pares[j] = pares[j+1];
                    pares[j + 1] = aux;
                }
            }
        }
        for (int i = 0;i < pares.length;i++){
            System.out.print(pares[i]+" ");
        }

    }
}
