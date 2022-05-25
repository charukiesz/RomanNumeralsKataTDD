
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.security.InvalidParameterException;


public class RomanNumeralsConverterTest {


    @Disabled
    @Test
    public void setUp() {
        Assertions.assertEquals(true, true);
    }


    @Disabled
    @Test
    public void checkCanConvertNumber1ToRomanNumeralI() {

        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        int input = 1;
        String expectedResult = "I";

        //Act
        String actualResult = romanNumeralsConverter.convertToRomanNumeral(input);

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Disabled
    @Test
    public void checkCanConvertNumber2ToRomanNumeralII() {

        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        int input = 2;
        String expectedResult = "II";

        //Act
        String actualResult = romanNumeralsConverter.convertToRomanNumeral(input);

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Disabled
    @Test
    public void checkCanConvertNumber3ToRomanNumeralIII() {

        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        int input = 3;
        String expectedResult = "III";

        //Act
        String actualResult = romanNumeralsConverter.convertToRomanNumeral(input);

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @CsvSource({"1,I", "2,II", "3,III", "4,IV"})
    public void checkCanConvertNumbers1To4ToRomanNumeralsIToIV(int input, String expectedResult) {
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        //Act and Assert
        Assertions.assertEquals(expectedResult, romanNumeralsConverter.convertToRomanNumeral(input));
    }

    @ParameterizedTest
    @CsvSource({"5,V", "6,VI", "7,VII", "8,VIII"})
    public void checkCanConvertNumbers5To8ToRomanNumeralsVToVIII(int input, String expectedResult) {
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        //Act and Assert
        Assertions.assertEquals(expectedResult, romanNumeralsConverter.convertToRomanNumeral(input));
    }

    @ParameterizedTest
    @CsvSource({"9,IX", "10,X", "11,XI", "14,XIV", "40,XL", "44,XLIV"})
    public void checkCanConvertNumbers9To44ToRomanNumerals(int input, String expectedResult) {
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        //Act and Assert
        Assertions.assertEquals(expectedResult, romanNumeralsConverter.convertToRomanNumeral(input));
    }

    @ParameterizedTest
    @CsvSource({"50,L", "90,XC", "100,C", "400,CD", "500,D", "900,CM"})
    public void checkCanConvertNumbers50To900ToRomanNumerals(int input, String expectedResult) {
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        //Act and Assert
        Assertions.assertEquals(expectedResult, romanNumeralsConverter.convertToRomanNumeral(input));
    }

    @ParameterizedTest
    @CsvSource({"1000,M", "846, DCCCXLVI", "1999, MCMXCIX", "2000,MM", "2008,MMVIII", "2056,MMLVI", "3000, MMM", "3999, MMMCMXCIX"})
    public void checkCanConvertNumbers1000TO3999ToRomanNumerals(int input, String expectedResult) {
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        //Act and Assert
        Assertions.assertEquals(expectedResult, romanNumeralsConverter.convertToRomanNumeral(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 4000})
    public void checkCanNotEnterAnInvalidNumber(int number) {
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        //Act and Assert
        Assertions.assertThrows(InvalidParameterException.class, () -> romanNumeralsConverter.convertToRomanNumeral(number), "Invalid number. Please enter a number between 1 and 3999.");
    }

}
