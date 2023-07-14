package desafios.d3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor alvo: ");
        Integer x = in.nextInt();
        System.out.println("Digite o tamanho da lista: ");
        Integer tam = in.nextInt();
        Target t = new Target();
        t.calcDifference(x, tam);
    }
}
