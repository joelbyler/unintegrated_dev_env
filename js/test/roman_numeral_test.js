require('should');
var RomanNumeral = require(__dirname + '/../lib/roman_numeral');

describe('RomanNumeral', function() {
  var numeral = new RomanNumeral();
  it('1 to I', function() {
    numeral.convert(1).should.equal('I');
  });
  it('2 to II', function() {
    numeral.convert(2).should.equal('II');
  });
  it('3 to III', function() {
    numeral.convert(3).should.equal('III');
  });
  it('4 to IV', function() {
    numeral.convert(4).should.equal('IV');
  });
  it('5 to V', function() {
    numeral.convert(5).should.equal('V');
  });
  it('6 to VI', function() {
    numeral.convert(6).should.equal('VI');
  });
  it('9 to IX', function() {
    numeral.convert(9).should.equal('IX');
  });
  it('10 to X', function() {
    numeral.convert(10).should.equal('X');
  });
  it('11 to XI', function() {
    numeral.convert(11).should.equal('XI');
  });
  it('40 to XL', function() {
    numeral.convert(40).should.equal('XL');
  });
  it('50 to L', function() {
    numeral.convert(50).should.equal('L');
  });
  it('90 to XC', function() {
    numeral.convert(90).should.equal('XC');
  });
  it('100 to C', function() {
    numeral.convert(100).should.equal('C');
  });
  it('400 to CD', function() {
    numeral.convert(400).should.equal('CD');
  });
  it('500 to D', function() {
    numeral.convert(500).should.equal('D');
  });
  it('900 to CM', function() {
    numeral.convert(900).should.equal('CM');
  });
  it('1000 to M', function() {
    numeral.convert(1000).should.equal('M');
  });
  it('2999 to MMCMXCIX', function() {
    numeral.convert(2999).should.equal('MMCMXCIX');
  });
});

