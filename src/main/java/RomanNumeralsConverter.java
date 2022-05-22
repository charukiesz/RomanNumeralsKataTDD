import java.util.HashMap;
public class RomanNumeralsConverter {


    RomanNumeralsConverter() {}

    private static HashMap<Integer, String> numerals = new HashMap<>(){
        {
            put(1, "I");
            put(2, "II");
            put(3, "III");
            put(4, "IV");
        }
    };

    public String convertToRomanNumeral(int inputNumber) {

         return numerals.get(inputNumber);
    }


}

