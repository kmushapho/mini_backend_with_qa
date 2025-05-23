import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List <Integer> FibonacciList(int num) {
        ArrayList<Integer> fib_list = new ArrayList<Integer>();
        for (int i = 0; i < 2; i++) {
            fib_list.add(i);
        }

        for (int j = 2; j < num; j++) {
            int last = fib_list.get(fib_list.size() - 2);
            int secondLast = fib_list.get(fib_list.size() - 1);
            fib_list.add(last + secondLast);
        }

        if (num == 1){
            return fib_list.subList(0,1);
        } else if (num == 2) {
            return fib_list.subList(0,2);
        } else if (num <= 0) {
            return new ArrayList<Integer>();

        }
        return fib_list;
    }
}
