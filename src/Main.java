import desafios.d1.OrderBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.addAll(Arrays.asList(10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98));
        OrderBy orderBy = new OrderBy(l);
        System.out.println(orderBy.orderBy());
    }
}