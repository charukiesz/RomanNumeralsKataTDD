public class RomanNumeralsConverter {


    RomanNumeralsConverter() {
    }

    private String [] numerals = {"I", "II", "III"};

    public String convertToRomanNumeral(int inputNumber) {

         return numerals[inputNumber -1];
    }


}

