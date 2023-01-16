import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class person2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String math = input.nextLine();
    String[] phrase = math.split("\\s+");
    StringBuilder phraseMut = new StringBuilder();

    for (int i = 0; i < phrase.length; i++) {
      phraseMut.append(phrase[i]);
    }

    int[] index = findIndexOfParenthesis(phraseMut);
    System.out.println(phraseMut.substring(index[0], index[1]));
    int findOperations = findOperations(phraseMut);
    System.out.println(findOperations);
  }

  public static int[] findIndexOfParenthesis(StringBuilder phrase) {
    int[] index = new int[2];
    for (int i = 0; i < phrase.length(); i++) {
      char ph = phrase.charAt(i);
      if (phrase.charAt(i) == 40)
        index[0] = i + 1; // start parentheses
      if (phrase.charAt(i) == 41) {
        index[1] = i; // end parantheses
        return index;
      }
    }

    return index;
  }

  public static List<Integer> findIndexOfOperation(char[] subPhrase) {
    List<Integer> index = new ArrayList();

    for (int i = 0; i < subPhrase.length; i++) {
      System.out.print(subPhrase[i]);
      if (subPhrase[i] == 43 || subPhrase[i] == 42 || subPhrase[i] == 45 || subPhrase[i] == 47) {
        index.add(i);
      }
    }
    return index;
  }

  public static int findOperations(StringBuilder phrase) {

    int[] index = findIndexOfParenthesis(phrase);
    phrase.chars();
    char[] test = new char[index[1] - index[0]]; // filling the char array with the values
    phrase.getChars(index[0], index[1], test, 0); // get the value need correct index for the intergers
    System.out.println(test.length);
    List<Integer> indexOfOperations = findIndexOfOperation(test);

    System.out.println(indexOfOperations.get(0));
    System.out.println(test.length);
    // int sum = charArrayToInt(test, 0, test.length); // get an int value from a
    // chararray
    // System.out.println(sum);

    System.out.println(findIndexOfOperation(test).get(0));

    for (int j = 0; j < indexOfOperations.size(); j++) {

    }
    // char[] phraseSub = phrase.getChars(index[0], index[1], phraseSub, 0);
    return 1;
  }

  public static int charArrayToInt(char[] data, int start, int end) throws NumberFormatException {
    int result = 0;
    for (int i = start; i < end; i++) {
      int digit = (int) data[i] - (int) '0';
      if ((digit < 0) || (digit > 9))
        throw new NumberFormatException();
      result *= 10;
      result += digit;
    }
    return result;
  }

  public static int findNumber(char[] number) {
    int number1 = Integer.parseInt(new String(number));
    int n = 1;
    return number1;
  }

}