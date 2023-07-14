package desafios.d3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Target {
    private int par;
    private Integer alvo = 1;

    public Target() {
    }

    public Target(Integer alvo){
        this.alvo = alvo;
    }
    public void calcDifference() {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (int i = lista.size() - 1;i > 0;--i){
            //ATRIBUICAO DO I PARA O CONT PARA TER DOIS CONTADORES PARA QUANDO ENTRAR NO WHILE
            int cont = i;
            boolean saida = true;
            while (saida){
                cont--;
                if (lista.get(i) - lista.get(cont) == this.alvo){
                    this.par+=1;
                    System.out.println("Par encontrado: " + lista.get(i) + "-" + lista.get(i-1) + "=" + this.alvo);
                }if (cont == 0){
                    saida = false;
                }
            }
        }
        System.out.println("Alvo: " + this.alvo + "\nQuantidade de par encontrado: " + this.par);
    }

    public void calcDifference(Integer alvo, Integer tam) {
        Random random = new Random();
        Integer[] lista = new Integer[tam];
        for (int i = 0;i < lista.length;++i){
            lista[i] = random.nextInt(101);
        }
        for (int i = lista.length - 1;i > 0;--i){
            //ATRIBUICAO DO I PARA O CONT PARA TER DOIS CONTADORES PARA QUANDO ENTRAR NO WHILE
            int cont = i;
            boolean saida = true;
            while (saida){
                cont--;
                if (lista[i] - lista[cont] == alvo){
                    this.par+=1;
                    System.out.println("Par encontrado: " + lista[i] + "-" + lista[cont] + "=" + alvo);
                }if (cont == 0){
                    saida = false;
                }
            }
        }
        System.out.println("Alvo: " + alvo + "\nQuantidade de par encontrado: " + this.par);
    }

    public void setAlvo(Integer alvo) {
        this.alvo = alvo;
    }
}
