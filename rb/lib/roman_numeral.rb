# roman numeral conversion class
class RomanNumeral
  MAPPING = {
    "X" => 10,
    "IX" => 9,
    "V" => 5,
    "IV" => 4,
    "I" => 1,
  }

  def convert number
    result = ""
    MAPPING.each_key do |key|
      while number >= MAPPING[key]
        result += key
        number -= MAPPING[key]
      end
    end
    result
  end
end
