package desafios.d1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaTeste = new ArrayList<>();
        listaTeste.addAll(Arrays.asList(10,4,32,34,543,3456,654,567,87,6789,98));
        OrderBy orderBy = new OrderBy();
        orderBy.setNumbers(listaTeste);
        /*System.out.println(orderBy.orderBy());*/
        orderBy.bubbleSort();
    }
}