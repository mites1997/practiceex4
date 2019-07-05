
//Write a program to transpose the given string.
package com.stackroute.pex4;

public class TransposeString {
    public String transposeString(String stringtobetransposed) {
        if(stringtobetransposed.equals(""))//invalid input is checked
            return "invalid input";
        String sarray[] =stringtobetransposed.split(" ");//String is converted to string array
        String output="";

        for(String transpose:sarray)//reverse the input
        {   StringBuffer sb=new StringBuffer(transpose);
            sb.reverse();
            output=output+sb.toString()+" ";
        }
    return output.trim();//output is returned

    }
}

