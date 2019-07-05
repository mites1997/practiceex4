package com.stackroute.pex4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortparagraphTest {
    Sortparagraph ob;

    @Before
    public void setUp() throws Exception {
        ob=new Sortparagraph();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void sortString() {
        String result= Sortparagraph.sortString("# is A mammal.");
        assertEquals("# A is mammal.",result);
    }
    @Test
    public void sortString2() {
        String result= Sortparagraph.sortString("");
        assertEquals("invalid input",result);
    }
    @Test
    public void sortString3() {
        String result= Sortparagraph.sortString("Cat is a mammal");
        assertEquals("a Cat is mammal",result);
    }


}