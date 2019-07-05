
//replace d with f and l with t
package com.stackroute.pex4;

public class ReplaceCharacters {
    public String replacedWithflWitht(String inputtoberelaced)
    {
        if(inputtoberelaced.equals(""))
            return "not possible";//invalid condition
        String result=inputtoberelaced.replaceAll("d|D","f").replaceAll("l|L","t");//required characters are replaced
        return result;//result is outputed
    }
}
