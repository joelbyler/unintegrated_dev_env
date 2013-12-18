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

  @Test
  public void converts11ToXI() {
    assertEquals("XI", numeral.convert(11));
  }    

  @Test
  public void converts40ToXL() {
    assertEquals("XL", numeral.convert(40));
  }    

  @Test
  public void converts50ToXL() {
    assertEquals("L", numeral.convert(50));
  }    

  @Test
  public void converts90ToXC() {
    assertEquals("XC", numeral.convert(90));
  }    

  @Test
  public void converts100ToC() {
    assertEquals("C", numeral.convert(100));
  }    

  @Test
  public void converts400ToCD() {
    assertEquals("CD", numeral.convert(400));
  }    

  @Test
  public void converts500ToD() {
    assertEquals("D", numeral.convert(500));
  }    

  @Test
  public void converts900ToCM() {
    assertEquals("CM", numeral.convert(900));
  }    

  @Test
  public void converts1000ToCM() {
    assertEquals("M", numeral.convert(1000));
  }    

  @Test
  public void converts2999ToMMCMXCIX() {
    assertEquals("MMCMXCIX", numeral.convert(2999));
  }    
}
