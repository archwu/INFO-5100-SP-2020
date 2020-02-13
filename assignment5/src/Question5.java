public class Question5 {
  /*
  n*n 2d matrix as an image, rotate them by 90 degrees clockwise in-place
   */

  public static void rotate(int[][] matrix) {
    int n = matrix.length;
    if (n <= 1) {
      return;
    }
    int round = n / 2;
    for (int level = 0; level < round; level++) {
      int left = level;
      int right = n - 2 - level;
      for (int i = left; i <= right; i++) {
        int temp = matrix[left][i];
        matrix[left][i] = matrix[n - 1 - i][left];
        matrix[n - 1 - i][left] = matrix[n - 1 - left][n - 1 - i];
        matrix[n - 1 - left][n - 1 - i] = matrix[i][n - 1 - left];
        matrix[i][n - 1 - left] = temp;
      }
    }
  }
}
