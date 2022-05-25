import javax.print.attribute.standard.NumberUp;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;

public class RomanNumeralsConverter {


    RomanNumeralsConverter() {
    }


    // private static HashMap<Integer, String> numerals = new HashMap<Integer, String>() {
    private static LinkedHashMap<Integer, String> numerals = new LinkedHashMap<>() {
        {
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");

        }
    };


    public String convertToRomanNumeral(int inputNumber) {

        String romanNumeral = "";


        for (Integer number : numerals.keySet()) {
            while (inputNumber >= number) {
                romanNumeral += numerals.get(number);
                inputNumber -= number;
            }
        }
        return romanNumeral;
    }

}

