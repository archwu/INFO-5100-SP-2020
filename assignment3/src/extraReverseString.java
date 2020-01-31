public class extraReverseString {
    public static void main(String[] args) {
        reverseString("  reverse  the    String");
        reverseString(" String the reverse ");
    }

    public static void reverseString(String input) {
        String processed = removeExtraSpaces(input);
        char[] array = processed.toCharArray();
        reverse(array, 0, array.length - 1);
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ' && (i == 0 || array[i - 1] == ' ')) {
                start = i;
            }
            if (array[i] != ' ' && (i == array.length - 1 || array[i + 1] == ' ')){
                reverse(array, start, i);
            }
        }
        String out = new String(array);
        System.out.println(out);
    }

    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
    }

    public static String removeExtraSpaces(String input) {
        char[] chars = input.toCharArray();
        int end = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' && (i == 0 || chars[i - 1] == ' ')) {
                continue;
            } else {
                chars[end++] = chars[i];
            }
        }
        if (end > 0 && chars[end - 1] == ' ') end--;
        return new String(chars, 0, end);
    }
}
