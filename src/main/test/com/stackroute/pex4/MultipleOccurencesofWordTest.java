package com.stackroute.pex4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesofWordTest {
MultipleOccurencesofWord ob;
    @Before
    public void setUp() throws Exception {
        ob=new MultipleOccurencesofWord();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void findMultipleoOccurences() {
        String result= ob.findMultipleoOccurences("ishapharryhhh ry","ry");;
        assertEquals("I found the text ry starting at index 8 and ending at index 10I found the text ry starting at index 14 and ending at index 16",result);
    }
    @Test
    public void findMultipleoOccurences2() {
        String result= ob.findMultipleoOccurences("arry","ry");;
        assertEquals("I found the text ry starting at index 2 and ending at index 4",result);
    }
    @Test
    public void findMultipleoOccurences3() {
        String result= ob.findMultipleoOccurences("","");;
        assertEquals("invalid input",result);
    }
}