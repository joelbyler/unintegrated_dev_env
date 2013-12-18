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
  it '11 to XI' do
    numeral.convert(11).should == 'XI'
  end
  it '40 to XL' do
    numeral.convert(40).should == 'XL'
  end
  it '50 to L' do
    numeral.convert(50).should == 'L'
  end
  it '90 to XC' do
    numeral.convert(90).should == 'XC'
  end
  it '100 to C' do
    numeral.convert(100).should == 'C'
  end
  it '400 to CD' do
    numeral.convert(400).should == 'CD'
  end
  it '500 to D' do
    numeral.convert(500).should == 'D'
  end
  it '900 to CM' do
    numeral.convert(900).should == 'CM'
  end
  it '1000 to M' do
    numeral.convert(1000).should == 'M'
  end
  it '2999 to MMCMXCIX' do
    numeral.convert(2999).should == 'MMCMXCIX'
  end
end
