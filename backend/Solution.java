package backend;

public class Solution {

  public static String encrypt(String s) {
    s = s.replaceAll("\\s","");
    int len = s.length();
    int low = (int) Math.sqrt(len);
    int cols = low + 1, rows = low;
    if (cols * rows < len) {
      rows += 1;
    }

    StringBuilder sb = new StringBuilder();
    for (int j = 0; j < cols; j++) {
      for (int i = 0; i < rows; i++) {
        if (i * cols + j < len) {
          sb.append(s.charAt(i * cols + j));
        }
      }
      sb.append(' ');
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String input1 = "haveaniceday";
    System.out.println(Solution.encrypt(input1));
    String input2 = "feedthedog";
    System.out.println(Solution.encrypt(input2));
    String input3 = "chillout";
    System.out.println(Solution.encrypt(input3));
  }
}