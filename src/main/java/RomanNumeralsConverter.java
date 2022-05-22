public class RomanNumeralsConverter {


    RomanNumeralsConverter() {
    }


    public String convertToRomanNumeral(int input) {

        String result = "I";

        if (input > 1) {
            result += "I";
        }
        if (input > 2){
            result += "I";
        }
        return result;
    }


}

