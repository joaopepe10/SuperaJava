package desafios.d1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

    public List<Integer> orderBy(){
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

    public List<Integer> getNumbers() {
        return numbers;
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
}
