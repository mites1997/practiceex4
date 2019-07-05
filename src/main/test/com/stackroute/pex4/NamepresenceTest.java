package com.stackroute.pex4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NamepresenceTest {
    Namepresence ob;
    @Before
    public void setUp() throws Exception {
        ob=new Namepresence();

    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void presenceOfstring() {
        boolean result= ob.presenceOfstring("is Harry..");;
        assertEquals(true,result);
    }
    @Test
    public void presenceOfstring2() {
        boolean result= ob.presenceOfstring("His name is Harry Jones");;
        assertEquals(true,result);
    }
    @Test
    public void presenceOfstring3() {
        boolean result= ob.presenceOfstring("");;
        assertEquals(false,result);
    }
}