// (function() {
  'use strict';
// }());

var RomanNumeral = function(number) { };

var MAPPING = {
  'X': 10,
  'IX': 9,
  'V': 5,
  'IV': 4,
  'I': 1,
};

RomanNumeral.prototype.convert = function(number) {
  var result = '';
  for (var key in MAPPING) {
    while(number >= MAPPING[key]){
      result += key;
      number -= MAPPING[key];
    }
  }
  return result;
};

module.exports = RomanNumeral;
