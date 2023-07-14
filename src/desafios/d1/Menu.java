package desafios.d1;

import java.util.*;

public class Menu {

    public static void chamarMenu(){
        Scanner input = new Scanner(System.in);
        List<Integer> automaticList = new ArrayList<>();
        List<Integer> manualList = new ArrayList<>();
        OrderBy o = new OrderBy();
        boolean exit = false;
        while (!exit){
            try {
                System.out.println("========Ordenação de numeros========");
                System.out.println("1-ORDERNAR AUTOMATICAMENTE");
                System.out.println("2-ORDERNAR MANUALMENTE");
                System.out.println("3-SAIR");
                int opc = input.nextInt();

                switch (opc) {
                    case 1:
                        automaticList.addAll(Arrays.asList(10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98));
                        OrderBy orderBy = new OrderBy(automaticList);
                        OrderBy orderByLambda = new OrderBy(automaticList);
                        System.out.print("Ordenacao pelo Array List: \n" + orderBy.orderBy());
                        System.out.println("\nOrdenacao pela funcao Lambda: \n" + orderByLambda.orderByLambda());
                        System.out.println("\nOrdenacao pelo bubble sort: ");
                        orderBy.bubbleSort();
                        break;
                    case 2:
                        input.nextLine();
                        System.out.println("======ORDENACAO MANUAL======");
                        System.out.println("1-ADICIONAR NUMEROS");
                        System.out.println("2-ORDENAR NUMEROS");
                        opc = input.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Digite um numero entre 1 e " + Math.pow(10, 5));
                                int x = input.nextInt();
                                if (x < 1 || x > Math.pow(10, 5)) {
                                    throw new ExceptionNegativeNumbers();
                                }else {
                                    manualList.add(x);
                                    o.setNumbers(manualList);
                                    System.out.println("Numero " + x + " adicionado com sucesso!");
                                    boolean adicionandoNumeros = true;
                                    while (adicionandoNumeros) {
                                        System.out.println("1-ADICIONAR OUTRO NUMERO");
                                        System.out.println("2-VOLTAR AO MENU PRINCIPAL");
                                        System.out.println("3-ORDENAR NUMEROS");
                                        int escolha = input.nextInt();
                                        switch (escolha) {
                                            case 1:
                                                System.out.println("Digite um numero entre 1 e " + Math.pow(10, 5));
                                                int novoNumero = input.nextInt();
                                                if (novoNumero < 1 || novoNumero > Math.pow(10, 5)) {
                                                    throw new ExceptionNegativeNumbers();
                                                } else {
                                                    manualList.add(novoNumero);
                                                    System.out.println("Numero " + novoNumero + " adicionado com sucesso!");
                                                }
                                                break;
                                            case 2:
                                                adicionandoNumeros = false;
                                                exit = true;
                                                break;
                                            case 3:
                                                o.setNumbers(manualList);
                                                System.out.println(o.orderBy());
                                                break;
                                            default:
                                                System.out.println("Opção inválida!");
                                                break;
                                        }
                                    }
                                }
                                    break;
                            case 2:
                                o.setNumbers(manualList);
                                System.out.println(o.orderBy());
                                break;
                            default:
                                System.out.println("Opcao invalida!");
                                chamarMenu();
                                break;
                                }
                        break;
                    case 3:
                                exit = true;
                                System.out.println("Saindo do programa...");
                                break;
                    default:
                                System.out.println("Opcao invalida!");
                                break;
                        }
                        break;

                } catch (ExceptionNegativeNumbers e) {
                System.out.println(e.getMessage());
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
        }
    }

