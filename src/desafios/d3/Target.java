package desafios.d3;

public class Target {
    private Integer alvo = 1;
    private Integer sizeArray = 0;
    private Integer[] list = {1, 2, 3, 4};
    private Integer[] match = new Integer[list.length];
    public void calcDifference(){
        Integer count = 0;
        Integer x = 0;
        Integer result = 0;
        boolean exit = false;
        for (int i = 3; i >= 0;--i){
            x = i - 1;
            while (exit){
                result = list[i] - list[x];
                if (result.equals(alvo)){
                    match[count] = result;
                    count+=1;
                }
                if (x == 0){
                    exit = false;
                }
                x--;
                }
            while (!exit){
                result = list[i] - list[x];
                if (result.equals(alvo)){
                    match[count] = result;
                    count+=1;
                }
                if (x == 0){
                    exit = true;
                }
                x--;
            }
        }
        for (Integer i: match){
            System.out.println(i);
        }
    }
}
