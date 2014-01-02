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
});

