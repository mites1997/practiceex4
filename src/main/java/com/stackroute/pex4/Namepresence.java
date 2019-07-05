//Write a program with the implementation of Regular Expression to find the presence of the name
//Harry in a string.
package com.stackroute.pex4;

import java.util.regex.*;

public class Namepresence
{
public boolean presenceOfstring(String name)
{

    if(name.equals(""))
        return false;
    Pattern p = Pattern.compile("Harry");// the pattern to search for
    Matcher m = p.matcher(name);

    // condition to find at least one match
    if (m.find())
        return true;
    else
        return false;
}

}
