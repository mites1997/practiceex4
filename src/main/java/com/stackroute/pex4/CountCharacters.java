//Write a java program to count the total number of occurrences of a given character in a string
//without using any loop

package com.stackroute.pex4;

public class CountCharacters {
  public int countCharacters(String input, Character tobefound) {
    if(input.equals(""))
      return -1;

    String result = tobefound.toString();//char converted to string
    String output = input.toLowerCase().replaceAll(result, "");//the required character is replaced with ""
    int lengthofinput = input.length();//original length is found
    int lengthofoutput = output.length(); //changed length is found
    int difference = lengthofinput - lengthofoutput;
    return difference;//no of characters is found

  }
}
