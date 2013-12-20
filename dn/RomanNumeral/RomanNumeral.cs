using System;
using System.Collections.Generic;

namespace Roman
{
    public class Numeral
    {

        private Dictionary<String, int> MAPPING = new Dictionary<String, int>();
        public Numeral()
        {
    		MAPPING.Add("X", 10);
    		MAPPING.Add("IX", 9);
    		MAPPING.Add("V", 5);
    		MAPPING.Add("IV", 4);
    		MAPPING.Add("I", 1);
    	}

        public String Convert(int number)
        {
        	String result = "";
            foreach (KeyValuePair<String, int> numeral in MAPPING)
            {
                while (number >= numeral.Value)
                {
                    result += numeral.Key;
                    number -= numeral.Value;
                }
            }
        	return result;
        }
    }
}
