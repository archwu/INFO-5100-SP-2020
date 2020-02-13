public class Question4 {
  /*
  find longest palindromic substring in s, max length is 1000
  if multiple, one is okay
   */
  public static void main(String[] args) {
    System.out.println(longestPalindrome("cabbacca"));
  }

  public static String longestPalindrome(String s) {
    char[] array = s.toCharArray();
    int[][] largest = new int[array.length][array.length];
    int index = 0;
    int len = s.length();
    int globalMax = 1;
    for (int i = len - 1; i >= 0; i--) {
      largest[i][i] = 1;
      for (int j = i + 1; j < len; j++) {
        if (s.charAt(i) == s.charAt(j) && (j - i == 1 || largest[i + 1][j - 1] > 0)) {
          largest[i][j] = largest[i + 1][j - 1] + 2;
        }
        if (largest[i][j] > globalMax) {
          globalMax = largest[i][j];
          index = i;
        }
      }
    }
    return s.substring(index, index + globalMax);
  }
}
