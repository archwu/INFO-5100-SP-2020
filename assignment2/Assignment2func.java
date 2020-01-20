public class Assignment2func {
    // The class including assignment 2 methods
    public static void main(String[] args) {
        //System.out.println(addDigits(Integer.valueOf(args[0])));

    }

    public int charCounter(String input, char theChar) {
        /*
            find how many selected characters are in the String
         */
        char [] convert = input.toCharArray();
        int count = 0;
        for (char a : convert) {
            if (a == theChar) {
                count ++;
            }
        }
        return count;
    }

    public void findMinMax(int[] input) {
        /*
            find the maximum and minimum number in an array of numbers
         */
        int localMax = Integer.MIN_VALUE;
        int localMin = Integer.MAX_VALUE;

        for (int a : input) {
            if (a > localMax) {
                localMax = a;
            }
            if (a < localMin) {
                localMin = a;
            }
        }

        System.out.println("The max in this array is " + localMax + "\n" + "The min in this array is " + localMin);

    }

    public static int addDigits(int num) {
        /*
            adds all the digits of an integer until it is single digit
         */

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        sum = sum < 10 ? sum : addDigits(sum);
        return sum;
    }
}