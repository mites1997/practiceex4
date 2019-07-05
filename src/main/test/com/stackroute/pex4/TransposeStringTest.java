package com.stackroute.pex4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
 TransposeString ob;
    @Before
    public void setUp() throws Exception {
        ob=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void transposeString() {
        String result= ob.transposeString("mites mrinoy");;
        assertEquals("setim yonirm",result);
    }
    @Test
    public void transposeString2() {
        String result= ob.transposeString("lion# animal");;
        assertEquals("#noil lamina",result);
    }
    @Test
    public void transposeString3() {
        String result= ob.transposeString("");;
        assertEquals("invalid input",result);
    }
}