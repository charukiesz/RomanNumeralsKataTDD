import javax.print.attribute.standard.NumberUp;
import java.util.HashMap;

public class RomanNumeralsConverter {


    RomanNumeralsConverter() {
    }

    private static final String ROMANNUMERALV = "V";
    private static HashMap<Integer, String> numerals = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(4, "IV");
            put(5, "V");

        }};


        public String convertToRomanNumeral(int inputNumber) {

            if (numerals.containsKey((inputNumber))) {
                return numerals.get(inputNumber);
            }

            if (inputNumber > 5){
                return ROMANNUMERALV + convertToRomanNumeral(inputNumber - 5);
            }
            return numerals.get(1) + convertToRomanNumeral(inputNumber - 1);
        }

}

