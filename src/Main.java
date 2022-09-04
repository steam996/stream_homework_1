import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortedList = new ArrayList<>();
        Iterator <Integer> iterator = intList.iterator();
        while (iterator.hasNext()){
            int a = iterator.next();
            if(a>0 && a%2==0){
                sortedList.add(a);
            }

        }
        Collections.sort(sortedList);
        System.out.println(sortedList);

        List<Integer> sortedList2 = intList.stream()
                .filter(x->x>0)
                .filter(x -> x%2==0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println(sortedList2);
    }
}