package org.codemash;

public class RomanNumeral {

  private enum Numeral {
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
    String numeral = "";
    for(Numeral romanNumber : Numeral.values()) {
      while(number>=romanNumber.getNumber()){
        numeral += romanNumber.getRoman();
        number -= romanNumber.getNumber();
      }
    }
    return numeral;
  }
}
