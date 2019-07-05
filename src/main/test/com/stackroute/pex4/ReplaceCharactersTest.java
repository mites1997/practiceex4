package com.stackroute.pex4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
ReplaceCharacters ob;
    @Before
    public void setUp() throws Exception {
        ob=new ReplaceCharacters();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void replacedWithflWitht() {

        String result= ob.replacedWithflWitht("ldme");;
        assertEquals("tfme",result);

    }
    @Test
    public void replacedWithflWitht2() {

        String result= ob.replacedWithflWitht("");;
        assertEquals("not possible",result);

    }
    @Test
    public void replacedWithflWitht3() {

        String result= ob.replacedWithflWitht("apple");;
        assertEquals("appte",result);

    }
}