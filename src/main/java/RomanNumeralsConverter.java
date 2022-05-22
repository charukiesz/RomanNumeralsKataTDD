import java.util.HashMap;

public class RomanNumeralsConverter {


    RomanNumeralsConverter() {
    }

    private static HashMap<Integer, String> numerals = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(6, "VI");
            put(7, "VII");
            put(8, "VIII");

        }};


        public String convertToRomanNumeral(int inputNumber) {

            if (numerals.containsKey((inputNumber))) {
                return numerals.get(inputNumber);
            }
            return numerals.get(1) + convertToRomanNumeral(inputNumber - 1);
        }

}

