import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Sol {
    public static void main(String[] args) {
        //System.out.println(solution2(new int[]{14, 27, 1, 4, 2, 50, 3, 1}, new int[]{2, 4, -4, 3, 1, 1, 14, 27, 50}));
        System.out.println(solution2(new int[]{13, 5, 6, 2, 5}, new int[]{5, 2, 5, 13}));
    }
    public static int solution(int[] x, int[] y) {
        // Your code here
        Set<Integer> status = new HashSet<>();
        for (int a : x) {
            status.add(a);
        }
        for (int b : y) {
            if (!status.contains(b)) {
                System.out.println(b);
                return b;
            }
        }
        return solution(y, x);
    }
    // 1, 2, 3, 4, 6, 7
    // 1, 2, 3, 4, 5, 6
    public static int solution2(int[] x, int[] y) {
        Arrays.sort(x);
        Arrays.sort(y);
        int index1 = 0;
        int index2 = 0;
        int prev1 = x[0];
        int prev2 = y[0];
        int[] odd = new int[2];
        while (index1 < x.length && index2 < y.length) {
            while (x[index1] == prev1) {
                if(index1 == x.length - 1) {
                    break;
                }
                index1 ++;
            }
            while (y[index2] == prev2) {
                if(index2 == y.length - 1){
                    break;
                }
                index2 ++;
            }
            if (prev1 == prev2) {
                prev1 = x[index1];
                prev2 = y[index2];
            } else {
                odd[0] = prev1;
                odd[1] = prev2;
                break;
            }
        }
        if(odd[0] == y[index2]) {return odd[1];}
        if(odd[1] == x[index1]) {return odd[0];}
        return -1;
    }
}
