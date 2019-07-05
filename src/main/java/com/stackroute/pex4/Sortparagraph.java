//Sort a paragraph alphabetically and display the sorted list of words

package com.stackroute.pex4;

import  java.util.Arrays;
import static java.util.Arrays.sort;

public class Sortparagraph
{
    public static String sortString(String inputString)
    {
        if(inputString.equals(""))
            return "invalid input";//invalid input

       String[] inputstringarray=inputString.split(" ");//String is converted to char array

       String output="";
       Arrays.sort(inputstringarray,String.CASE_INSENSITIVE_ORDER);//array is sorted but ignores the case of the letter
       for(String a:inputstringarray)
	   {
	  output=output.concat(a).concat(" ");

	   }
        System.out.print(output);//output is returned
        return output.trim();
    }
}
