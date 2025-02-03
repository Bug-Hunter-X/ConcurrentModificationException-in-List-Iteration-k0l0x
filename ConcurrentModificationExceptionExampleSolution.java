import java.util.*;

public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Solution 1: Using an Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Solution 1: " + list);

        //Solution 2: Using an enhanced for loop and creating a new list
        List<Integer> newList = new ArrayList<>();
        for(int number : list){
            if(number % 2 != 0){
                newList.add(number);
            }
        }
        System.out.println("Solution 2: " + newList);
    }
}