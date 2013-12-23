package org.codemash;

public class RomanNumeral {

  private enum Numeral {
    ONETHOUSAND(1000, "M"),
    NINEHUNDRED(900, "CM"),
    FIVEHUNDRED(500, "D"),
    FOURHUNDRED(400, "CD"),
    ONEHUNDRED(100, "C"),
    NINETY(90, "XC"),
    FIFTY(50, "L"),
    FOURTY(40, "XL"),
    TEN(10, "X"),
    NINE(9, "IX"),
    FIVE(5, "V"),
    FOUR(4, "IV"), 
    ONE(1, "I");
                
    private int number;
    private String roman;
    Numeral(int number, String string){
      this.number = number;
      this.roman = string;
    }
    String getRoman() {
      return roman;
    }
    int getNumber() {
      return number;
    }
  }

  public String convert(int number){
    StringBuffer numeral = new StringBuffer();
    for(Numeral romanNumber : Numeral.values()) {
      while(number>=romanNumber.getNumber()){
        numeral.append(romanNumber.getRoman());
        number -= romanNumber.getNumber();
      }
    }
    return numeral.toString();
  }
}
