package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public static int fib(int n) {

//        0,1,1,2,3,5,8
        int sum;
        int a = 0;
        int b = 1;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
        }
        return b;
    }

    public static List<Integer> fibSeries(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        int sum = 0;

        for (int i = 1; i < list.size(); i++) {
            sum = list.get(i - 1) + list.get(i);
            list.add(sum);

            if (n == i + 1) break;
        }

        return list;
    }

    public static void main(String[] args) {
        int result = fib(3);
        System.out.println(result);
        System.out.println(fibSeries(10));
    }

}
