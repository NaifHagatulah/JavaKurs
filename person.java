import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class person 
{
 public static void main(String[] args) 
{
  Scanner input = new Scanner(System.in);
  String math = input.nextLine();
  String[] phrase = math.split("\\s+");
  int[] index = findIndex(phrase);
  int findOperations = findOperations(phrase, index);
}

public static int[] findIndex(String[] phrase)
{
  int[] index = new int[2];
  for(int i = 0; i < phrase.length; i++)
  {
    if(phrase[i].equals("("))
      index[0] = i;  //start parentheses
    if(phrase[i].equals(")"))
      {
        index[1] = i;    //end parantheses
        return index;
      }
  }


  return index;
}
public static int findOperations(String[] phraseSubsection, int[] index)
{
  //char[] sub = new char[index[0] - index[1]];
  for(int j = index[0]; j < index[1]; j++)
  {
    
    //sub = phraseSubsection[j].toCharArray();
    System.out.println(phraseSubsection[j]);
  }
  return 0;
}

public static int findNumber(String number)
{
   return Integer.valueOf(number);
}

}