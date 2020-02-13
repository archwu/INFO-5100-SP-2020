import java.util.Arrays;

public class Question3 {
  /*
  move all 0's to the end while maintaining the relative orders of other non-zero numbers in a int array
   */
  public static void main(String[] args) {
    int[] a = moveZeroes(new int[]{1, 2, 3, 0, 2, 1, 3, 0});
    System.out.println(Arrays.toString(a));
  }

  public static int[] moveZeroes(int[] array) {
    if (array == null || array.length == 0) return array;
    int[] result = new int[array.length];
    Arrays.fill(result, 0);
    int index = 0;
    for (int i : array) {
      if(i != 0) {
        result[index] = i;
        index++;
      }
    }
    return result;
  }
}
