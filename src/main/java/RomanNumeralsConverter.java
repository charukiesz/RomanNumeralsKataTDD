import javax.print.attribute.standard.NumberUp;
import java.util.HashMap;

public class RomanNumeralsConverter {


    RomanNumeralsConverter() {
    }


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

            String result = " ";

            while (inputNumber >= 40){

                result += numerals.get(40);
                inputNumber -= 40;

            }

            while (inputNumber >= 10){

                result += numerals.get(10);
                inputNumber -= 10;

            }

            while (inputNumber >= 5){

                result += numerals.get(5);
                inputNumber -= 5;

            }

            while (inputNumber >= 4){

                result += numerals.get(4);
                inputNumber -= 4;
            }

            while (inputNumber >= 1){

                result += numerals.get(1);
                inputNumber -= 1;
            }

            return result.trim();

        }

}

