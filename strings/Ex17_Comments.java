/********************** Exercise 17 ********************* * Write a program that reads a Java source-code file (you
 * provide the file name on the command line) and displays
 * all the comments.
 ********************************************************/
package biz.markov.thinking.strings;

import java.util.regex.Pattern;

public class Ex17_Comments {
   private String testString = "" + "\"\"" + "// This is not comment"; // This is "comment"
   private String testString2 =
"abc" + "def" + "";
   // This is another comment
   public static void main(String[] args) {
      String path = "src/biz/markov/thinking/strings";
      Ex16_JGrep jg = new Ex16_JGrep(
         "(?m)(?s)(^|(\".*[^\\\\]\"))[^\"]*((//|/\\*).*)");
      jg.setGroup(3);
      jg.process(path);
   }
}