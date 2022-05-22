import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;


public class RomanNumeralsConverterTest {


    @Test
    public void setUp(){Assertions.assertEquals(true, true);}


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
}
