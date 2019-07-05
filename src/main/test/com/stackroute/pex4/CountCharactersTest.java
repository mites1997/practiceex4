package com.stackroute.pex4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharactersTest {
  CountCharacters ob;

  @org.junit.Before
  public void setUp() throws Exception {
    ob=new CountCharacters();
  }

  @org.junit.After
  public void tearDown() throws Exception {
    ob=null;
  }
  @Test
  public void findMultipleoOccurences() {
    int result= ob.countCharacters("apple",'a');
    assertEquals(1,result);
  }
  @Test
  public void findMultipleoOccurences2() {
    int result= ob.countCharacters("orangeo",'o');
    assertEquals(2,result);
  }
  @Test
  public void findMultipleoOccurences3() {
    int result= ob.countCharacters("",'a');
    assertEquals(-1,result);
  }
}
