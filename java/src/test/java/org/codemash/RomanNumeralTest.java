package org.codemash;

import static org.junit.Assert.*;
import org.junit.*;

public class RomanNumeralTest {
  private RomanNumeral numeral;

  @Before
  public void setup() {
    numeral = new RomanNumeral();
  }

  @Test
  public void converts1ToI() {
    assertEquals("I", numeral.convert(1));
  }    

  @Test
  public void converts2ToII() {
    assertEquals("II", numeral.convert(2));
  }    

  @Test
  public void converts3ToIII() {
    assertEquals("III", numeral.convert(3));
  }    

  @Test
  public void converts4ToIV() {
    assertEquals("IV", numeral.convert(4));
  }    

  @Test
  public void converts5ToV() {
    assertEquals("V", numeral.convert(5));
  }    

  @Test
  public void converts6ToVI() {
    assertEquals("VI", numeral.convert(6));
  }    

  @Test
  public void converts9ToIX() {
    assertEquals("IX", numeral.convert(9));
  }    

  @Test
  public void converts10ToX() {
    assertEquals("X", numeral.convert(10));
  }    
}
