import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class RomanNumeralsConverterTest {


    @Disabled
    @Test
    public void setUp(){Assertions.assertEquals(true, true);}


    @Disabled
    @Test
    public void checkCanConvertNumber1ToRomanNumeralI(){

        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        int input = 1;
        String  expectedResult = "I";

        //Act
        String actualResult = romanNumeralsConverter.convertToRomanNumeral(input);

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Disabled
    @Test
    public void checkCanConvertNumber2ToRomanNumeralII(){

        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        int input = 2;
        String  expectedResult = "II";

        //Act
        String actualResult = romanNumeralsConverter.convertToRomanNumeral(input);

        //Assert
        Assertions.assertEquals(expectedResult, actualResult);

    }
     @Disabled
     @Test
     public void checkCanConvertNumber3ToRomanNumeralIII(){

         //Arrange
         RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
         int input = 3;
         String  expectedResult = "III";

         //Act
         String actualResult = romanNumeralsConverter.convertToRomanNumeral(input);

         //Assert
         Assertions.assertEquals(expectedResult, actualResult);

     }

     @ParameterizedTest
     @CsvSource({"1,I", "2,II",  "3,III",  "4,IV"})
        public void checkCanConvertNumbers1To4ToRomanNumeralsIToIVRespectively(int input, String expectedResult){
        //Arrange
         RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
         //Act and Assert
        Assertions.assertEquals(expectedResult, romanNumeralsConverter.convertToRomanNumeral(input));
     }

    @ParameterizedTest
    @CsvSource({"5,V", "6,VI",  "7,VII",  "8,VIII"})
    public void checkCanConvertNumbers5To8ToRomanNumeralsVToVIIIRespectively(int input, String expectedResult){
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        //Act and Assert
        Assertions.assertEquals(expectedResult, romanNumeralsConverter.convertToRomanNumeral(input));
    }

    @ParameterizedTest
    @CsvSource({"9,IX", "10,X", "11,XI" , "14,XIV", "40,XL",  "44,XLIV"})
    public void checkCanConvertNumbers9To44ToRomanNumerals(int input, String expectedResult){
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        //Act and Assert
        Assertions.assertEquals(expectedResult, romanNumeralsConverter.convertToRomanNumeral(input));
    }
}
