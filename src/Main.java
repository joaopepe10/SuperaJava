import desafios.d1.OrderBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> automaticList = new ArrayList<>();
        List<Integer> manualList = new ArrayList<>();
        int opc = 0;
        //ADICIONANDO MANUALMENTE
        automaticList.addAll(Arrays.asList(10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98));
        OrderBy orderBy = new OrderBy(automaticList);
        System.out.println(orderBy.orderBy());
        
        //ADICIONANDO OS NUMEROS PELO TECLADO
        try {
            do {
                System.out.println("======ORDENACAO DE NUMEROS=====" +
                        "\n1-ADICIONAR NUMERO" +
                        "\n2-SAIR");
                opc = input.nextInt();
                Integer x = input.nextInt();
                manualList.add(x);
            }while (opc != 2);
        }catch ( )

        
        
    }
}