public class assignment6partD {
  public static void main(String[] args) {
    int[] test = new int[]{1,2,3,5,6,7};
    int target = 4;
    System.out.println(findNearestInArray(test, target));
  }

  public static int findNearestInArray(int[] array, int target) {
    int minDiff = Integer.MAX_VALUE;
    int minIndex = -1;
    for (int i = 0; i < array.length; i++) {
      if(Math.abs(array[i] - target) < minDiff){
        minDiff = Math.abs(array[i] - target);
        minIndex = i;
      }
    }
    return minIndex;
  }
}


/*
1, 2, 3, 4, 5
tar: 3
2 1 0
  2 1
 */
