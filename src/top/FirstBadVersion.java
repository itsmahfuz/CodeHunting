package top;

public class FirstBadVersion extends VersionControl{

    public static void main(String[] args) {
        int n = 5, bad = 4;
        System.out.println(new FirstBadVersion().firstBadVersion(n));
    }

    public int firstBadVersion(int n){

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
