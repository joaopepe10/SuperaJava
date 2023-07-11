import desafios.d1.ExceptionNegativeNumbers;
import desafios.d1.OrderBy;

import java.util.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        List<Integer> automaticList = new ArrayList<>();
        List<Integer> manualList = new ArrayList<>();
        int opc = 0;
        //ADICIONANDO MANUALMENTE
        automaticList.addAll(Arrays.asList(10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98));
        OrderBy orderBy = new OrderBy(automaticList);
        System.out.println(orderBy.orderBy());
        
        //ADICIONANDO OS NUMEROS PELO TECLADO
        while (!exit){
            try {
                    System.out.println("======ORDENACAO DE NUMEROS=====" +
                            "\n1-ADICIONAR NUMERO" +
                            "\n2-ORDENAR NUMEROS" +
                            "\n3-SAIR");
                    opc = input.nextInt();

                    if(opc == 1){
                        int x = input.nextInt();
                        if (x < 0){
                            throw new ExceptionNegativeNumbers();
                        }
                        manualList.add(x);
                        System.out.println("Numero " + x + " adicionado com sucesso!");
                    } else if (opc == 2) {
                        OrderBy o = new OrderBy(manualList);
                        System.out.println(o.orderBy());
                    } else if (opc == 3) {
                        exit = true;
                        System.out.println("Saindo do programa, volte sempre!");
                    }else {
                        System.out.println("Opcao invalida, tente novamente!");
                    }
            }catch (ExceptionNegativeNumbers e){
                System.out.println("Erro: " + e.getMessage());
            }
            catch (InputMismatchException e){
                System.out.println("Digite um numero valido!");
                input.next(); //Limpa o buffer de entrada
            }
        }
    }
}