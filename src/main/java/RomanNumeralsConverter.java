import javax.print.attribute.standard.NumberUp;
import java.util.HashMap;

public class RomanNumeralsConverter {


    RomanNumeralsConverter() {
    }

    private static final String ROMANNUMERALV = "V";
    private static final String ROMANNUMERALXL = "XL";
    private static final String ROMANNUMERALX = "X";
    private static HashMap<Integer, String> numerals = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(9, "IX");
            put(10, "X");
            put(40, "XL");
        }};


        public String convertToRomanNumeral(int inputNumber) {

            if (numerals.containsKey((inputNumber))) {
                return numerals.get(inputNumber);
            }

            if (inputNumber > 40){

                return ROMANNUMERALXL + convertToRomanNumeral(inputNumber - 40);
            }

            if (inputNumber > 10){

                return ROMANNUMERALX + convertToRomanNumeral(inputNumber - 10);
            }

            if (inputNumber > 5){

                return ROMANNUMERALV + convertToRomanNumeral(inputNumber - 5);
            }
            return numerals.get(1) + convertToRomanNumeral(inputNumber - 1);
        }

}

