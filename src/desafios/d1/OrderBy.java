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
    public List<Integer> orderByLambda(){
        //USANDO A FUNCAO LAMBDA PARA DEIXAR O CODIGO MENOR E MAIS FACIL DE VIZUALIZAR
        this.numbers.forEach((v)->{
            if (v % 2 == 0){
                pair.add(v);
            }else {
                odd.add(v);
            }
        });
        pair.sort(Comparator.naturalOrder());
        odd.sort(Comparator.reverseOrder());

        this.finalList.addAll(this.pair);
        this.finalList.addAll(this.odd);
        return this.finalList;
    }


    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getPair() {
        return pair;
    }

    public void setPair(List<Integer> pair) {
        this.pair = pair;
    }

    public List<Integer> getOdd() {
        return odd;
    }

    public void setOdd(List<Integer> odd) {
        this.odd = odd;
    }

    public List<Integer> getFinalList() {
        return finalList;
    }

    public void setFinalList(List<Integer> finalList) {
        this.finalList = finalList;
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
        System.out.println("Lista desorndenada: ");
        for (int i = 0; i < x.length;++i){
            System.out.print(x[i]+" ");
        }
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
        //COM OS NUMEROS PARES SEPARADOS POSSO ORDENAR OS MESMOS COM O BUBBLE SORT
        for (int i = 0;i < pares.length;++i){
            for (int j = 0;j < pares.length - 1;++j){
                if (pares[j] > pares[j + 1]){
                    aux = pares[j];
                    pares[j] = pares[j+1];
                    pares[j + 1] = aux;
                }
            }
        }
        for (int i = 0;i < impares.length;++i){
            for (int j = 0;j < impares.length - 1;++j){
                if (impares[j] < impares[j + 1]){
                    aux = impares[j];
                    impares[j] = impares[j+1];
                    impares[j + 1] = aux;
                }
            }
        }
        System.out.println("\nNumeros pares: ");
        for (int i = 0;i < pares.length;++i){
            System.out.print(pares[i]+" ");
        }
        System.out.println("\nNumeros impares: ");
        for (int i = 0; i< impares.length; ++i){
            System.out.print(impares[i]+" ");
        }

        //REFAZENDO A LISTA COM OS NUMEROS PARES E IMPARES
        for (int i = 0; i < (impares.length + pares.length); ++i){
            if(i < pares.length){
                x[i] = pares[i];
            } else {
                //ARRAY SUBTRAIDO PELO TAMANHO DE PARES.LENGTH PARA CHEGAR NO INDICE 0 DE IMPARES E TERMINAR DE ATRIBUIR AO INDICE ATUAL DE X
                x[i] = impares[i - pares.length];
            }
        }
        System.out.println("\nNumeros ordenados: ");
        for (int i = 0; i< x.length; ++i){
            System.out.print(x[i]+" ");
        }

    }
}
