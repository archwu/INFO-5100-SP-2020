public class Question2 {
  /*
      input: non-negative num, add digits until one left
   */
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
