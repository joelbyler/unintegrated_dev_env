require 'spec_helper'
require 'roman_numeral'

describe RomanNumeral do
  let(:numeral){ RomanNumeral.new }
  it '1 to I' do
    numeral.convert(1).should == 'I'
  end
  it '2 to II' do
    numeral.convert(2).should == 'II'
  end
  it '3 to III' do
    numeral.convert(3).should == 'III'
  end
  it '4 to IV' do
    numeral.convert(4).should == 'IV'
  end
  it '5 to V' do
    numeral.convert(5).should == 'V'
  end
  it '6 to VI' do
    numeral.convert(6).should == 'VI'
  end
  it '9 to IX' do
    numeral.convert(9).should == 'IX'
  end
  it '10 to X' do
    numeral.convert(10).should == 'X'
  end
end
