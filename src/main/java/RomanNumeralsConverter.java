import javax.print.attribute.standard.NumberUp;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Set;

public class RomanNumeralsConverter {


    RomanNumeralsConverter() {
    }


    private static LinkedHashMap<Integer, String> numerals = new LinkedHashMap<>() {
        {
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
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

