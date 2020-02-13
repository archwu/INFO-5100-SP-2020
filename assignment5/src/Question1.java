import java.util.HashSet;
import java.util.Set;

public class Question1 {
  /*
    Find the first non-repeating character in a string and return its index.
    If it doesn't exist, return -1
   */
  public static void main(String[] args) {
    System.out.println(findFirstNotRepeatingChar("aabccbd"));
  }

  public static int findFirstNotRepeatingChar(String input) {
    Set<Character> set1 = new HashSet<>();
    Set<Character> set2 = new HashSet<>();
    char[] array = input.toCharArray();
    for (char c: array) {
      if (!set1.add(c)) {
        set2.add(c);
      }
    }
    set1.removeAll(set2);
    for(int i = 0; i < input.length(); i++) {
      if(set1.contains(array[i])){
        return i;
      }
    }
    return -1;
  }
}
