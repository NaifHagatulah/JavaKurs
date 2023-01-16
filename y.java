import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class y {
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

        List<Integer> indexOfOperations = findIndexOfOperation(test);

        int i = preformeAddition(phrase, indexOfOperations);

        System.out.println(indexOfOperations.get(0));

        System.out.println(findIndexOfOperation(test).get(0));

        for (int j = 0; j < indexOfOperations.size(); j++) {

        }
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

    public static int preformeAddition(StringBuilder phrase, List<Integer> index) {
        int x = 0;
        for (int i = index.get(x); x < index.size(); x++) {

            if (x == 0) {
                char[] RightOfOperatopm = new char[index.get(x + 1) - index.get(x) - 1];
                char[] LeftOfOperation = new char[index.get(x)];
                // System.out.println(LeftOfOperation.length);
                phrase.getChars(index.get(x) + 1, index.get(x + 1), RightOfOperatopm, 0);
                System.out.println(RightOfOperatopm.length);
                phrase.getChars(index.get(x + 1), index.get(x), LeftOfOperation, 0);

                // System.out.println(LeftOfOperation.length);
                // int p2 = RightOfOperatopm.length;
                // int leftSideide = charArrayToInt(LeftOfOperation, 0, LeftOfOperation.length);
                // int rightSide = charArrayToInt(LeftOfOperation, 0, LeftOfOperation.length);

            }
            if (x == index.size() - 1) {
                continue;
            }
            // char[] LeftOfOperation = new char[index.get(x + 1) - index.get(x) - 1];
            // char[] RightOfOperatopm = new char[index.get(x) - index.get(x - 1) - 1];
            // phrase.getChars(index.get(x) + 1, index.get(x + 1), RightOfOperatopm, 0);
            // phrase.getChars(index.get(x - 1), index.get(x) - 1, LeftOfOperation, 0);
        }

        return x;
    }

    public static int findNumber(char[] number) {
        int number1 = Integer.parseInt(new String(number));
        int n = 1;
        return number1;
    }

}
