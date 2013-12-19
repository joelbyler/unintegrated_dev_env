using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Roman
{
    public class Numeral
    {

        private Dictionary<String, int> MAPPING = new Dictionary<String, int>();
        public Numeral()
        {
    		MAPPING.Add("M", 1000);
    		MAPPING.Add("CM", 900);
    		MAPPING.Add("D", 500);
    		MAPPING.Add("CD", 400);
    		MAPPING.Add("C", 100);
    		MAPPING.Add("XC", 90);
    		MAPPING.Add("L", 50);
    		MAPPING.Add("XL", 40);
    		MAPPING.Add("X", 10);
    		MAPPING.Add("IX", 9);
    		MAPPING.Add("V", 5);
    		MAPPING.Add("IV", 4);
    		MAPPING.Add("I", 1);
    	}

        public String Convert(int number)
        {
        	String result = String.Empty;
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
