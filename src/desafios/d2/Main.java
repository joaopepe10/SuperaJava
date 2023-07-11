package desafios.d2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinGrades m = new MinGrades();
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Digite um valor");
            Double value = in.nextDouble();
            if (value < 0){
                throw new ArithmeticException();
            }
            m.calculateGradesCoins(value);
        }catch (ArithmeticException | InputMismatchException e){
            System.out.println("Erro, valor invalido!");
        }

    }
}
