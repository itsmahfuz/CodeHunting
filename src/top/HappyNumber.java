package top;

import java.util.HashSet;

public class HappyNumber {

    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();
        while (n != 1) {

            if (seen.contains(n)) return false;
            seen.add(n);

            int sum = 0;
            while (n > 0) {
                sum = sum + (n % 10) * (n % 10);
                n = n/10;
            }

            n = sum;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println( new HappyNumber().isHappy(19));
    }
}
