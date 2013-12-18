class RomanNumeral
  MAPPING = {
    "M" => 1000,
    "CM" => 900,
    "D" => 500,
    "CD" => 400,
    "C" => 100,
    "XC" => 90,
    "L" => 50,
    "XL" => 40,
    "X" => 10,
    "IX" => 9,
    "V" => 5,
    "IV" => 4,
    "I" => 1,
  }

  def convert number
    result = ''
    MAPPING.each_key do |key|
      while number >= MAPPING[key]
        result += key
        number -= MAPPING[key]
      end
    end
    result
  end
end
